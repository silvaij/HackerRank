package br.com.mentorama.modulo9;

@FunctionalInterface
public interface Autenticador {
    String senha = "Palmeiras";
	public abstract  boolean autentica(String senha);    	
}
