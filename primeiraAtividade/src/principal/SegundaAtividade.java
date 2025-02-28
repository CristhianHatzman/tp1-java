package principal;

import java.util.Scanner;

public class SegundaAtividade {

    public static void main(String[] args) {
        Scanner recebe = new Scanner(System.in);
        
        double nota1, nota2, nota3, nota4, nota5, nota6, media1, media2, mediafinal;
        
            System.out.println("Informe a primeira nota: ");
        nota1 = recebe.nextDouble();
            System.out.println("Informe a segunda nota: ");
        nota2 = recebe.nextDouble();
            System.out.println("Informe a terceira nota: ");
        nota3 = recebe.nextDouble();
            System.out.println("Informe a quarta nota: ");
        nota4 = recebe.nextDouble();
            System.out.println("Informe a quinta nota: ");
        nota5 = recebe.nextDouble();
            System.out.println("Informe a sexta nota: ");
        nota6 = recebe.nextDouble();
        
        media1 = (nota1 + nota2 + nota3) / 3;
        media2 = (nota4 + nota5 + nota6) / 3;
        mediafinal = media1 + media2;
        
        System.out.println("A media final dessa pessoa eh: " + mediafinal);
        
            recebe.close();
    }
    
}
