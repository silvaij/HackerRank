package br.com.mentorama.modulo6;

import java.util.ArrayList;

public class Colecoes {
   public static void main(String[] args) {
	   ArrayList<String> colecaoVeiculos = new ArrayList<>();
	   
	   colecaoVeiculos.add("Carro");
	   colecaoVeiculos.add("Moto");
	   colecaoVeiculos.add("Barco");
	   colecaoVeiculos.add("Aviao");
	   
	   for(String veiculo: colecaoVeiculos) {
		   System.out.println(veiculo);
	   }
	   
	
    }
}
