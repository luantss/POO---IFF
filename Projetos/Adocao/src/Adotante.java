import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Adotante extends Pessoa{
  
  Scanner leia = new Scanner(System.in);

  // Declaração dos atributos
  private long cpfAdotante;
  private String preferenciaAdotar;

  // Método construtor
  // Cria um objeto em memória recebendo como parametro os atributos da superclasse 'pessoa' e da classe 'adotante'
  public Adotante(int idPessoa, String nomePessoa, int idadePessoa, long telefonePessoa,
  long cpfAdotante, String preferenciaAdotar) 
  {
    // O 'super' serve para chamar o construtor da superclasse 'pessoa' 
    super(idPessoa, nomePessoa, idadePessoa, telefonePessoa);

    // O 'this' serve para fazer referencia ao atributo da classe
    this.cpfAdotante = cpfAdotante;
    this.preferenciaAdotar = preferenciaAdotar;
  }

  // Construtor vazio
  public Adotante() {
    super();
    this.cpfAdotante = 0;
    this.preferenciaAdotar = null;
  }

  public void cadastrarAdotante(List<Adotante> listaAdotante) {

    while(true) {
      try {
        Adotante objeto = new Adotante();
        System.out.print("\nDigite o id do adotante: ");
        objeto.setIdPessoa(leia.nextInt());
        leia.nextLine();
        System.out.print("\nDigite o nome do adotante: ");
        objeto.setNomePessoa(leia.nextLine());
        System.out.print("\nDigite a idade do adotante: ");
        objeto.setIdadePessoa(leia.nextInt());
        System.out.print("\nDigite o telefone do adotante: ");
        objeto.setTelefonePessoa(leia.nextLong());
        System.out.print("\nDigite o CPF do adotante: ");
        objeto.setCpfAdotante(leia.nextLong());
        leia.nextLine();
        System.out.print("\nDigite a preferência de adoção do adotante: ");
        objeto.setPreferenciaAdotar(leia.nextLine());
        listaAdotante.add(objeto);
        System.out.print("Cadastro realizado com sucesso!");
        break;
      } catch (InputMismatchException exception) {
        System.err.println("Caracter inválido!");
        leia.nextLine();
        continue;
      }
    }
  }

  // Função consultar adotante pelo index
  public void consultarAdotanteIndex(List<Adotante> listaAdotante) {

    while(true) {
      try {
        try {
          int index;
          System.out.print("\nDigite a posição do adotante para consultar: ");
          index = leia.nextInt();
          System.out.print(
          "\n--------------------------------------------"+
          "\nId: "+listaAdotante.get(index).getIdPessoa()+
          "\nNome: "+listaAdotante.get(index).getNomePessoa()+
          "\nIdade: "+listaAdotante.get(index).getIdadePessoa()+
          "\nTelefone: "+listaAdotante.get(index).getTelefonePessoa()+
          "\nCPF: "+listaAdotante.get(index).getCpfAdotante()+
          "\nPreferência: "+listaAdotante.get(index).getPreferenciaAdotar()+
          "\n--------------------------------------------"
          );
          break;
        } catch (InputMismatchException exception) {
          System.out.println("Caracter inválido!");
          leia.nextLine();
          continue;
        }
      } catch (Exception e) {
        System.out.println("Posição inexistente!");
        continue;
      }
    }
  }

  // Função para listar adotantes
  public void listarAdotante(List<Adotante> listaAdotante) {

    int contador = 0;
    for(Adotante objeto : listaAdotante) {
      System.out.print(
      "\n--------------------------------------------"+
      "\nPosição: "+contador+
      "\nId: "+objeto.getIdPessoa()+
      "\nNome: "+objeto.getNomePessoa()+
      "\nPreferência: "+objeto.getPreferenciaAdotar()+
      "\n--------------------------------------------"
      );
      contador++;
    }
  }

  // Função excluir adotante
  public void excluirAdotante(List<Adotante> listaAdotante) {

    while(true) {
      try {
        int resposta, index;
        System.out.print("\nDigite a posição do adotante que deseja excluir: ");
        index = leia.nextInt();
        System.out.print(
        "\n--------------------------------------------"+
        "\nId: "+listaAdotante.get(index).getIdPessoa()+
        "\nNome: "+listaAdotante.get(index).getNomePessoa()+
        "\nIdade: "+listaAdotante.get(index).getIdadePessoa()+
        "\nTelefone: "+listaAdotante.get(index).getTelefonePessoa()+
        "\nCPF: "+listaAdotante.get(index).getCpfAdotante()+
        "\nPreferência: "+listaAdotante.get(index).getPreferenciaAdotar()+
        "\n--------------------------------------------"
        );
        System.out.print("\nTem certeza que deseja excluir esse adotante?");
        System.out.print("\n(1)-Sim\n(2)-Não\n");
        resposta = leia.nextInt();
        if(resposta == 1) {
          listaAdotante.remove(index);
          System.out.print("\nExcluído com sucesso!");
          break;
        } else {
          if(resposta != 1 && resposta != 2) {
            System.out.print("\nResposta inválida!");
          }
        }
      } catch (InputMismatchException exception) {
        System.out.println("Caracter inválido!");
        leia.nextLine();
        continue;
      }
    }
  }

  // Função alterar adotante
  public void alterarAdotante(List<Adotante> listaAdotante) {

    while(true) {
      try {
        int resposta, index;
        System.out.print("\nDigite a posição do adotante que deseja alterar: ");
        index = leia.nextInt();
        System.out.print(
        "\n--------------------------------------------"+
        "\nId: "+listaAdotante.get(index).getIdPessoa()+
        "\nNome: "+listaAdotante.get(index).getNomePessoa()+
        "\nIdade: "+listaAdotante.get(index).getIdadePessoa()+
        "\nTelefone: "+listaAdotante.get(index).getTelefonePessoa()+
        "\nCPF: "+listaAdotante.get(index).getCpfAdotante()+
        "\nPreferência: "+listaAdotante.get(index).getPreferenciaAdotar()+
        "\n--------------------------------------------"
        );
        System.out.print("\nTem certeza que deseja alterar esse adotante?");
        System.out.print("\n(1)-Sim\n(2)-Não\n");
        resposta = leia.nextInt();
        if(resposta == 1) {
          Adotante objeto = new Adotante();
          System.out.print("\nDigite o id do adotante: ");
          objeto.setIdPessoa(leia.nextInt());
          leia.nextLine();
          System.out.print("\nDigite o nome do adotante: ");
          objeto.setNomePessoa(leia.nextLine());
          System.out.print("\nDigite a idade do adotante: ");
          objeto.setIdadePessoa(leia.nextInt());
          System.out.print("\nDigite o telefone do adotante: ");
          objeto.setTelefonePessoa(leia.nextLong());
          System.out.print("\nDigite o CPF do adotante: ");
          objeto.setCpfAdotante(leia.nextLong());
          leia.nextLine();
          System.out.print("\nDigite a preferência de adoção do adotante: ");
          objeto.setPreferenciaAdotar(leia.nextLine());
          listaAdotante.remove(index);
          listaAdotante.add(objeto);
          System.out.print("\nAlteração realizada com sucesso!");
          break;
        } else {
          if(resposta != 1 && resposta != 2) {
            System.out.print("\nOpção inválida!");
          }
        }
      } catch (InputMismatchException exception) {
        System.out.println("Caracter inválido!");
        leia.nextLine();
        continue;
      }
    }
  }

  public long getCpfAdotante() {
    return this.cpfAdotante;
  }

  public void setCpfAdotante(long cpfAdotante) {
    this.cpfAdotante = cpfAdotante;
  }

  public String getPreferenciaAdotar() {
    return this.preferenciaAdotar;
  }

  public void setPreferenciaAdotar(String preferenciaAdotar) {
    this.preferenciaAdotar = preferenciaAdotar;
  }
}
