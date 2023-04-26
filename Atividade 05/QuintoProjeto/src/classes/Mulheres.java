package classes;

import java.util.Scanner;

public class Mulheres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countFemale = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Informe a idade da pessoa " + i + ": ");
            int age = scanner.nextInt();
            System.out.print("Informe o sexo da pessoa " + i + " (M/F): ");
            String sex = scanner.next();

            if (sex.equalsIgnoreCase("F") && age >= 20 && age <= 40) {
                countFemale++;
            }
        }

        System.out.println("Existem " + countFemale + " pessoas do sexo feminino entre 20 e 40 anos.");

        scanner.close();
    }
}

