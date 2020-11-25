package br.com.mentorama;

import java.util.Scanner;

public class Menu {
	public void imprimeMenu() {
		System.out.println("------- BEM VINDO AO SEU TO DO LIST----------");
		System.out.println(" Digite o numero do que deseja fazer: ");
		System.out.println(" 1) Adicionar categoria ");
		System.out.println(" 2) Listar todas Categorias");
		System.out.println(" 3) Remover item da lista ");
		System.out.println(" 0) Sair do Programa");
		
	}
	
	public String decisaoDoUsuario() {		
		Scanner decisaoDoUsuario = new Scanner(System.in);
		String valorDecisao = decisaoDoUsuario.next();
		return valorDecisao;
	}
}
