package classes;


import java.util.Arrays;


import java.util.Scanner;

public class MetodoOrdenacao {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Ordenacao ordenacao = new Ordenacao();

    boolean sair = false;
    
    
    while (!sair) {
      System.out.println("Selecione o método de ordenação:");
      System.out.println("1 - Bubble Sort");
      System.out.println("2 - Selection Sort");
      System.out.println("3 - Insertion Sort");
      System.out.println("4 - Sair");
      System.out.print("Opção: ");

      
      
      
      int opcao = scanner.nextInt();

      
      switch (opcao) {
        
        
        case 1:
          int[] vetorBubbleSort = lerVetor(scanner);
          ordenacao.bubbleSort(vetorBubbleSort);
          System.out.println("Vetor ordenado com Bubble Sort: " + Arrays.toString(vetorBubbleSort));
          break;

        case 2:
          int[] vetorSelectionSort = lerVetor(scanner);
          ordenacao.selectionSort(vetorSelectionSort);
          System.out.println("Vetor ordenado com Selection Sort: " + Arrays.toString(vetorSelectionSort));
          break;

        case 3:
          int[] vetorInsertionSort = lerVetor(scanner);
          ordenacao.insertionSort(vetorInsertionSort);
          System.out.println("Vetor ordenado com Insertion Sort: " + Arrays.toString(vetorInsertionSort));
          break;

        case 4:
          sair = true;
          break;

        default:
          System.out.println("Opção inválida!");
          break;
      }

      
      System.out.println();
    }

    
    scanner.close();
  }

  public static int[] lerVetor(Scanner scanner) {
    
    int[] vetor = new int[10];
    
    System.out.println("Informe 10 números inteiros para o vetor:");
    
    for (int i = 0; i < vetor.length; i++) {
      System.out.print("Número " + (i + 1) + ": ");
      vetor[i] = scanner.nextInt();
    }
    
    
    return vetor;
  }
}

