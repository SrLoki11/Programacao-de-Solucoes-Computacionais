package classes;

import java.util.Scanner;

public class Dolar {

        public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a cotação do dólar em reais: ");
        double cotacao = sc.nextDouble();
        
        System.out.print("Digite a quantidade de dólares que você possui: ");
        
        double dolares = sc.nextDouble();
        
        double reais = dolares * cotacao;
        
        System.out.printf("Você possui R$ %.2f", reais);
        sc.close();
}
}