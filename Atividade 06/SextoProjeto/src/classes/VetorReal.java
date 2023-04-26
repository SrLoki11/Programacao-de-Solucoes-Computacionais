package classes;

import java.util.Scanner;

public class VetorReal {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] numeros = new double[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Digite o número " + (i+1) + ": ");
            numeros[i] = sc.nextDouble();
        }

        System.out.println("\nVetor digitado: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }

        double menor = numeros[0];
        double maior = numeros[0];

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        System.out.println("\nMenor número digitado: " + menor);
        System.out.println("Maior número digitado: " + maior);

        sc.close();
    }
}

