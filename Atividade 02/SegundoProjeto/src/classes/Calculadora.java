package classes;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        double num1, num2, result;
        int opcao;

        System.out.print("Digite o primeiro número: ");
        num1 = input.nextDouble();

        System.out.print("Digite o segundo número: ");
        num2 = input.nextDouble();

        System.out.println("Escolha uma das opções abaixo:");
        System.out.println("1 - Somar os dois números.");
        System.out.println("2 - Multiplicar os dois números.");
        System.out.println("3 - Subtrair o número maior pelo número menor.");
        System.out.println("4 - Dividir o primeiro número pelo segundo.");

        opcao = input.nextInt();

        switch (opcao) {
            case 1:
                result = num1 + num2;
                System.out.println("Resultado: " + result);
                break;
            case 2:
                result = num1 * num2;
                System.out.println("Resultado: " + result);
                break;
            case 3:
                if (num1 == num2) {
                    System.out.println("Resultado: 0");
                } else if (num1 > num2) {
                    result = num1 - num2;
                    System.out.println("Resultado: " + result);
                } else {
                    result = num2 - num1;
                    System.out.println("Resultado: " + result);
                }
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Não é possível dividir por zero.");
                } else {
                    result = num1 / num2;
                    System.out.println("Resultado: " + result);
                }
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        input.close();
    }
}
