package ex2;

public class Quadrado {
    
    private double lado;

    public Quadrado(double lado) {

        this.lado = lado;
    }

    public void calcularArea() {

        double area = getLado() * getLado();
        System.out.print("\nÁrea do quadrado: "+area);
    }

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

}
