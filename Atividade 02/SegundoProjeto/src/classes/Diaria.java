package classes;

import java.util.Scanner;

public class Diaria {
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o tipo de apartamento (Simples ou Duplo):");
        String tipoApto = input.next();

        System.out.println("Digite o número de diárias:");
        int numDiarias = input.nextInt();

        double valorDiaria;

        
        if (tipoApto.equalsIgnoreCase("simples")) {
            if (numDiarias < 10) {
                valorDiaria = 100.0;
            } else if (numDiarias >= 10 && numDiarias <= 15) {
                valorDiaria = 90.0;
            } else {
                valorDiaria = 80.0;
            }
        } else { // Apto Duplo
            if (numDiarias < 10) {
                valorDiaria = 140.0;
            } else if (numDiarias >= 10 && numDiarias <= 15) {
                valorDiaria = 120.0;
            } else {
                valorDiaria = 100.0;
            }
        }

        
        double valorTotal = valorDiaria * numDiarias;

        System.out.println("Valor a ser pago: R$ " + valorTotal);

        input.close();
    }
}

