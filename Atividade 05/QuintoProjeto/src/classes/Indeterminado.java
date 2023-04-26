package classes;

import java.util.Scanner;

public class Indeterminado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num, maior, menor;

        System.out.print("Digite um número inteiro (ou 0 para sair): ");
        num = input.nextInt();

        if (num == 0) {
            System.out.println("Programa encerrado.");
            System.exit(0);

            input.close();
        }

        maior = num;
        menor = num;

        while (true) {
            System.out.print("Digite um número inteiro (ou 0 para sair): ");
            num = input.nextInt();

            if (num == 0) {
                break;
            }

            if (num > maior) {
                maior = num;
            }

            if (num < menor) {
                menor = num;
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);

        
    }
}
