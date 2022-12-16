package ex4;

public class Balanco {
    
    private double mes1;
    private double mes2;
    private double mes3;

    public Balanco(double mes1, double mes2, double mes3) {

        this.mes1 = mes1;
        this.mes2 = mes2;
        this.mes3 = mes3;
    }

    public double calculaTrimestre() {

        double total = getMes1() + getMes2() + getMes3();
        return total;
    }

    public double getMes1() {
        return this.mes1;
    }

    public void setMes1(double mes1) {
        this.mes1 = mes1;
    }

    public double getMes2() {
        return this.mes2;
    }

    public void setMes2(double mes2) {
        this.mes2 = mes2;
    }

    public double getMes3() {
        return this.mes3;
    }

    public void setMes3(double mes3) {
        this.mes3 = mes3;
    }

}
