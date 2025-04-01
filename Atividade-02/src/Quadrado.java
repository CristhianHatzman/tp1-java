
import java.util.Scanner;

public class Quadrado {
    private double numero;
    private double resultado;
    
    public Quadrado(){
    }

    public Quadrado(double numero, double resultado) {
        this.numero = numero;
        this.resultado = resultado;
    }

    public double getNumero() {
        return numero;
    }

    public void setNumero(double numero) {
        this.numero = numero;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    
    public void calcularQuadrado(){
        Scanner recebe = new Scanner(System.in);
        System.out.printf("Informe um numero: ");
        this.numero = recebe.nextDouble();
        this.resultado = this.numero * this.numero;
    }
    
    public String mostrarQuadrado() {
        return "Numero ao quadrado: " + resultado;
    }
}
