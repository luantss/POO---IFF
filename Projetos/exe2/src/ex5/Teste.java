package ex5;

public class Teste {
    
    public static void main(String[] args) {
        
        Contador cont1 = new Contador(8);

        cont1.mostraNumero();
        cont1.incrementa();
        cont1.mostraNumero();
        cont1.decrementa();
        cont1.mostraNumero();
    }
}
