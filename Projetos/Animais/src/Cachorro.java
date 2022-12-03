public class Cachorro extends Animal{

  // Declaração dos atributos da classe
  //'private' para definir a segurança do atributo da classe 'cachorro' para não poder se modificada por outra classe
  private String residencia;
  private String tipoRacao;
  private double custoRacaoKg;

  // Método construtor
  // O método construtor cria um objeto em memória
  public Cachorro(String nomeAnimal, String racaAnimal, int idade, double d, 
  String residencia, String tipoRacao, double custoRacaoKg) 
  {
    // O 'super' serve para chamar o construtor da superclasse(no caso a classe 'Animal')
    // Ele sempre deve ser o primeiro item dentro do construtor 
    super(nomeAnimal, racaAnimal, idade, d);
    this.residencia = residencia;
    this.tipoRacao = tipoRacao;
    this.custoRacaoKg = custoRacaoKg;
  }
  
  // Método para calcular o gasto de ração mensal
  public double gastoRacao() 
  {
    double gastoRacao=0.0;
    if(getPeso() > 0) {
      if(getPeso() < 13) {
        gastoRacao = 180 * 30 / 1000 * custoRacaoKg;
      } else {
        if(getPeso() < 22) {
          gastoRacao = 250 * 30 / 1000 * custoRacaoKg;
        } else {
          if(getPeso() < 38) {
            gastoRacao = 380 * 30 / 1000 * custoRacaoKg;
          } else {
            if(getPeso() < 50) {
              gastoRacao = 500 * 30 / 1000 * custoRacaoKg;
            } else {
              if(getPeso() > 100) {
                System.out.print("\nO cachorro "+getNomeAnimal()+" excedeu o limite de peso!");
              } 
            }
          }
        }
      }
      // ASK também fiquei em dúvida entre void ou return
      // System.out.printf("Gasto de ração: R$%.2d"+gastoRacao);
    } else {
      System.out.print("\nO cachorro "+getNomeAnimal()+" está morto por falta de massa corporal!");
    }
    return gastoRacao;
  }

  // Imprimir informações do cachorro
  public void imprimirInfoCachorro() {
    // Chamando o método imprimir info da classe animal
    imprimirInfo();
    System.out.print("\nTipo: Cachorro");
    System.out.print("\nResidência: "+residencia+"\nTipo de ração: "+tipoRacao+
    "\nCusto da ração por Kg: R$"+custoRacaoKg+"\nCusto de ração por mês: R$"+gastoRacao()+"\n\n\n");
  }

  // Getters e Setters
  public String getResidencia() {
    return this.residencia;
  }

  public void setResidencia(String residencia) {
    this.residencia = residencia;
  }

  public String getTipoRacao() {
    return this.tipoRacao;
  }

  public void setTipoRacao(String tipoRacao) {
    this.tipoRacao = tipoRacao;
  }

  public double getCustoRacaoKg() {
    return this.custoRacaoKg;
  }

  public void setCustoRacaoKg(double custoRacaoKg) {
    this.custoRacaoKg = custoRacaoKg;
  }
}
