package ex3;

public class Hora {
    
    private int hora;
    private int minuto;
    private int segundo;

    public Hora(int hora, int minuto, int segundo) {

        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public void mostraHora() {

        System.out.print("\nHora:\n");
        System.out.println(getHora()+":"+getMinuto()+":"+getSegundo());
    }

    public int getHora() {
        return this.hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return this.minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return this.segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }

}
