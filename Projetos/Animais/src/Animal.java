public class Animal {
  
  // Declaração dos atributos da classe 
  // O modificador 'private' impede que outro código externo a Classe 'Animal' tenha acesso aos atributos de 'Animal'
  private String nomeAnimal;
  private String racaAnimal;
  private int idade;
  private double peso;

  // Declaração do método construtor
  // O construtor é responsável por criar o objeto em memória
  public Animal(String nomeAnimal, String racaAnimal, int idade, double peso)
  {
    // A palavra chave 'this' serve para fazer referência a variável de classe 
    // 'nomeAnimal' ao lado direito do '=' faz referência a variável declarada como parâmetro no método construtor
    this.nomeAnimal = nomeAnimal;
    this.racaAnimal = racaAnimal;
    this.idade = idade;
    this.peso = peso;
  }

  // Método para imprimir info do animal
  public void imprimirInfo() 
  {
    System.out.print("============= Animal =============");
    System.out.print("\nNome: "+nomeAnimal+"\nRaça: "+racaAnimal+"\nIdade: "+idade+"\nPeso: "+peso);
  }

  // Getters e Setters
  // Os getters são responsáveis por retornar os valores definidos 
  // Os setters são responsáveis por fazer alterações nos campos de um objeto 'Animal'
  public String getNomeAnimal() {
    return nomeAnimal;
  }

  public void setNomeAnimal(String nomeAnimal) {
    this.nomeAnimal = nomeAnimal;
  }

  public String getRacaAnimal() {
    return racaAnimal;
  }

  public void setRacaAnimal(String racaAnimal) {
    this.racaAnimal = racaAnimal;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public double getPeso() {
    return peso;
  }

  public void setPeso(double peso) {
    this.peso = peso;
  }

}
