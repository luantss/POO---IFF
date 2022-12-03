import java.text.NumberFormat;

public class Preguica extends Animal{

  // Declaração de atributos da classe
  //'private' para definir o tipo de segurança para que outra classe externa não possa acessar os atributos de Preguiça
  private String habitat;
  private int tempoSonoHoras;
  
  // Método construtor
  // O métedo construtor cria um objeto em memória
  public Preguica(String nomeAnimal, String racaAnimal, int idade, int peso, String habitat, int tempoSonoHoras) 
  {
    // Utilizando o 'super' para chamar o construtor da superclasse (a classe 'animal')
    super(nomeAnimal, racaAnimal, idade, peso);
    this.habitat = habitat;
    this.tempoSonoHoras = tempoSonoHoras;
  }

  // Funcão para calcular a porcentagem do tempo da vida que um bicho-preguiça passa dormindo
  public Double PorcentagemTempoSonoVida() {
    
    double percent;
    double vidaEmHoras, horasDeSono;
    // vidaEmHoras = getIdade() * 8760;

    // Convertendo o tempo de vida para horas 
    vidaEmHoras = getIdade() * 12 * 30 * 24;

    // Calculando quantas horas totais o animal passou dormindo
    horasDeSono = tempoSonoHoras * 30 * 12 * getIdade();
    
    // Convertendo para decimal
    percent = horasDeSono / vidaEmHoras;

    //Convertendo para porcentagem sem usar o 'NumberFormat'
    //percent = horasDeSono / vidaEmHoras * 100;
    

    // ASK Primeiro fiz com void, mas optei por fazer retornando o valor. Qual seria a melhor opção?
    // ASK Deu erro nessa formatação
    // System.out.printf("\nPorcentagem de tempo de vida gasto dormindo: %.2d"+percent+"%");
    // System.out.print("\nPorcentagem de tempo de vida gasto dormindo: "+percent+"%");


    return percent;
  }

  // Formatador de número para porcentagem
  public String formatoPercent() {
    // O 'getPercentInstance' serve para formatar de fração para porcentagem
    NumberFormat formatador = NumberFormat.getPercentInstance();

    // usando o 'format' para formatar a fração de 'PorcentagemTempoSonoVida' e atribuir seu valor formatador a String
    String formatoPercent = formatador.format(PorcentagemTempoSonoVida());
    return formatoPercent;
  }

  //Imprimir informações da preguiça
  public void imprimirInfoPreguica() {
    // Chamando o método de imprimir info da classe animal
    imprimirInfo();
    System.out.print("\nTipo: Preguiça");
    System.out.print("\nHabitat: "+habitat+"\nTempo de sono p/ dia em horas: "+tempoSonoHoras+
    "\nPorcentagem de tempo de vida gasto dormindo: "+formatoPercent());


    // "\nPorcentagem de tempo de vida gasto dormindo: "+PorcentagemTempoSonoVida());
  }

  // Getters e Setters
  public String getHabitat() {
    return this.habitat;
  }

  public void setHabitat(String habitat) {
    this.habitat = habitat;
  }

  public int getTempoSonoHoras() {
    return this.tempoSonoHoras;
  }

  public void setTempoSonoHoras(int tempoSonoHoras) {
    this.tempoSonoHoras = tempoSonoHoras;
  }

}
