package br.com.mentorama.cadastrodeproduto.models;

public class Cliente extends User {
    public Cliente(String nome) {
    	super(nome, TipoUsuario.CLIENTE);
    }
}
