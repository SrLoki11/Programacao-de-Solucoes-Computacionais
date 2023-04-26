package classes;

import java.util.Scanner;

public class MatrizInvertida {

    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        int[][] matrizOriginal = new int[5][5];
        int[][] matrizTransposta = new int[5][5];

        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Digite o elemento da posição [%d][%d]: ", i, j);
                matrizOriginal[i][j] = sc.nextInt();
            }
        }

       
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrizTransposta[j][i] = matrizOriginal[i][j];
            }
        }

        
        System.out.println("Matriz transposta:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

