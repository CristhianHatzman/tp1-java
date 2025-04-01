public class classesExemplo {

    public static void main(String[] args) {
        Usuario user1 = new Usuario("Joao", "joao@gmail.com", "joaozinho", "123");
        String info = user1.getNome();
        //System.out.println(info);
        //System.out.println(user1.getEmail());
        user1.mensagem();
        
        Passagem card1 = new Passagem();
        card1.cadastrarDadosPassageiros();
        card1.cadastrarDadosPassagem();
        
        card1.mostrarDadosPassagem();
    }
    
}
