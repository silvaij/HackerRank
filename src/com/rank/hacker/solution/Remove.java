package com.rank.hacker.solution;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Remove {
	public static void main(String[] args) throws IOException {

		Integer num = 0;
		String msg = null;
		Integer maxLen = 0;
		String input;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] alfabeto = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
				'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

		num = Integer.parseInt(br.readLine());
		input = br.readLine();
		maxLen = input.length();

		if ((maxLen <= 1000) && (num > 0) && (num <= 26)) {
			msg = removeAcento(input);
			char aux[] = new char[msg.length()] ;
			int i = 0;
			int j = 0;
			for (i = 0; i < msg.length(); i++) {
				    aux[i] = msg.charAt(i) ;
				    for(j = 0 ; j < alfabeto.length-1 ; j++) {
				    	int count = j+num;
				    	if((aux[i] == alfabeto[j])&&(count<26)) {
				    		 aux[i] = alfabeto[j+num];
				    	}
				    }
				  } 
			msg = msg.copyValueOf(aux).trim();
			
		} else {
			System.out.println("ERRO");
		}

		System.out.println(msg);

	}

	public static String removeAcento(String str) {
		char aux[] = new char[256];
		aux = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			switch (aux[i]) {
			case '�':
				aux[i] = 'E';
				break;
			case '�':
				aux[i] = 'E';
				break;
			case '�':
				aux[i] = 'E';
				break;
			case '�':
				aux[i] = 'E';
				break;
			case '�':
				aux[i] = 'E';
				break;
			case '�':
				aux[i] = 'E';
				break;
			case '�':
				aux[i] = 'I';
				break;
			case '�':
				aux[i] = 'I';
				break;
			case '�':
				aux[i] = 'I';
				break;
			case '�':
				aux[i] = 'I';
				break;
			case '�':
				aux[i] = 'I';
				break;
			case '�':
				aux[i] = 'I';
				break;
			case '�':
				aux[i] = 'O';
				break;
			case '�':
				aux[i] = 'O';
				break;
			case '�':
				aux[i] = 'O';
				break;
			case '�':
				aux[i] = 'O';
				break;
			case '�':
				aux[i] = 'O';
				break;
			case '�':
				aux[i] = 'O';
				break;
			case '�':
				aux[i] = 'O';
				break;
			case '�':
				aux[i] = 'O';
				break;
			case '�':
				aux[i] = 'U';
				break;
			case '�':
				aux[i] = 'U';
				break;
			case '�':
				aux[i] = 'U';
				break;
			case '�':
				aux[i] = 'U';
				break;
			case '�':
				aux[i] = 'U';
				break;
			case '�':
				aux[i] = 'U';
				break;
			case '�':
				aux[i] = 'A';
				break;
			case '�':
				aux[i] = 'A';
				break;
			case '�':
				aux[i] = 'A';
				break;
			case '�':
				aux[i] = 'A';
				break;
			case '�':
				aux[i] = 'A';
				break;
			case '�':
				aux[i] = 'A';
				break;
			case '�':
				aux[i] = 'A';
				break;
			case '�':
				aux[i] = 'A';
				break;
			case '�':
				aux[i] = 'C';
				break;
			case '�':
				aux[i] = 'C';
				break;
			}
		}
		str = str.copyValueOf(aux).trim();

		return str.toUpperCase();
	}
}
