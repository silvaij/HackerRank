package br.com.mentorama.modulo7;

public class ContaCorrente extends Conta {
	private double chequeEspecial;

	public ContaCorrente(long numero, int agencia, String banco, double saldo, double chequeEspecial) {
		super(numero, agencia, banco, saldo);
		this.chequeEspecial = chequeEspecial;
	}
	@Override
	public double getSaldo() {
		return this.saldo;
	}

	@Override
	public double sacar(double value) {
		double limite = saldo + chequeEspecial;
		if (value <= limite) {
			saldo -= value;
		} else {
			System.out.println("Saque maior que o limite da conta entre em contato com Gerente da Conta!.");
		}
		return saldo;
	}

	@Override
	public double depositar(double value) {
		saldo += value;
		return saldo;
	}
	
	@Override
	public String toString() {
		return "ContaCorrente [" + "chequeEspecial=" + chequeEspecial + "]";
	}

}
