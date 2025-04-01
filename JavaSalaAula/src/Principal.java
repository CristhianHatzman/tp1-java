
import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
    String nome = JOptionPane.showInputDialog("Insira o seu nome: ");
        double numeroConta = Double.parseDouble(JOptionPane.showInputDialog("Insira o numero da conta: "));
            double saldoMedio = Double.parseDouble(JOptionPane.showInputDialog("Insira o saldo medio: "));
        
        
       categoriaCliente cliente01 = new categoriaCliente(nome, numeroConta, saldoMedio);
       cliente01.verificaSaldo();
    }
}
