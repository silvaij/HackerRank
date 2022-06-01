package br.com.mentorama.cadastrodeproduto.validadores;

import br.com.mentorama.cadastrodeproduto.models.PedidoVenda;

public class ValidadorQuantidade implements IValidadorPedidosVenda {
    @Override
    public String validar(PedidoVenda pedidoVenda) {
        if(pedidoVenda.getQuantidade() > pedidoVenda.getEstoque().getQuantidade()){
            return "Quantidade indisponivel no estoque";
        }
        return null;
    }
}
