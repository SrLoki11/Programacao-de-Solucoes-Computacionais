package classes;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int n = sc.nextInt();
        
        if (n < 0) {
            System.out.println("Número inválido. Digite um número inteiro positivo.");
        } else {
            int fat = 1;
            for (int i = 2; i <= n; i++) {
                fat *= i;
            }
            System.out.println(n + "! = " + fat);
        }
        sc.close();
    }
}
