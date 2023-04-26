package classes;

import javax.swing.JOptionPane;

public class Validacao {
  
  
    public static void main(String[] args) {
    String entrada;
    double nota, salario;
    char sexo;
    int idade;

   
    do {
      entrada = JOptionPane.showInputDialog("Digite a nota (entre 0 e 10): ");
      nota = Double.parseDouble(entrada);
    } while (nota < 0 || nota > 10);

    
    do {
      entrada = JOptionPane.showInputDialog("Digite o salário (maior que zero): ");
      salario = Double.parseDouble(entrada);
    } while (salario <= 0);

   
    do {
      entrada = JOptionPane.showInputDialog("Digite o sexo (m ou f): ");
      sexo = entrada.toLowerCase().charAt(0);
    } while (sexo != 'm' && sexo != 'f');

    
    do {
      entrada = JOptionPane.showInputDialog("Digite a idade (entre 0 e 150): ");
      idade = Integer.parseInt(entrada);
    } while (idade < 0 || idade > 150);

    JOptionPane.showMessageDialog(null, "Dados válidos! Nota: " + nota +
        ", Salário: " + salario + ", Sexo: " + sexo + ", Idade: " + idade);
  }
}

