package br.com.mentorama.cadastrodeproduto.models;

public abstract class User {
	private int id;
	private String nome;
	private TipoUsuario tipoUsuario;
	
	public User(String nome ,TipoUsuario tipoUsuario) {		
		this.nome = nome;
		this.tipoUsuario = tipoUsuario;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUsuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

}
