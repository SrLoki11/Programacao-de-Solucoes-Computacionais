package classes;

import java.util.Scanner;

public class Media {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        double nota1 = sc.nextDouble();
        
        System.out.print("Digite a segunda nota: ");
        double nota2 = sc.nextDouble();
        
        System.out.print("Digite a terceira nota: ");
        double nota3 = sc.nextDouble();
        
        double media = (nota1 + nota2 + nota3) / 3;
        
        System.out.printf("A média é: %.2f", media);
        sc.close();
    }
}
    

