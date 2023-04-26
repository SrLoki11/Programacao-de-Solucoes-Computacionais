package classes;

import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        
        System.out.print("Digite o ano atual: ");
        
        int anoAtual = sc.nextInt();
        
        int idade = anoAtual - anoNascimento;
        
        int idade2050 = 2050 - anoNascimento;
       
        System.out.printf("Idade atual: %d anos\n", idade);
        
        System.out.printf("Idade em 2050: %d anos", idade2050);
        sc.close();
    }
}

