package com.rank.hacker.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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
		String[] nomes = new String[n];
		Map<String, Integer> bookPhone = new HashMap<String, Integer>();
        
		// pegando nome e telefone adicionando da lista de telefone
		for (int i = 0; i < n; i++) {
			String name = in.next();
			Integer phone = in.nextInt();
			in.nextLine();
			bookPhone.put(name, phone);
		}
		
		int cont = 0;
		while (in.hasNext()) { //enquanto existir proxima linha
			String s = in.next();			
			nomes[cont] = s;			
			cont++;			
			if(cont>=n){				
				break;
			}else if() {
				
			} // fim do if			
		} //fim do while
		
		for (int i = 0; i < nomes.length; i++) {
			 String nome = nomes[i];					
	       if (bookPhone.get(nome) == null) {
				System.out.println("Not found");
			}else{
				System.out.println(nome + "=" + bookPhone.get(nome));
			}
		}
		in.close();
	}
}
