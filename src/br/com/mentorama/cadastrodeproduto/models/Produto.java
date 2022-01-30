package br.com.mentorama.cadastrodeproduto.models;

import java.time.LocalDate;
import java.util.Date;

public class Produto {
	private Integer id;
	private String descricao;
	private Double preco;
	private LocalDate dataValidade;

	public Produto(String descricao, Double preco, LocalDate dataValidade) {
		this.descricao = descricao;
		this.preco = preco;
		this.dataValidade = dataValidade;
	}

	public Produto() {};

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public LocalDate getDataValidade() throws Exception {
		return dataValidade;
	}

}
