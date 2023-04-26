package classes;

import java.util.Scanner;

public class Pratica02 {
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
            System.out.print("Deseja continuar? ");
            resposta = input.next();
        } while (resposta.equalsIgnoreCase("s") || resposta.equalsIgnoreCase("sim"));

        input.close();
    }
}
