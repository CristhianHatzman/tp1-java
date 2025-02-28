package principal;

import java.util.Scanner;

public class TerceiraAtividade {

    public static void main(String[] args) {
        Scanner recebe = new Scanner(System.in);
        
        int idade, dias;
        
        System.out.println("Informe a sua idade: ");
        idade = recebe.nextInt();
        
        dias = idade * 365;
        
        System.out.println("Voce tem " + dias + " dias de vida!");
        
            recebe.close();
    }
    
}
