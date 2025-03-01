package principal;

import java.util.Scanner;

public class SextaAtividade {

    public static void main(String[] args) {
        Scanner recebe = new Scanner(System.in);
        
        double numLitros, valorPago;
        
        System.out.println("Informe a quantidade de gasolina (em litros): ");
        numLitros = recebe.nextDouble();

        valorPago = numLitros * 4.39;
        
        System.out.println("O valor que deve ser pago por " + numLitros + " litros de gasolina eh: " + valorPago);
        
            recebe.close();
    }
    
}
