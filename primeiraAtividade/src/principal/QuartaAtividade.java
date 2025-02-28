package principal;

import java.util.Scanner;

public class QuartaAtividade {

    public static void main(String[] args) {
        Scanner recebe = new Scanner(System.in);
        
        double salariofunc, salariomin, qtnsalario;
        
        System.out.println("Informe o seu salario: ");
        salariofunc = recebe.nextDouble();
        
        System.out.println("Informe o salario minimo: ");
        salariomin = recebe.nextDouble();

        qtnsalario = salariofunc/salariomin;
        
        System.out.println("A quantidade de salarios minimos que voce recebe: " + qtnsalario);
        
            recebe.close();
    }
    
}
