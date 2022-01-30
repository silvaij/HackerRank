package br.com.mentorama.cadastrodeproduto.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.mentorama.cadastrodeproduto.models.Produto;

public class ProdutosDB {
     private Map<Integer,Produto> produtosMap = new HashMap<>();

     public List<Produto> getProdutosList(){
        List<Produto> produtosList = new ArrayList<>();
         for ( Map.Entry<Integer,Produto> produto : produtosMap.entrySet()) {
               produtosList.add(produto.getValue());
         }
         return produtosList;
     }
     
     public void addNovoProduto(Produto produto) {
    	 int id = produtosMap.size()+1;
    	 produto.setId(id);
         produtosMap.put(id, produto);
     }

     public Produto getProdutoPorId(Integer id){
         return produtosMap.get(id);
     }
}
