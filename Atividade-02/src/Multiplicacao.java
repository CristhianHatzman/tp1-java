import java.util.Scanner;


public class Multiplicacao {
    private int valor;
    private int resultado;
    
    public Multiplicacao() {
    }
    
    public Multiplicacao(int resultado, int valor){
        this.resultado = resultado;
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getResultado() {
        return resultado;
    }

    public void setResultado(int resultado) {
        this.resultado = resultado;
    }
    
    public void multiplicacao4(){
        Scanner recebe = new Scanner(System.in);
        System.out.printf("Informe um numero: ");
        this.valor = recebe.nextInt();
        this.resultado = this.valor * 4;
    }
    
    public void MostrarMultiplicacao(){
        System.out.println("O numero multiplicado por 4: " + this.resultado);
    }
}
