package br.com.mentorama.modulo7;

public class ContaSalario extends Conta {
    private int limiteDeSaques;
    public static long count= 0;
	public ContaSalario(long numero, int agencia, String banco, double saldo, int limiteDeSaques) {
		super(numero, agencia, banco, saldo);
		this.limiteDeSaques = limiteDeSaques;		
	}

	@Override
	public double getSaldo() {	
		return saldo;
	}

	@Override
	public double sacar(double value) {
		int limite = limiteDeSaques;
		if (value <= saldo) {
			if (count<limite) {
				 saldo -= value;
			} else {
				System.out.println("Limite de saque excedido");
			}
		} else {
			System.out.println("Saldo Insuficiente");
		}		
		count ++;
		return saldo;
	}

	@Override
	public double depositar(double value) {
		saldo+=value;
		return saldo;
	}

	@Override
	public String toString() {
		return "ContaSalario [limiteDeSaques=" + limiteDeSaques + ", saldo=" + saldo + "]";
	}
	

}
