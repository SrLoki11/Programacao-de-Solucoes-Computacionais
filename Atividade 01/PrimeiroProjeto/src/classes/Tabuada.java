package classes;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
        
        System.out.print("Informe um número: ");
        num = sc.nextInt();
        
        for(int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num * i);

            sc.close();
        }
    }
}


