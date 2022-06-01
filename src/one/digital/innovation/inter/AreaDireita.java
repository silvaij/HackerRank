package one.digital.innovation.inter;

import java.util.Scanner;

public class AreaDireita {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        char O = leitor.next().toUpperCase().charAt(0);
        double[][] M = new double[12][12];

        for (int i = 0; i < 12; i++) {
            for (int j = 0 ; j < 12 ; j++) {
                M[i][j] = leitor.nextDouble();
            }
        }

        for (int i = 0;i < 12 ; i++) {
            for (int j = 0 ; j < 12 ; j++) {
                if ((i > 0 && i < 11) && (j >=7 && j<=11)){
                    soma = soma + M[i][j];
                }
            }
        }

        if (O == 'M') soma /= 30;
        System.out.println(String.format("%.1f", soma));
    }

    // Diário de classe teste de enconding
}


