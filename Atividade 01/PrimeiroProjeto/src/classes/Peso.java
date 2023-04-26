package classes;

import java.util.Scanner;

public class Peso {
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o peso da pessoa: ");
        double peso = sc.nextDouble();

        double pesoEngordar = peso * 1.15;
        double pesoEmagrecer = peso * 0.8;

    
        System.out.println("Se a pessoa engordar 15%, ficará com " + pesoEngordar + " kg.");
        
        System.out.println("Se a pessoa emagrecer 20%, ficará com " + pesoEmagrecer + " kg.");

        sc.close();

    }
}