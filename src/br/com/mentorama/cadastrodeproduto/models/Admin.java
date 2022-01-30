package br.com.mentorama.cadastrodeproduto.models;

public class Admin extends User {
	public Admin(String nome) {
		super(nome,TipoUsuario.ADMIN);
	}
}
