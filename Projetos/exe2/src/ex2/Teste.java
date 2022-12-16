package ex2;

public class Teste {
    
    public static void main(String[] args) {
        
        Triangulo triang1 = new Triangulo(3, 5);
        Quadrado quad1 = new Quadrado(5);
        Trapezio trap1 = new Trapezio(9, 7, 3);

        triang1.calculaArea();
        quad1.calcularArea();
        trap1.calculaArea();

    }
}
