package com.rank.hacker.solution;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution8_1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String[] nomes = new String[n];
		Map<String, Integer> bookPhone = new HashMap<String, Integer>();
        
		for (int i = 0; i < n; i++) {
			String name = in.next();
			Integer phone = in.nextInt();
			bookPhone.put(name, phone);
		}
		
				
		 while(in.hasNext()){
	            String s = in.next();
	            String verificaElemento=in.nextLine();
	            if(bookPhone.get(s) == null) {
	            	System.out.println("Not found");	                 
	            }else{
	                System.out.println(s + "=" + bookPhone.get(s));	                
	            }	            
	        }
		 
	}
	
	public static void teste(Scanner in) {
		String verificaElemento = in.nextLine();		
	}

}
