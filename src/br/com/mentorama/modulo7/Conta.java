package br.com.mentorama.modulo7;

public abstract class Conta {
	private long numero;
	private int agencia;
	private String banco;
	protected double saldo;

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public abstract  double getSaldo();
	
	public abstract double sacar(double value);
	
	public abstract  double depositar(double value);
	

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * @param numero
	 * @param agencia
	 * @param banco
	 * @param saldo
	 */
	public Conta(long numero, int agencia, String banco, double saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.banco = banco;
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Conta [numero=" + numero + ", agencia=" + agencia + ", banco=" + banco + ", saldo=" + saldo + "]";
	}

}
