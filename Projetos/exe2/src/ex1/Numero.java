package ex1;
public class Numero {

    private int n1;
    private int n2;

    // Método construtor
    public Numero(int n1, int n2) {
        
        this.n1 = n1;
        this.n2 = n2;
    }

    // Trocar numeros
    public void trocaNumero() {

        int aux = getN1();
        this.n1 = getN2();
        this.n2 = aux;
    }

    public void imprimeNumero() {

        System.out.print("\nPrimeiro número: "+getN1());
        System.out.print("\nSegundo número: "+getN2());
    }

    // Getters and setters
    public int getN1() {
        return this.n1;
    }

    public void setN1(int n1) {        
        this.n1 = n1;
    }

    public int getN2() {
        return this.n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
}
