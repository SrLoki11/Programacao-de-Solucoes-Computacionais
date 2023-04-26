package classes;

import java.util.Scanner;

public class IdadeIndeterminada {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        int idade, somaIdades = 0, contador = 0;
        double media;

        
        System.out.println("Digite as idades (ou um número negativo para encerrar):");
        while (true) {
            idade = sc.nextInt();
            if (idade < 0) {
                break;
            }
            somaIdades += idade;
            contador++;
        }

        if (contador > 0) {
            media = (double) somaIdades / contador;
            System.out.printf("Média das idades: %.2f\n", media);
        } else {
            System.out.println("Nenhuma idade foi informada.");
        }

        sc.close();
    }
}

