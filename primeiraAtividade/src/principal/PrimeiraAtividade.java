package principal;

import java.util.Scanner;

public class PrimeiraAtividade {

    public static void main(String[] args) {
        Scanner recebe = new Scanner(System.in);
        
        double n1, n2, resultado;
        
        System.out.println("Informe o primeiro numero: ");
        n1 = recebe.nextDouble();
        
            System.out.println("Informe o segundo numero: ");
        n2 = recebe.nextDouble();
        
        resultado = n1 + n2;
            System.out.println("O resultado da soma dos 2 numeros: " + resultado);
        resultado = n1 - n2;
            System.out.println("O resultado da subtracao dos 2 numeros: " + resultado);
        resultado = n1 / n2;
            System.out.println("O resultado da divisao dos 2 numeros: " + resultado);
        resultado = n1 * n2;
            System.out.println("O resultado da multiplicacao dos 2 numeros: " + resultado);
        
            recebe.close();
    }
    
}
