package classes;

import java.util.Scanner;

public class Media {
   public static void main(String[] args) {
      
    
    Scanner input = new Scanner(System.in);

      
    
    System.out.print("Informe a matrícula do aluno (-1 para sair): ");
      int matricula = input.nextInt();

      while (matricula >= 0) {
         System.out.print("Informe a primeira nota do aluno: ");
         double nota1 = input.nextDouble();

         System.out.print("Informe a segunda nota do aluno: ");
         double nota2 = input.nextDouble();

         System.out.print("Informe a terceira nota do aluno: ");
         double nota3 = input.nextDouble();

         double media = (nota1 + nota2 + nota3) / 3;

         if (media >= 70) {
            System.out.println("O aluno de matrícula " + matricula + " foi aprovado.");
         } else if (media >= 60) {
            System.out.println("O aluno de matrícula " + matricula + " está em recuperação.");
         } else {
            System.out.println("O aluno de matrícula " + matricula + " foi reprovado.");
         }

         System.out.print("\nInforme a matrícula do aluno (-1 para sair): ");
         matricula = input.nextInt();
      }

      input.close();
   }
}

