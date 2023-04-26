package classes;

import java.util.Scanner;

public class VetorElemento {
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[10];

        
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número: ", i+1);
            numeros[i] = sc.nextDouble();
        }

        
        System.out.print("Números armazenados nas posições pares do vetor: ");
        for (int i = 0; i < numeros.length; i += 2) {
            System.out.print(numeros[i] + " ");
        }
        System.out.println();

        sc.close();
    }
}

