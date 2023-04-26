package classes;

import java.util.Scanner;

public class Preco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o código do produto: ");
        int codigo = sc.nextInt();
        
        double preco = 0.0;
        switch (codigo) {
            case 1:
                preco = 99.99;
                break;
            case 2:
                preco = 103.89;
                break;
            case 3:
                preco = 49.98;
                break;
            case 4:
                preco = 89.72;
                break;
            case 5:
                preco = 97.35;
                break;
            default:
                System.out.println("Código inválido");
                System.exit(0);
        }
        
        System.out.printf("O preço do produto é: R$ %.2f", preco);
        
        sc.close();
    }
}

