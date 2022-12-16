package ex3;

public class Teste {
    
    public static void main(String[] args) {
        
        Data data1 = new Data(13, 12, 2022);
        Hora hora1 = new Hora(21, 17, 25);
        Contato contact1 = new Contato("Cleide", "(22)155454231");

        data1.mostraData();
        hora1.mostraHora();
        contact1.mostraContato();
    }
}
