package com.rank.hacker.solution;

import java.util.*;
import java.io.*;

/* 
 * Autor:Isaque Silva
 * Data - 12-12-2020
 * Hora - 09:48 am
 * Problema : Criar um aplicativo que vai ler a antrada do teclado e adicionar nome + Telefone
 * Conceito : Utilizar Hash Map , chave e valor.
 * 
 * */
public class Solution8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		Map<String, Integer> bookPhone = new HashMap<String, Integer>();        
		// pegando nome e telefone adicionando da lista de telefone
		for (int i = 0; i < n; i++) {
			String name = in.next();
			Integer phone = in.nextInt();
			in.nextLine();
			bookPhone.put(name, phone);
		}		
		// armazenando os nomes a serem consultados	
		while (in.hasNext()) { //enquanto existir proxima linha
			String consulta=in.next();
			
			
			
			
			
			
			if(bookPhone.get(consulta)==null) {
				System.out.println("Not Found");
			}else {
				System.out.println(consulta+ "=" +bookPhone.get(consulta));
			}	
		}
		in.close();
	}
}



















