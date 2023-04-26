package classes;

import java.util.Scanner;

public class Salario2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = sc.nextDouble();

        System.out.print("Digite o salário do funcionário: ");
        double salarioFuncionario = sc.nextDouble();

        double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;

        System.out.println("O funcionário recebe " + quantidadeSalariosMinimos + " salário(s) mínimo(s)");

        sc.close();
    }
}
