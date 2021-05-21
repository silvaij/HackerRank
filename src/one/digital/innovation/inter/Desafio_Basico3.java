package one.digital.innovation.inter;

import java.util.Scanner;

public class Desafio_Basico3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num = entrada.nextInt();
		int sentinela = num;
		if (num % 2 == 0) {
			for (int i = 0; i <= sentinela; i++) { // complete seu codigo aqui
				if (num % 2 != 0) {
					System.out.println(i);
				}
				num--;
			}
		} else {
			for (int i = 1; i <= sentinela; i++) { // complete seu codigo aqui
				if (num % 2 != 0) {
					System.out.println(i);
				}
				num--;
			}
		}
	}
}
