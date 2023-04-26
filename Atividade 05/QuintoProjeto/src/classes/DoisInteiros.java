package classes;

import java.util.Scanner;

public class DoisInteiros {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número inteiro positivo: ");
        int num1 = sc.nextInt();

        System.out.print("Informe o segundo número inteiro positivo: ");
        int num2 = sc.nextInt();

        
        if (num1 > num2) {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        
        System.out.print("Números inteiros entre " + num1 + " e " + num2 + ": ");

        for (int i = num1 + 1; i < num2; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        sc.close();
    }
}
