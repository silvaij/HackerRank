package br.com.mentorama.modulo5;

import br.com.mentorama.modulo7.models.Produto;

import java.util.Scanner;

public class aula15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual a descrição do produto : ");
        String descricao = scanner.nextLine();

        System.out.println("Qual o ID do produto ? : ");
        int id = scanner.nextInt();

        Produto novoProduto = new Produto(id,descricao);

        System.out.println("PRODUTO CRIADO COM SUCESSO: ");
        System.out.println("-- ID: "+novoProduto.getId());
        System.out.println("-- PRODUTO "+ novoProduto.getDescricao());
    }
}
