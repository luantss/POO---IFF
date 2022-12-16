package ex5;

public class Contador {
    
    private int numero;

    public Contador(int numero) {

        this.numero = numero;
    }

    public void incrementa() {

        int novoNum = getNumero() + 1;
        setNumero(novoNum);
    }

    public void decrementa() {

        int novoNum = getNumero() - 1;
        setNumero(novoNum);
    }

    public void mostraNumero() {

        System.out.println("Número: "+getNumero());
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
}
