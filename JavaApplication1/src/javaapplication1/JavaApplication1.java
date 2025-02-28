package javaapplication1;

import java.util.Scanner;

public class JavaApplication1 {

    public static void main(String[] args) {
        Scanner recebimento = new Scanner(System.in);
        
        System.out.println("Digite o valor da da prestacao");
        double prestacao = recebimento.nextDouble();
        
        System.out.println("Digite o valor da taxa de juros");
        double taxa = recebimento.nextDouble();
        
        System.out.println("Digite a quantidade de parcelas em atraso");
        int tempo = recebimento.nextInt();
        
        double valorAtraso = prestacao + (prestacao * (taxa/100) * tempo);
        
        System.out.println("O valor em atraso eh: " + valorAtraso);
        recebimento.close();
    }
    
}
