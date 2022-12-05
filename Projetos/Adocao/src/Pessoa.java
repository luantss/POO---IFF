public class Pessoa {

  // Declaração dos atributos
  private int idPessoa;
  private String nomePessoa;
  private int idadePessoa;
  private long telefonePessoa;

  // Método construtor
  public Pessoa(int idPessoa, String nomePessoa, int idadePessoa, long telefonePessoa) 
  {
    this.idPessoa = idPessoa;
    this.nomePessoa = nomePessoa;
    this.idadePessoa = idadePessoa;
    this.telefonePessoa = telefonePessoa;
  }

  // Contrutor vazio
  public Pessoa() 
  {
    this.idPessoa = 0;
    this.nomePessoa = null;
    this.idadePessoa = 0;
    this.telefonePessoa = 0;
  }

  public int getIdPessoa() {
    return this.idPessoa;
  }

  public void setIdPessoa(int idPessoa) {
    this.idPessoa = idPessoa;
  }

  public String getNomePessoa() {
    return this.nomePessoa;
  }

  public void setNomePessoa(String nomePessoa) {
    this.nomePessoa = nomePessoa;
  }

  public int getIdadePessoa() {
    return this.idadePessoa;
  }

  public void setIdadePessoa(int idadePessoa) {
    this.idadePessoa = idadePessoa;
  }

  public long getTelefonePessoa() {
    return this.telefonePessoa;
  }

  public void setTelefonePessoa(long telefonePessoa) {
    this.telefonePessoa = telefonePessoa;
  }
}
