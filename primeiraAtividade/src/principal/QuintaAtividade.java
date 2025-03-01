package principal;

import java.util.Scanner;

public class QuintaAtividade {

    public static void main(String[] args) {
        Scanner recebe = new Scanner(System.in);
        
        double salariofunc, reajuste, newsalario;
        
        System.out.println("Informe o seu salario: ");
        salariofunc = recebe.nextDouble();
        
        System.out.println("Informe a quantidade de reajuste: ");
        reajuste = recebe.nextDouble();

        newsalario = salariofunc + (salariofunc * reajuste)/100;
        
        System.out.println("Seu salario com o reajuste será de: " + newsalario);
        
            recebe.close();
    }
    
}
