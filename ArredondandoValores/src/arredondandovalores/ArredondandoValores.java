package arredondandovalores;

import java.text.DecimalFormat;

public class ArredondandoValores {

    public static void main(String[] args) {
        DecimalFormat deci = new DecimalFormat("0.00");
        
        double num1 = 3.00;
        double num2 = 2.00;
        
        double result = num1 / num2;
        
                
        System.out.println("O resultado da divisao eh: " + deci.format(result));
    }
    
}
