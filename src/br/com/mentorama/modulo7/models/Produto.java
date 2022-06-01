package br.com.mentorama.modulo7.models;

public class Produto {
	protected int id;
	protected String descricao;

	public Produto(int id, String descricao){
		this.descricao = descricao;
		this.id = id;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", descricao=" + descricao + "]";
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}

}
