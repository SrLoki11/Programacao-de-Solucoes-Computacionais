package classes;


import java.util.Arrays;


import java.util.Scanner;

public class PesquisaBinaria {
    
    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);

       
        int[] vetor = new int[10];

        
        System.out.println("Digite 10 números ordenados:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }

        
        boolean sair = false;
        
        
        while (!sair) {
            System.out.println("\nDigite o número a ser pesquisado (ou -1 para sair):");
            int numero = scanner.nextInt();

            if (numero == -1) {
                sair = true;
            } else {
                
                int comparacoes = 0;
                int resultado = pesquisaBinaria(vetor, numero, comparacoes);

                
                if (resultado == -1) {
                    System.out.println("Número não encontrado! Foram realizadas " + comparacoes + " comparações.");
                } else {
                    System.out.println("Número encontrado! Foram realizadas " + comparacoes + " comparações.");
                }
            }
        }

        scanner.close();
    }

    
    public static int pesquisaBinaria(int[] vetor, int numero, int comparacoes) {
        int esquerda = 0;
        int direita = vetor.length - 1;

        while (esquerda <= direita) {
            int meio = esquerda + (direita - esquerda) / 2;

            if (vetor[meio] == numero) {
                comparacoes++;
                return meio;
            }

            if (vetor[meio] < numero) {
                comparacoes++;
                esquerda = meio + 1;
            
            
            } else {
                comparacoes++;
                direita = meio - 1;
            }
        }

        return -1;
    }


}

