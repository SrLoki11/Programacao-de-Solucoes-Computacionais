package classes;

import java.util.Scanner;

public class Funcao {
    public static void main(String[] args) {
       
        Scanner input = new Scanner(System.in);
        double x, resultado;
        
        System.out.print("Digite um valor para x: ");
        x = input.nextDouble();
        
        if (x < -2) {
            resultado = 3;
        } else if (x >= -2 && x < 3) {
            resultado = 2*x + 2;
        } else {
            resultado = -x;
        }
        
        System.out.println("O valor da função f(x) para x = " + x + " é " + resultado);
        
        input.close();
    }
}

