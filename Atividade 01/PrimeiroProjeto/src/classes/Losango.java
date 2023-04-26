package classes;

import java.util.Scanner;

public class Losango {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a diagonal maior do losango: ");
        double diagonalMaior = sc.nextDouble();
        
        System.out.print("Digite a diagonal menor do losango: ");
        double diagonalMenor = sc.nextDouble();
        double area = (diagonalMaior * diagonalMenor) / 2;
        
        System.out.printf("A área do losango é: %.2f", area);
        sc.close();
    }
}