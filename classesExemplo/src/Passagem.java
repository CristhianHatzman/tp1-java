
import java.util.Scanner;

public class Passagem {
    
    Scanner entrada = new Scanner(System.in);
    
    private String nomePassageiro;
    private String RG;
    private String localViagem;
    private String data;
    private String horario;
    private String numPoltrona;

    public Passagem(){
    }
    
    public Passagem(String nomePassageiro, String RG, String localViagem, String data, String horario, String numPoltrona) {
        this.nomePassageiro = nomePassageiro;
        this.RG = RG;
        this.localViagem = localViagem;
        this.data = data;
        this.horario = horario;
        this.numPoltrona = numPoltrona;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getLocalViagem() {
        return localViagem;
    }

    public void setLocalViagem(String localViagem) {
        this.localViagem = localViagem;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public String getNumPoltrona() {
        return numPoltrona;
    }

    public void setNumPoltrona(String numPoltrona) {
        this.numPoltrona = numPoltrona;
    }
    
    public void cadastrarDadosPassageiros() {
        System.out.println("Informe o nome do passageiro: ");
        this.nomePassageiro = entrada.next();
        System.out.println("Informe o RG do passageiro: ");
        this.RG = entrada.next();
    }
    
    public void cadastrarDadosPassagem() {
        System.out.println("Informe o local de embarque: ");
        this.localViagem = entrada.next();
        System.out.println("Informe a data da viagem: ");
        this.data = entrada.next();
        System.out.println("Informe o horario da passagem: ");
        this.horario = entrada.next();
        System.out.println("Informe o numero da poltrona: ");
        this.numPoltrona = entrada.next();
    }
    
    public void mostrarDadosPassageiro() {
        System.out.print("Nome do passageiro: " + this.nomePassageiro + "\n" +
                            "RG: " + this.RG + "\n"
                        );
    }
    
    public void mostrarDadosPassagem() {
        System.out.print("Nome do passageiro: " + this.nomePassageiro + "\n" +
                            "RG: " + this.RG + "\n" +
                                "Local da Viagem " + this.localViagem + "\n" +
                                    "Data: " + this.data + "\n" +
                                        "Horario de embarque: " + this.horario + "\n" +
                                            "Numero da poltrona: " + this.numPoltrona + "\n"
                        );
    }
}
