package br.com.mentorama.modulo2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Menu menu = new Menu();
		String valorDecisao;
		List<String> categorias = new ArrayList<String>();

		boolean continua = true;
		while (continua) {
			menu.imprimeMenu();
			valorDecisao = menu.decisaoDoUsuario();

			switch (valorDecisao) {
			case "1": {
				System.out.println("Digite o nome da categoria sem espaços");
				Scanner scanNomeDaCategoria = new Scanner(System.in);
				String nomeDaCategoria = scanNomeDaCategoria.next();
				categorias.add(nomeDaCategoria);
				break;
			}
			
			case "2": {
				for (String nome : categorias) {
					System.out.println(nome);
				}
				break;
			}
			
			case "3": {

				if (!categorias.isEmpty()) {
					for (int i = 0; i < categorias.size(); i++) {
						int cont = i + 1;
						System.out.println(cont + " " + categorias.get(i));
					}

					Scanner itemSerDeletado = new Scanner(System.in);

					System.out.println(" Digite o numero do Item que deseja deletar ");
					int valorDoUsuario = itemSerDeletado.nextInt();

					if (valorDoUsuario != 0) {
						int indiceDaLista = valorDoUsuario - 1;
						categorias.remove(indiceDaLista);
						System.out.println("Item Removido da Lista");
					}else {
						System.out.println("Este numero de item não existe na lista");
					}
				} else {
                    System.out.println("Lista vazia não existe categoria para remover");
				}
				break;
			}
			case "0": {
				System.exit(0);
			}
			default: {
				System.out.println("Opção Invalida"); 
			 }
		   }
		}
	}
}