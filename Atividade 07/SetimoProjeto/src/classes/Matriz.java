package classes;


import java.util.Scanner;

public class Matriz {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        
        int[][] matriz = new int[5][5];

       
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("Digite o valor da posição [%d][%d]: ", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }

        
        
        System.out.println("\nMatriz informada:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }

        sc.close();
    }
}

