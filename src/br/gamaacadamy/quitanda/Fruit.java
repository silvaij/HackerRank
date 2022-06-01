package br.gamaacadamy.quitanda;

import br.gamaacadamy.quitanda.SeasonsYear;

import java.util.ArrayList;
import java.util.List;

public class Fruit {
    public List<String> periodo = new ArrayList<>();
    SeasonsYear estacoesDoAno ;
    String str ;
    private String name;

    public static void main(String[] args) {
       Fruit banana = new Fruit();
       banana.setName("BANANA DA TERRA");
       banana.adicionaEstacao(SeasonsYear.INVERNO);
       banana.adicionaEstacao(SeasonsYear.VERAO);
       banana.imprimeEstacoes(banana);
    }

    public void imprimeEstacoes(Fruit fruta){
        for (int i = 0 ; i<= periodo.size()-1 ; i++){
            System.out.println("FRUTA: "+fruta.getName()+" ESTACAO DE COLHEITA: "+periodo.get(i)) ;
        }
    }

    //Getter and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //logica
    public boolean isPeriodoColheita (Fruit fruta) {
        return true;
    }

    /*
      @param metodo que pega as estações do SeasonsYear
     */
    public void adicionaEstacao( SeasonsYear estacoesDoAno){
        str = estacoesDoAno.getSeasons();
        periodo.add(str);
    }

}
