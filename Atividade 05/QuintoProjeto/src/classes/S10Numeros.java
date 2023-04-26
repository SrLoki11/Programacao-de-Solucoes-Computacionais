package classes;

import java.util.Scanner;

public class S10Numeros {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int numero, menor = Integer.MAX_VALUE, maior = Integer.MIN_VALUE;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o %dº número: ", i);
            numero = input.nextInt();

            if (numero < menor) {
                menor = numero;
            }

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.printf("O menor número é: %d\n", menor);
        System.out.printf("O maior número é: %d\n", maior);
        
    }
}

