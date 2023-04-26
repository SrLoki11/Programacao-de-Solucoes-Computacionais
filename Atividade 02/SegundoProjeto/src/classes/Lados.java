package classes;

import java.util.Scanner;

public class Lados {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o primeiro lado em cm: ");
        double a = sc.nextDouble();
        
        System.out.print("Informe o segundo lado em cm: ");
        double b = sc.nextDouble();
        
        System.out.print("Informe o terceiro lado em cm: ");
        double c = sc.nextDouble();
        
        if ((Math.abs(b - c) < a && a < (b + c)) && 
            (Math.abs(a - c) < b && b < (a + c)) &&
            (Math.abs(a - b) < c && c < (a + b))) {
            System.out.println("Os três valores informados podem ser os comprimentos dos lados de um triângulo.");
        } else {
            System.out.println("Os três valores informados NÃO podem ser os comprimentos dos lados de um triângulo.");
        }
        
        sc.close();
    }
}

