package Principal;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o valor da temperatura em graus Celcius: ");
        int celcius = entrada.nextInt();
        
        double fahrenheit = celcius * 1.8 + 32;
        
        System.out.printf("Temperatura em Fahrenheit: &.2f " ,fahrenheit);
        entrada.close();
    }
    
}
