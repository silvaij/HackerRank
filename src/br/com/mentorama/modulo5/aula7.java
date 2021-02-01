package br.com.mentorama.modulo5;

/*
 * Data de Criação : 12/01/2021
 * Author : Isaque Silva
 * Objetivo: Classe para exemplificar casting 
 * */
public class aula7 {
	public static void main(String[] args) {
		char vetores[]= {'A' , 'P', 'A'};
		String texto = String.valueOf(vetores);
		System.out.println(texto);
		
		long longConvertido = 12;
		String valor = String.valueOf(longConvertido);
		
		System.out.println(valor);
		
		Double valorDouble = Double.valueOf(valor);
		System.out.println(valorDouble);
	}

}
