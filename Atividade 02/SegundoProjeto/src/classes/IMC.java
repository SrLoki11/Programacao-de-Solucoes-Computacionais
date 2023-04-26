package classes;

import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o peso (em kg): ");
        double peso = sc.nextDouble();
        
        System.out.print("Digite a altura (em m): ");
        double altura = sc.nextDouble();
        
        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é %.2f\n", imc);
        
        if (imc < 20) {
            System.out.println("Situação: Abaixo do Peso");
        } else if (imc < 25) {
            System.out.println("Situação: Normal");
        } else if (imc < 30) {
            System.out.println("Situação: Sobrepeso");
        } else if (imc < 40) {
            System.out.println("Situação: Obesidade");
        } else {
            System.out.println("Situação: Obesidade Mórbida");
        }
        
        sc.close();
    }
}
