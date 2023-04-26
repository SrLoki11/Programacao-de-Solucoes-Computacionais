package classes;

import java.util.Scanner;


public class MatrizPar {
    
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        
        int[][] matriz = new int[5][5];
        
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Digite o valor da posição (%d,%d): ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }
        
        
        
        System.out.println("Elementos nas posições em que o índice da linha é par e o índice da coluna é ímpar:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i % 2 == 0 && j % 2 != 0) {
                    System.out.print(matriz[i][j] + " ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        
        sc.close();
    }
}
