package classes;

import java.util.Scanner;

public class Idade {
  public static void main(String[] args) {
    
    
    Scanner input = new Scanner(System.in);
    int soma = 0;

    
    for (int i = 1; i <= 10; i++) {
      System.out.printf("Informe a idade da %dª pessoa: ", i);
      int idade = input.nextInt();
      soma += idade;
    }

    
    double media = soma / 10.0;
    System.out.printf("A média das idades informadas é: %.2f anos\n", media);

    input.close();
 
}

}

