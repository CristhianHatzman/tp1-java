public class Usuario {
    // Atributos da classe
    private String nome;
    private String email;
    private String login;
    private String senha;

    // Construtor Padrão
    public Usuario() { 
    }
    
    // Construtor específico (pode ser implementado de acordo com as necessídades da aplicação)
    public Usuario(String nome, String email, String login, String senha) {
        this.nome = nome;
        this.email = email;
        this.login = login;
        this.senha = senha;
    }
    // Metodos getters servem para visualizar a variavel
    public String getNome() {
        return nome;
    }
    // Metodos setters servem para alterar a variavel
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public void mensagem(){
        System.out.println("Hello World! " + this.nome);
        System.out.println("As suas informacoes: " + this.email);
        System.out.println(this.login);
    }
    
    
}
