package classes;

import java.util.Scanner;

public class Pesquisa {

    public static void main(String[] args) {
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um comando Git: ");
        
        String command = scanner.nextLine();

        switch (command) {
            
            
            case "git clone":
                
            
            System.out.println("O comando 'git clone' é usado para clonar um repositório Git existente.");
                System.out.println("Exemplo: git clone https://github.com/user/repo.git");
                break;
            
            
                case "git fetch":
                System.out.println("O comando 'git fetch' é usado para buscar as atualizações mais recentes do repositório remoto.");
                System.out.println("Exemplo: git fetch origin");
                break;
            
            
                case "git pull":
                System.out.println("O comando 'git pull' é usado para buscar as atualizações mais recentes e mesclá-las com o repositório local.");
                System.out.println("Exemplo: git pull origin main");
                break;
            
            
                default:
                System.out.println("Comando Git inválido.");

                scanner.close();
        }
    }
}
