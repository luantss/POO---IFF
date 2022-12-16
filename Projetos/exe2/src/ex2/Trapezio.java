package ex2;

public class Trapezio {
    
    private double baseM;
    private double basem;
    private double altura;

    public Trapezio(double baseM, double basem, double altura) {

        this.baseM = baseM;
        this.basem = basem;
        this.altura = altura;
    }

    public void calculaArea() {

        double area = (getBaseM() + getBasem()) * getAltura() / 2;
        System.out.print("\nÁrea do trapézio: "+area);
    }

    public double getBaseM() {
        return this.baseM;
    }

    public void setBaseM(double baseM) {
        this.baseM = baseM;
    }

    public double getBasem() {
        return this.basem;
    }

    public void setBasem(double basem) {
        this.basem = basem;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
