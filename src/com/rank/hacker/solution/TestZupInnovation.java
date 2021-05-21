package com.rank.hacker.solution;

import java.util.Scanner;

public class TestZupInnovation {

	public static void main(String[] args) {
		    int i = 0;
		    Scanner sc = new Scanner(System.in);
		    System.out.print("Digite um texto:");
		    while(sc.hasNext()){
		      i++;
		      System.out.println("Token: "+sc.next());
		    }
		    sc.close(); //Encerra o scanner
		  }
	}


