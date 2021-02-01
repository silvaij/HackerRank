package com.rank.hacker.solution;

import java.util.Scanner;

public class ParOuImpar {

	public static void main(String[] args) {
		System.out.println("DIGITE UM NUMERO E TECLE ENTER");
		Scanner scan = new Scanner(System.in);
		String n = scan.next();
		Integer NumeroDoUsuario ;
		NumeroDoUsuario = Integer.parseInt(n);
		
		if(NumeroDoUsuario%2 ==0) {
			System.out.println("PAR");
		}else {
			System.out.println("Impar");
		}
		
		scan.close();
	}
}
