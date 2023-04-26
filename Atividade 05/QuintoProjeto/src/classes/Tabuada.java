package classes;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int num = sc.nextInt();

        System.out.println("Tabuada de multiplicação de " + num + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        sc.close();
    }
}
