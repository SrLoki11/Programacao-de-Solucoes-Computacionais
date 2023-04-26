package classes;

import java.util.Scanner;

public class Impar {
    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        int num = input.nextInt();
        
        
        for (int i = 1; i <= num; i += 2) {
            System.out.print(i + " ");
        }

        input.close();
    }
}

