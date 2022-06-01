package br.com.mentorama.cadastrodeproduto.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.mentorama.cadastrodeproduto.models.Produto;

public class ProdutosDB {
     private Map<String,Produto> produtosDBMap = new HashMap<>();

     public List<Produto> getProdutosList(){
        List<Produto> produtosList = new ArrayList<>();
         for ( Map.Entry<String,Produto> produto : produtosDBMap.entrySet()) {
               produtosList.add(produto.getValue());
         }
         return produtosList;
     }
     
     public void addNovoProduto(Produto produto) {
    	 String id = String.valueOf(produtosDBMap.size()+1);
         produto.setId(Integer.parseInt(id));
         produtosDBMap.put(id, produto);
     }

     public Produto getProdutoPorId(String id){
    	 return produtosDBMap.get(id);
     }

}
