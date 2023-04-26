package classes;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = sc.nextDouble();

        double fahrenheit = (celsius * 1.8) + 32;

        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);

        sc.close();
    }
}
