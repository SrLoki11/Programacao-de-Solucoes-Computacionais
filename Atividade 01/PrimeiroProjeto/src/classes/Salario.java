package classes;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o salário atual do funcionário: ");
        double salarioAtual = sc.nextDouble();
        double novoSalario = salarioAtual * 1.25;
        
        System.out.printf("O novo salário do funcionário é R$ %.2f", novoSalario);
        sc.close();
    }
}
