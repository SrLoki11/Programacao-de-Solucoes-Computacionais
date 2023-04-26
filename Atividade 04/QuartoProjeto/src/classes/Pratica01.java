package classes;

import java.util.Scanner;

public class Pratica01 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int numero1, numero2, soma;
        String resposta;

        do {
            System.out.print("Informe o primeiro número: ");
            numero1 = input.nextInt();
            System.out.print("Informe o segundo número: ");
            numero2 = input.nextInt();
            soma = numero1 + numero2;
            System.out.println("A soma é: " + soma);
            System.out.print("Deseja continuar? (S)im ou (N)ão: ");
            resposta = input.next();
        } while (resposta.equalsIgnoreCase("s"));

        input.close();
    }
}
