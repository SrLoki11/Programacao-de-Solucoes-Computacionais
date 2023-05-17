package classes;


import java.util.Scanner;

public class PesquisaSequencial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int[] vetor = new int[10];

        
        System.out.println("Digite 10 números:");
        
        
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
                System.out.println("Digite o tipo de pesquisa (1 - Sequencial, 2 - Sequencial com Sentinela):");
                int tipoPesquisa = scanner.nextInt();

                int comparacoes = 0;
                boolean encontrado = false;

                if (tipoPesquisa == 1) {
                    
                    for (int i = 0; i < vetor.length; i++) {
                        comparacoes++;
                        if (vetor[i] == numero) {
                            encontrado = true;
                            break;
                        }
                    }
                } else if (tipoPesquisa == 2) {
                    
                    int ultimoElemento = vetor[vetor.length - 1];
                    vetor[vetor.length - 1] = numero;

                    int i = 0;
                    while (vetor[i] != numero) {
                        comparacoes++;
                        i++;
                    }

                    vetor[vetor.length - 1] = ultimoElemento;

                    if (i < vetor.length - 1 || vetor[vetor.length - 1] == numero) {
                        encontrado = true;
                    }
                } else {
                    System.out.println("Tipo de pesquisa inválido!");
                    continue;
                }

                if (encontrado) {
                    System.out.println("Número encontrado! Foram realizadas " + comparacoes + " comparações.");
                } else {
                    System.out.println("Número não encontrado! Foram realizadas " + comparacoes + " comparações.");
                }
            }
        }

        scanner.close();
    }
}

    
