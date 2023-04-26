package classes;

import java.util.Scanner;

public class TV {
   
    public static void main(String[] args) {
      
      
    Scanner input = new Scanner(System.in);

      int canal, totalAudiencia = 0;
      
      int[] audienciasCanais = new int[5];

      System.out.print("Informe o número do canal (2, 4, 5, 7, 12) ou 0 para sair: ");
      canal = input.nextInt();

      
      while (canal != 0) {
         
        System.out.print("Informe o número de pessoas assistindo o canal: ");
         int audiencia = input.nextInt();

         if (canal == 2) {
            audienciasCanais[0] += audiencia;
         } else if (canal == 4) {
            audienciasCanais[1] += audiencia;
         } else if (canal == 5) {
            audienciasCanais[2] += audiencia;
         } else if (canal == 7) {
            audienciasCanais[3] += audiencia;
         } else if (canal == 12) {
            audienciasCanais[4] += audiencia;
         }

         
         
         totalAudiencia += audiencia;

         System.out.print("\nInforme o número do canal (2, 4, 5, 7, 12) ou 0 para sair: ");
         canal = input.nextInt();
      }

      
      System.out.println("\nRelatório de Audiência dos Canais:\n");

      for (int i = 0; i < audienciasCanais.length; i++) {
         double percentualAudiencia = ((double)audienciasCanais[i] / totalAudiencia) * 100;

         System.out.println("Canal " + (i + 2) + ": " + String.format("%.2f", percentualAudiencia) + "%");
      }

      input.close();
   }
}

