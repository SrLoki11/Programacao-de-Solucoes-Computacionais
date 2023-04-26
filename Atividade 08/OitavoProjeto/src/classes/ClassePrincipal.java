package classes;

import java.util.Scanner;

public class ClassePrincipal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dividendo, divisor, resultado;
        Divisao divisao = new Divisao();

        try {
            
            
            System.out.println("Informe o dividendo:");
            dividendo = input.nextInt();
            System.out.println("Informe o divisor:");
            divisor = input.nextInt();

            resultado = divisao.efetuarDivisao(dividendo, divisor);
            System.out.println("O resultado da divisão é: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            input.close();
        }
    }
}
