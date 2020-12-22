package com.rank.hacker.solution;


import java.util.Scanner;

public class Solution6 {
	
	static Scanner scan = new Scanner(System.in);
	static String number ;
	
	public static void main(String[] args) {		
		number = scan.next();
		int numberUser = Integer.parseInt(number);
		String[] linhas = new String[numberUser];
				
		int count = 0;
		while(count < numberUser){
			linhas[count] = scan.next();
			if(count > linhas.length) {
				break;
			}
			count++;
		}		 
		scan.close(); 
								 
		for (int i = 0; i < linhas.length; i++) {

			int tamElemento = linhas[i].length();
			char[] caracteres = new char[tamElemento];
					
			for (int j = 0; j < caracteres.length; j++) {			   
			    	 caracteres[j] = linhas[i].charAt(j);								
			}
			for(int a=0;a < caracteres.length;a++) {
				 if (a % 2 == 0) {
			    	System.out.print(caracteres[a]);			    	
				}
			}
			System.out.print(" ");
		    for(int b=0;b<caracteres.length;b++) {
					 if (b % 2 !=0) {				         
						 System.out.print(caracteres[b]);		
					}
			}
		    System.out.println("");
		}
	}
}
