package br.com.mentorama.cadastrodeproduto.models;

public class Estoque {
    private String id;
    private Produto prooduto;
    private Integer quantidade;

    public Estoque(String id, Produto prooduto, Integer quantidade) {
        this.id=id;
        this.prooduto = prooduto;
        this.quantidade = quantidade;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Produto getProoduto() {
        return prooduto;
    }

    public void setProoduto(Produto prooduto) {
        this.prooduto = prooduto;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
}
