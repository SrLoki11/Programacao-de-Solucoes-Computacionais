package classes;

import java.util.Arrays;

public class MatrizDiagonal {
    public static void main(String[] args) {
        
        int[][] matriz = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        
        int temp;

        
        System.out.println("Matriz original:");
        for (int[] linha : matriz) {
            System.out.println(Arrays.toString(linha));
        }

        
        for (int i = 0; i < matriz.length; i++) {
            temp = matriz[i][i];
            matriz[i][i] = matriz[i][matriz.length - 1 - i];
            matriz[i][matriz.length - 1 - i] = temp;
        }

       
        System.out.println("\nMatriz resultante:");
        for (int[] linha : matriz) {
            System.out.println(Arrays.toString(linha));
        }
    }
}


