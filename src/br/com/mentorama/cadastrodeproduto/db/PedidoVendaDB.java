package br.com.mentorama.cadastrodeproduto.db;

import br.com.mentorama.cadastrodeproduto.models.PedidoVenda;

import java.util.ArrayList;
import java.util.List;

public class PedidoVendaDB {
    private List<PedidoVenda> pedidoVendaList = new ArrayList<>();

    public List<PedidoVenda> getPedidoVendaList() {
        return pedidoVendaList;
    }

    public void addNovoPedidoVenda(PedidoVenda pedido){
        int idPedido = pedidoVendaList.size()+1;
        pedido.setId(idPedido);
        pedidoVendaList.add(pedido);
    }
}
