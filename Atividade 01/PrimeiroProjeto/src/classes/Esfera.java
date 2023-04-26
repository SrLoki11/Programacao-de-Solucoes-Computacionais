package classes;

import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do raio da esfera: ");
        double raio = sc.nextDouble();

        double pi = 3.14;

        double comprimento = 2 * pi * raio;
        double area = pi * Math.pow(raio, 2);
        double volume = 3.0 / 4.0 * pi * Math.pow(raio, 3);

        System.out.println("O comprimento da esfera é " + comprimento);
        System.out.println("A área da esfera é " + area);
        System.out.println("O volume da esfera é " + volume);

        sc.close();
    }
}

