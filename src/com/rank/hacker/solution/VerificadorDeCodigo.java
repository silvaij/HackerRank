package com.rank.hacker.solution;

public class VerificadorDeCodigo {
	final private static int SIDE = 9;
	
	public static void main(String[] args) {
		initialize();
	}
	
	public static int setScreenSize(int a, int b){
		int tamanho = a*b;
        return tamanho;
   }
   
   public static void initialize(){
       setScreenSize(SIDE,SIDE);
   }

}
