package br.com.mentorama.modulo1;

import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		boolean repetidor = true;
		while (repetidor) {
			System.out.println("|   MENU   |");
			System.out.println("|Opcoes::   |");
			System.out.println("|       1.Opcao 1  |");
			System.out.println("|       2.Opcao 2  |");
			System.out.println("|       3.Opcao 3  |");
			System.out.println("|       4.Opcao 0 ( SAIR DO PROGRAMA ) ");
			Scanner menu = new Scanner(System.in);

			System.out.println(" Selecione uma opcao: ");
			String opcao = menu.next();

			switch (opcao) {
			case "1":
				System.out.println("Opcao 1 selecionada");
				break;
			case "2":
				System.out.println("Opcao 2 selecionada");
				break;
			case "3":
				System.out.println("Opcao 3 selecionada");
				break;
			case "0":
				System.out.println("Programa encerrado!");
				System.exit(0);
				break;
			default: {
				System.out.println("Opcao INVALIDA");
			}

			}
		}
	}
}
