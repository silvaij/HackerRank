package com.rank.hacker.solution;

public class Variavel {
	private int x =0;
	public static void main(String[] args) {
		new Variavel().test();
		System.out.println(Math.sqrt(-4));
	}
	
	private int f(int x) {
		return ++x;
	}
	
	private int g(int y) {
		return x++;
	}
	
	private void test() 
	{
		
		System.out.println(f(x) == f(x) ? "f" : "#");
		System.out.println(f(x) == f(x) ? "g" : "#");
	}
	
}

