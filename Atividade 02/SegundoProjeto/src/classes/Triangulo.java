package classes;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lado1, lado2, lado3;

        System.out.print("Digite o primeiro lado: ");
        lado1 = input.nextInt();

        System.out.print("Digite o segundo lado: ");
        lado2 = input.nextInt();

        System.out.print("Digite o terceiro lado: ");
        lado3 = input.nextInt();

        if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Equilátero");
        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Isósceles");
        } else {
            System.out.println("Escaleno");

            input.close();
        }
    }
}

