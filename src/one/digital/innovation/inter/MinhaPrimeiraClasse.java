package one.digital.innovation.inter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MinhaPrimeiraClasse {

	public static void main(String[] args) throws IOException {
		    /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	    
		    StringTokenizer st = new StringTokenizer(br.readLine());	    
		    int a = Integer.parseInt(st.nextToken());	    
		    int b = Integer.parseInt(st.nextToken());	    
		    int total = (a + b)  ; // Altere o valor da variável com o cálculo esperado	    
		    System.out.println("X = " + total);*/
		    
		    desafio();
		    valoresPostivos();

	}
	
	public static void desafio() {
	       Scanner leitor = new Scanner(System.in);
	        int x = leitor.nextInt();
	        int cont = 0;
	        while (cont < 6 ) {
	        	if (x%2==1) {
	        		System.out.println(x);
	        		cont++;
	        	}
	    		x++;
	        }	    
	}
	
	public static void valoresPostivos() {
		Scanner leitor = new Scanner(System.in);
		//declare suas variaveis corretamente
		        int pares         = 0;
		        int impares       = 0;
		        int positivos     = 0;
		        int negativos     = 0;
		        int valorDigitado = 0;

		//continue a solução
		        for (int i = 0 ; i<5 ; i++) {
		        	valorDigitado = leitor.nextInt();
		        	
		        	if(valorDigitado % 2 == 0) {
		        		pares++;
		        	}else {
		        		impares++;
		        	}
		        	
		        	if(valorDigitado > 0) {
		        		positivos++;
		        	}else if(valorDigitado < 0) {
		        		negativos++;
		        	}
		        }
		//insira suas variaveis corretamente
		        System.out.println( pares+ " valor(es) par(es)");
		        System.out.println( impares+ " valor(es) impar(es)");
		        System.out.println( positivos+ " valor(es) positivo(s)");
		        System.out.println( negativos+ " valor(es) negativo(s)");
		    }
			
	}























