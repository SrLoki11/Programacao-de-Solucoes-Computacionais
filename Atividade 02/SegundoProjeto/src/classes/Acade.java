package classes;

import java.util.Scanner;

public class Acade {
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a idade: ");
        int idade = scanner.nextInt();

        System.out.print("Informe o sexo (M/F): ");
        char sexo = scanner.next().charAt(0);

        double mensalidade = 0;

        
        if (sexo == 'M') {
            if (idade <= 15) {
                mensalidade = 60.00;
            } else if (idade >= 16 && idade <= 18) {
                mensalidade = 75.00;
            } else if (idade >= 19 && idade <= 30) {
                mensalidade = 90.00;
            } else if (idade >= 31 && idade <= 40) {
                mensalidade = 85.00;
            } else {
                mensalidade = 80.00;
            }
        } else if (sexo == 'F') {
            if (idade <= 18) {
                mensalidade = 60.00;
            } else if (idade >= 19 && idade <= 25) {
                mensalidade = 90.00;
            } else if (idade >= 26 && idade <= 40) {
                mensalidade = 85.00;
            } else {
                mensalidade = 80.00;
            }
        }

        System.out.printf("A mensalidade a ser paga é R$ %.2f", mensalidade);

        scanner.close();
    }
}

