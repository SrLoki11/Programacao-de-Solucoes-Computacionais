package classes;
import java.util.Scanner;

public class NotaFinal {
   public static void main(String[] args) {
      
      
      Scanner input = new Scanner(System.in);

      int qtdNotasAcima90 = 0;
      int qtdAlunosReprovados = 0;
      int qtdAlunos = 0;
      double maiorNota = 0;
      double menorNota = 100;
      double somaNotas = 0;

      System.out.print("Informe a nota final do aluno (-1 para sair): ");
      double nota = input.nextDouble();

      while (nota >= 0) {
         System.out.print("Informe a quantidade de faltas do aluno: ");
         int faltas = input.nextInt();

         qtdAlunos++;

         if (nota >= 90) {
            qtdNotasAcima90++;
         }

         if (nota < 70 || faltas >= 20) {
            qtdAlunosReprovados++;
         }

         if (nota > maiorNota) {
            maiorNota = nota;
         }

         if (nota < menorNota) {
            menorNota = nota;
         }

         somaNotas += nota;

         System.out.print("\nInforme a nota final do aluno (-1 para sair): ");
         nota = input.nextDouble();
      }

      
      
      double mediaNotas = somaNotas / qtdAlunos;

      
      System.out.println("\nResultados:");
      System.out.println("Quantidade de alunos com nota maior ou igual a 90: " + qtdNotasAcima90);
      System.out.println("Quantidade de alunos reprovados: " + qtdAlunosReprovados);
      System.out.println("Maior nota: " + maiorNota);
      System.out.println("Menor nota: " + menorNota);
      System.out.println("Média de notas da turma: " + mediaNotas);

      input.close();
   }
}
