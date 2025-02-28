package Principal;

import java.util.Scanner;

public class Exercicios {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o valor da temperatura em graus Celcius: ");
        int celcius = entrada.nextInt();
        
        double fahrenheit = celcius * 1.8 + 32;
        
        System.out.println("Temperatura em Fahrenheit: " + fahrenheit);
        entrada.close();
    }
    
}
