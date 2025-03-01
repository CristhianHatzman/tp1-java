package principal;

import java.util.Scanner;

public class SetimaAtividade {

    public static void main(String[] args) {
        Scanner recebe = new Scanner(System.in);
        
        String nomeProduto;
        int qtnComprada;
        double valorUnitario;
        
        System.out.println("Informe o nome do produto: ");
        nomeProduto = recebe.next();
        System.out.println("Informe a quantidade de produtos comprados: ");
        qtnComprada = recebe.nextInt();
        System.out.println("Informe o valor unitario do produto: ");
        valorUnitario = recebe.nextDouble();

        double total = qtnComprada * valorUnitario;
        
        System.out.println("Produto comprado: " + nomeProduto + ". Valor total que ira pagar: " + total);
        
            recebe.close();
    }
    
}
