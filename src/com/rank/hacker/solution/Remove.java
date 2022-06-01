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
			case 'É':
				aux[i] = 'E';
				break;
			case 'È':
				aux[i] = 'E';
				break;
			case 'Ê':
				aux[i] = 'E';
				break;
			case 'é':
				aux[i] = 'E';
				break;
			case 'è':
				aux[i] = 'E';
				break;
			case 'ê':
				aux[i] = 'E';
				break;
			case 'í':
				aux[i] = 'I';
				break;
			case 'ì':
				aux[i] = 'I';
				break;
			case 'î':
				aux[i] = 'I';
				break;
			case 'Ì':
				aux[i] = 'I';
				break;
			case 'Í':
				aux[i] = 'I';
				break;
			case 'Î':
				aux[i] = 'I';
				break;
			case 'Ó':
				aux[i] = 'O';
				break;
			case 'Ò':
				aux[i] = 'O';
				break;
			case 'Õ':
				aux[i] = 'O';
				break;
			case 'Ô':
				aux[i] = 'O';
				break;
			case 'ó':
				aux[i] = 'O';
				break;
			case 'ò':
				aux[i] = 'O';
				break;
			case 'õ':
				aux[i] = 'O';
				break;
			case 'ô':
				aux[i] = 'O';
				break;
			case 'Ú':
				aux[i] = 'U';
				break;
			case 'Ù':
				aux[i] = 'U';
				break;
			case 'Û':
				aux[i] = 'U';
				break;
			case 'û':
				aux[i] = 'U';
				break;
			case 'ù':
				aux[i] = 'U';
				break;
			case 'ú':
				aux[i] = 'U';
				break;
			case 'à':
				aux[i] = 'A';
				break;
			case 'á':
				aux[i] = 'A';
				break;
			case 'â':
				aux[i] = 'A';
				break;
			case 'ã':
				aux[i] = 'A';
				break;
			case 'Á':
				aux[i] = 'A';
				break;
			case 'À':
				aux[i] = 'A';
				break;
			case 'Â':
				aux[i] = 'A';
				break;
			case 'Ã':
				aux[i] = 'A';
				break;
			case 'Ç':
				aux[i] = 'C';
				break;
			case 'ç':
				aux[i] = 'C';
				break;
			}
		}
		str = str.copyValueOf(aux).trim();

		return str.toUpperCase();
	}
}
