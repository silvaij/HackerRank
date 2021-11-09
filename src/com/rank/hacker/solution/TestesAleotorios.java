package com.rank.hacker.solution;

import java.util.StringTokenizer;
import java.util.Vector;

public class TestesAleotorios {
	public static void main(String[] args) {
		String numbers = "1 2 3 4 5 6 7 8";
		String vazio = "";
		int cont = 0;
		StringTokenizer st = new StringTokenizer(vazio, " ");
		if (st.countTokens() > 1) {
			/*
			while (st.hasMoreTokens()) {
				if (cont < 6) {
					System.out.println("Teste " + st.nextToken());
					cont++;
				}
			}*/
		}
		
		Integer codigoEmpresa = 0;
		
		codigoEmpresa = codigoEmpresa == -1 ? null : codigoEmpresa;	
		System.out.println(codigoEmpresa);
		
		System.out.println(fonetizar(numbers));
		
	}
	
	public static String fonetizar(String str) {
        //Fonetiza o string recebido como parametro e devolve
        //um outro string (que e o primeiro fonetizado)

        str = str.toUpperCase(); //todas as letras maiusculas
        //str = removePrep(str); //remove as preposições
        str = removeAccentuation(str); //remove os acentos
        str = removeStrange(str); //remove caracteres diferentes de
        // A-Z, 0-9
        //str = fonetize(str); //fonetiza o texto
        return str;
    }
	
	/*private static String removePrep(String str) {
        int i, j;
        Vector palavra = new Vector();
        palavra = strToVector(str);
        String prep[] = {"DEL", "DA", "DE", "DI", "DO", "DU", "DAS", "DOS", "DEU", "DER", "E", "LA", "LE", "LES", "LOS", "VAN", "VON", "EL"};

        for (i = 0; i < palavra.size(); i++) {
            for (j = 0; j < prep.length; j++) {
                if (palavra.elementAt(i).toString().compareTo(prep[j]) == 0) {
                    palavra.removeElementAt(i);
                    i--;
                    break;
                }
            }
        }
        return vectorToStr(palavra);
    }*/
	
	private static String removeAccentuation(String str) {
        //Substitui os caracteres acentuados por caracteres nao acentuados

        char aux[] = new char[256];
        //matriz de caracteres onde o texto eh manipulado

        int i;  //contador

        aux = str.toCharArray();
        //matriz recebe o texto

        for (i = 0; i < str.length(); i++) {
            //percorre o texto, caracter a caracter

            switch (aux[i]) {
                case 'É':
                    aux[i] = 'E';  //É -> E
                    break;
                case 'Ê':
                    aux[i] = 'E';  //Ê -> E
                    break;
                case 'Ë':
                    aux[i] = 'E';  //Ë -> E
                    break;
                case 'Á':
                    aux[i] = 'A';  //Á -> A
                    break;
                case 'À':
                    aux[i] = 'A';  //À -> A
                    break;
                case 'Â':
                    aux[i] = 'A';  //Â -> A
                    break;
                case 'Ã':
                    aux[i] = 'A';  //Ã -> A
                    break;
                case 'Ä':
                    aux[i] = 'A';  //Ä -> A
                    break;
                case 'Ç':
                    aux[i] = 'C';  //Ç -> C
                    break;
                case 'Í':
                    aux[i] = 'I';  //Í -> I
                    break;
                case 'Ó':
                    aux[i] = 'O';  //Ó -> O
                    break;
                case 'Õ':
                    aux[i] = 'O';  //Õ -> O
                    break;
                case 'Ô':
                    aux[i] = 'O';  //Ô -> O
                    break;
                case 'Ö':
                    aux[i] = 'O';  //Ö -> O
                    break;
                case 'Ú':
                    aux[i] = 'U';  //Ú -> U
                    break;
                case 'Ü':
                    aux[i] = 'U';  //Ü -> U
                    break;
                case 'Ñ':
                    aux[i] = 'N';  //Ñ -> N
                    break;
            }
        }
        str = str.copyValueOf(aux).trim();
        //o string recebe o texto sem acentuacao

        return str;
    }//removeAccentuation
	
	private static String removeStrange(String str) {
        //Elimina os caracteres que NAO sejam alfanumericos ou espacos

        char[] foncmp = new char[256];
        //matriz de caracteres que armazena o texto original

        char[] fonaux = new char[256];
        //matriz de caracteres que armazena o texto modificado

        int i, j, //contadores
                first;  //indica se exitem espacos em branco antes do primeiro
        //caracter: se 1 -> existem, se 0 -> nao existem

        j = 0;
        first = 1;
        fonaux = str.toCharArray();
        //matriz de caracteres recebe o texto

        for (i = 0; i < 256; i++) {
            foncmp[i] = ' ';
        }
        //branqueia a matriz de caracteres

        for (i = 0; i < str.length(); i++) {
            //percorre o texto, caracter a caracter

            //elimina os caracteres que nao forem alfanumericos ou espacos
            if (
            		(  (fonaux[i] >= 'A')  && (fonaux[i] <= 'Z'))
                    || ((fonaux[i] >= 'a') && (fonaux[i] <= 'z'))
                    || ((fonaux[i] >= '0')
                    && (fonaux[i] <=  '9'))
                    || (fonaux[i] == '&')
                    || (fonaux[i] == '_')
                    || ((fonaux[i] == ' ') && first == 0)
                ){
                foncmp[j] = fonaux[i];
                j++;
                first = 0;
            }//if
        }//for
        str = str.valueOf(foncmp);
        //string recebe o texto da matriz de caracteres

        return str.trim();
    }//removeStrange
}
