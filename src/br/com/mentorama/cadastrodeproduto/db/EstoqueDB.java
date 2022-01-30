package br.com.mentorama.cadastrodeproduto.db;

import br.com.mentorama.cadastrodeproduto.models.Estoque;
import br.com.mentorama.cadastrodeproduto.models.Produto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EstoqueDB {

    private Map<String, Estoque> estoqueDBMap = new HashMap<>();

    public Map<String, Estoque> getEstoqueDBMap() {
        return estoqueDBMap;
    }

    public void addNovoEstoque(Estoque estoque){
        estoqueDBMap.put(estoque.getId(),estoque);
    }

    public List<Estoque> getEstoquesList(){
        List<Estoque> estoquesList = new ArrayList<>();
        for ( Map.Entry<String,Estoque> estoque : estoqueDBMap.entrySet()) {
            estoquesList.add(estoque.getValue());
        }
        return estoquesList;
    }
}
