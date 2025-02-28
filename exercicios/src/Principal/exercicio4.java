package Principal;

import java.util.Scanner;

public class exercicio4 {

    public static void main(String[] args) {
        Scanner recebimento = new Scanner(System.in);
        
        System.out.println("Digite o seu nome:  ");
        String name = recebimento.next();
        
        System.out.println("Digite a sua data de nascimento: ");
        String dataNascimento = recebimento.next();

        System.out.println("O nome informado eh: " + name + " \nE a data de nascimento eh: " + dataNascimento);
        
        recebimento.close();
    }
}
