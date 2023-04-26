package classes;

public class Divisao {
    
    
    public int efetuarDivisao(int dividendo, int divisor) throws ArithmeticException {
        
        if (divisor == 0) {
            throw new ArithmeticException("Divisor igual a zero.");
        }

        if (dividendo < 0) {
            throw new ArithmeticException("Dividendo menor que zero.");
        }

        return dividendo / divisor;
    }
}
