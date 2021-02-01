package br.com.mentorama.modulo5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {

	public static void main(String[] args) {
	    String regex = "\\b([0-9]){3}\\.([0-9]){3}\\.([0-9]){3}\\-([0-9]){2}" ;
	    String cpf = "111.111.111-00";
	    
	    Pattern padrao = Pattern.compile(regex);
	    Matcher verificador = padrao.matcher(cpf);
	    System.out.println(verificador.find());
	}

}
