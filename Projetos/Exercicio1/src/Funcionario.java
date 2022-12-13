public class Funcionario {
  
  // Declaração dos atributos
  private String nome;
  private String departamento;
  private double salario;
  private String dataEntrada;
  private String rg;
  private Boolean ativo;

  // Método construtor
  public Funcionario(String nome, String departamento, double salario, String dataEntrada, String rg, Boolean ativo) {

    this.nome = nome;
    this.departamento = departamento;
    this.salario = salario;
    this.dataEntrada = dataEntrada;
    this.rg = rg;
    this.ativo = ativo;
  }

  // Construtor vazio
  // public Funcionario() {

  //   this.nome = null;
  //   this.departamento = null;
  //   this.salario = 0;
  //   this.dataEntrada = null;
  //   this.rg = null;
  //   this.ativo = false;
  // }

  // Método bonifica
  public void bonifica(double valor) {
    this.salario += valor;
  }

  // Método demitir
  public void demite() {
    this.ativo = false;
  }

  // Método de imprimir informações
  public void mostra() {
    System.out.print(
      "Nome: "+getNome()+
      "\nDepartamento: "+getDepartamento()+
      "\nSalário: R$"+getSalario()+
      "\nData de Entrada: "+getDataEntrada()+
      "\nRG: "+getRg()
    );
    if(getAtivo() == true) {
      System.out.print("\nEstá ativo: Sim");
    } else {
      System.out.print("\nEstá ativo: Não");
    }
  }

  // Getters e Setters
  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDepartamento() {
    return this.departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }

  public double getSalario() {
    return this.salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public String getDataEntrada() {
    return this.dataEntrada;
  }

  public void setDataEntrada(String dataEntrada) {
    this.dataEntrada = dataEntrada;
  }

  public String getRg() {
    return this.rg;
  }

  public void setRg(String rg) {
    this.rg = rg;
  }

  public Boolean getAtivo() {
    return this.ativo;
  }

  public void setAtivo(Boolean ativo) {
    this.ativo = ativo;
  }
}
