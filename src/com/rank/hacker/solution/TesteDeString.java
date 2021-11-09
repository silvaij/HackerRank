package com.rank.hacker.solution;

import java.util.GregorianCalendar;

public class TesteDeString {

	public static void main(String[] args) {
        System.gc();
		
		long start = new GregorianCalendar().getTimeInMillis();
		long startMemory= Runtime.getRuntime().freeMemory();
		
		//StringBuffer sb = new StringBuffer();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i<10000000; i++){
			sb.append(":").append(i);
		}
		
		long end = new GregorianCalendar().getTimeInMillis();
		long endMemory = Runtime.getRuntime().freeMemory();
		System.out.println("Tempo Gasto:"+(end-start));
		System.out.println("Memoria consumida:"+(startMemory-endMemory));
		
		
	}

}
