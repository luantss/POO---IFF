package ex2;

public class Triangulo {
    
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {

        this.base = base;
        this.altura = altura;
    }

    public void calculaArea() {

        double area = getBase() * getAltura() / 2;
        System.out.print("\nA área do triângulo é: "+area);
    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
