package classes;

import java.util.Scanner;


public class Cidade {
    
    public static void main(String[] args) {
        
        
        Scanner input = new Scanner(System.in);

        int salario, numFilhos, totalSalario = 0, totalFilhos = 0, numPessoas = 0;

        System.out.println("Digite o salário e o número de filhos das pessoas (digite um salário negativo para encerrar a pesquisa):");

        do {
            salario = input.nextInt();
            if (salario >= 0) {
                numFilhos = input.nextInt();

                totalSalario += salario;
                totalFilhos += numFilhos;
                numPessoas++;
            }
        } while (salario >= 0);

        double mediaSalario = (double) totalSalario / numPessoas;
        double mediaFilhos = (double) totalFilhos / numPessoas;

        System.out.printf("Média salarial: R$ %.2f\n", mediaSalario);
        System.out.printf("Média de filhos: %.2f\n", mediaFilhos);

        input.close();
    }
}

