package ex4;

public class Teste {
    
    public static void main(String[] args) {
        
        Balanco balance1 = new Balanco(1500, 548.70, 333.52);

        System.out.println("Gasto trimestral: R$"+balance1.calculaTrimestre());
    }
}
