package br.com.mentorama.modulo9;

public class Customer implements Autenticador {
	private String nome;
	private boolean status;
	private String senha;
	private Integer qtdCompras;

	public Customer(String nome, boolean status, String senha , Integer qtdCompras) {
		this.nome = nome;
		this.status = status;
		this.senha = senha;
		this.qtdCompras = qtdCompras;
	}

	public String getNome() {
		return nome;
	}

	public String getSenha() {
		return senha;
	}
	
	public Integer getQtdCompras() {
		return qtdCompras;
	}

	@Override
	public String toString() {
		return "Customer [nome=" + nome + ", status=" + status + ", senha=" + senha + "]";
	}

	@Override
	public boolean autentica(String senha) {
		if (this.senha != senha) {
			System.out.println("Nao autenticado");
			return false;
		} else {
			System.out.println("Autenticado");
			return false;
		}

	}

}
