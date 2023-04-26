package classes;

import java.util.Scanner;

public class Masculino {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int contMasc60a80 = 0;
    int contFem50a70 = 0;

    
    for (int i = 1; i <= 10; i++) {
      System.out.println("Pessoa " + i + ":");
      System.out.print("Sexo (M/F): ");
      char sexo = input.next().charAt(0);
      System.out.print("Peso (kg): ");
      double peso = input.nextDouble();

      
      if (sexo == 'M' && peso >= 60 && peso <= 80) {
        contMasc60a80++;
      } else if (sexo == 'F' && peso >= 50 && peso <= 70) {
        contFem50a70++;
      }
    }

    System.out.println("Quantidade de homens com peso entre 60 e 80 kg: " + contMasc60a80);
    System.out.println("Quantidade de mulheres com peso entre 50 e 70 kg: " + contFem50a70);

    input.close();
  }
}
