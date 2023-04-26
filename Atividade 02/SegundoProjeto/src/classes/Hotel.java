package classes;

import java.util.Scanner;

public class Hotel {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int numDiarias;
        double valorDiaria = 500.0;
        double taxaServicos;
        double total;

        System.out.print("Informe o número de diárias: ");
        numDiarias = sc.nextInt();

        if (numDiarias < 15) {
            taxaServicos = 15.0 * numDiarias;
        } else if (numDiarias == 15) {
            taxaServicos = 10.0 * numDiarias;
        } else {
            taxaServicos = 5.0 * numDiarias;
        }

        total = (numDiarias * valorDiaria) + taxaServicos;
        System.out.printf("O total a ser pago é de: R$ %.2f", total);

        sc.close();
    }
}

