package classes;

import java.util.Scanner;

public class Potencia {
  
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.print("Digite a base: ");
    int base = sc.nextInt();

    System.out.print("Digite o expoente: ");
    int expoente = sc.nextInt();

    int potencia = 1;

    for (int i = 1; i <= expoente; i++) {
      potencia *= base;
    }

    System.out.println(base + " elevado a " + expoente + " = " + potencia);

    sc.close();


  }
}

