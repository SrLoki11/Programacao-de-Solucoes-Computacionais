package classes;

import java.util.Scanner;

public class Planeta {

    public static void main(String[] args) {
        
       
        double v0, t, v, h, g;
        int planeta;
        
       
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Escolha um planeta:");
        System.out.println("1 - Mercurio");
        System.out.println("2 - Venus");
        System.out.println("3 - Terra");
        System.out.println("4 - Marte");
        System.out.println("5 - Jupter");
        System.out.println("6 - Saturno");
        System.out.println("7 - Urano");
        System.out.println("8 - Netuno");
        System.out.println("9 - Plutao");
        planeta = sc.nextInt();
        
       
        switch(planeta) {
            
            case 1: // Mercurio
                g = 3.7;
                break;
            
                case 2: // Venus
                g = 8.8;
                break;
            
                case 3: // Terra
                g = 9.8;
                break;
            
                case 4: // Marte
                g = 3.8;
                break;
                
                case 5: // Jupter
                g = 26.4;
                break;
                
                case 6: // Saturno
                g = 11.5;
                break;
                
                case 7: // Urano
                g = 9.3;
                break;
                
                case 8: // Netuno
                g = 12.2;
                break;
                
                case 9: // Plutao
                g = 0.6;
                break;
            
                default:
                System.out.println("Planeta inválido");
                return; 

                
        }
        
       
        System.out.println("Informe a velocidade inicial (m/s):");
        v0 = sc.nextDouble();
        
        System.out.println("Informe o instante de tempo (s):");
        t = sc.nextDouble();
        
        
        v = v0 - g * t;
        h = v0 * t - (g * Math.pow(t, 2)) / 2;
        
       
        System.out.println("Velocidade da bola no instante t: " + v + " m/s");
        System.out.println("Altura da bola no instante t: " + h + " m");
        
        
        sc.close();
    }
}

