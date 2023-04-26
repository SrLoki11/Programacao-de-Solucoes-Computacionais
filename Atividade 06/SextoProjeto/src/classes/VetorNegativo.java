package classes;

import java.util.Scanner;

public class VetorNegativo {
  public static void main(String[] args) {
    
    
    Scanner sc = new Scanner(System.in);

    
    double[] numeros = new double[10];
    for (int i = 0; i < numeros.length; i++) {
      System.out.print("Digite um número real: ");
      numeros[i] = sc.nextDouble();
    }

    
    System.out.print("Vetor: [");
    for (int i = 0; i < numeros.length; i++) {
      System.out.print(numeros[i]);
      if (i != numeros.length - 1) {
        System.out.print(", ");
      }
    }
    System.out.println("]");

    
    
    System.out.print("Posições com números negativos: [");
    
    boolean temNegativo = false;
    
    for (int i = 0; i < numeros.length; i++) {
      if (numeros[i] < 0) {
        System.out.print(i);
        if (i != numeros.length - 1) {
          System.out.print(", ");
        }
        temNegativo = true;
      }
    }
    if (!temNegativo) {
      System.out.print("nenhuma");
    }
    System.out.println("]");

    sc.close();
  }
}

