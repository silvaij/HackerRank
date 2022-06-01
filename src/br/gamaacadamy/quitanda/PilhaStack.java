package br.gamaacadamy.quitanda;

import java.util.Stack;

public class PilhaStack {
    public static void main(String[] args) {

        Stack<Integer> pilha = new Stack<>();
        Integer indicePilha = pilha.size();

        pilha.push(1);
        pilha.push(2);
        pilha.push(3);
        pilha.push(4);
        pilha.push(5);

        for (int i = 0;  i <= pilha.size()-1 ; i++) {
            Integer num = pilha.get(i);
            System.out.println("Numero na posicao "+i+" é "+num);
        }

    }



}
