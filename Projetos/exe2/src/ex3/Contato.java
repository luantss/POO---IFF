package ex3;

public class Contato {
    
    private String nome;
    private String telefone;

    public Contato(String nome, String telefone) {

        this.nome = nome;
        this.telefone = telefone;
    }

    public void mostraContato() {

        System.out.print("\nContato:\n");
        System.out.println("Nome: "+getNome()+"\nTelefone: "+getTelefone());
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
