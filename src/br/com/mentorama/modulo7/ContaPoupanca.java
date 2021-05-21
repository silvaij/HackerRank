package br.com.mentorama.modulo7;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class ContaPoupanca extends Conta {
	private Integer diaAniversario;
	private double taxaDeJuros;
	/**
	 * @parametros herdados da Class Conta.
	 * @param numero
	 * @param agencia
	 * @param banco
	 * @param saldo
	 */
	public ContaPoupanca(long numero, int agencia, String banco, double saldo, Integer diaAniversario,
			double taxaDeJuros) {
		super(numero, agencia, banco, saldo);
		this.diaAniversario = diaAniversario;
		this.taxaDeJuros = taxaDeJuros;
		verificaAniversario();
	}
	
	public double verificaAniversario() {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd");
		LocalDate hoje = LocalDate.now();
		String dataEmString = hoje.format(formato);
		Integer converteDia = Integer.valueOf(dataEmString);

		if ((this.diaAniversario != 0) && (this.diaAniversario <= 31)) {
			if (this.diaAniversario >= converteDia) {
				saldo = (saldo * taxaDeJuros) + saldo;
			}
		} else {
			System.out.println("Dia inválido");
		}

		return saldo;
	}
	@Override
	public double getSaldo() {
		return this.saldo;
	}
	@Override
	public double sacar(double value) {
		if (value <= saldo) {
			saldo -= value;
		} else {
			System.out.println("Saldo insuficiente verfique seu saldo");
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
		return "ContaPoupanca [diaAniversario=" + diaAniversario + ", taxaDeJuros=" + taxaDeJuros + ", saldo=" + saldo
				+ "]";
	}
}
