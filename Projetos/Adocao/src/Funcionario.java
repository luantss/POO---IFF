import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Funcionario extends Pessoa{
  
  Scanner leia = new Scanner(System.in);

  // Declarar os atributos
  private String setorFuncionario;
  private double salarioFuncionario;

  // Método construtor
  public Funcionario(int idPessoa, String nomePessoa, int idadePessoa, long telefonePessoa,
  String setorFuncionario, double salarioFuncionario) 
  {
    super(idPessoa, nomePessoa, idadePessoa, telefonePessoa);
    this.setorFuncionario = setorFuncionario;
    this.salarioFuncionario = salarioFuncionario;
  }

  // Construtor vazio
  public Funcionario() {
    super();
    this.setorFuncionario = null;
    this.salarioFuncionario = 0;
  }

  // Função de cadastrar
  public void cadastrarFuncionario(List<Funcionario> listaFunc) {

    while(true) {
      try {
        Funcionario objeto = new Funcionario();
        System.out.print("\nDigite o id do funcionárie: ");
        objeto.setIdPessoa(leia.nextInt());
        leia.nextLine();
        System.out.print("\nDigite o nome do funcionárie: ");
        objeto.setNomePessoa(leia.nextLine());
        System.out.print("\nDigite a idade do funcionárie: ");
        objeto.setIdadePessoa(leia.nextInt());
        System.out.print("\nDigite o telefone do funcionárie: ");
        objeto.setTelefonePessoa(leia.nextLong());
        leia.nextLine();
        System.out.print("Digite o setorFuncionario do funcionárie: ");
        objeto.setsetorFuncionario(leia.nextLine());
        System.out.print("\nDigite o salário do funcionárie: ");
        objeto.setsalarioFuncionario(leia.nextDouble());
        listaFunc.add(objeto);
        System.out.println("Cadastro realizado com sucesso!");
        break;

      } catch (InputMismatchException exception) {
        System.out.println("Caracter inválido!");
        leia.nextLine();
        continue;
      }
    }
  }

  // Consultar um funcionário pelo index
  public void consultarIndexFuncionario(List<Funcionario> listaFunc) {
    
    while(true) {
      
      try {     
        try {
          int index;
          System.out.println("Digite a posição que você deseja consultar: ");
          index = leia.nextInt();
          System.out.print(
          "\n--------------------------------------------"+
          "\nId: "+listaFunc.get(index).getIdPessoa()+
          "\nNome: "+listaFunc.get(index).getNomePessoa()+
          "\nIdade: "+listaFunc.get(index).getIdadePessoa()+
          "\nTelefone: "+listaFunc.get(index).getTelefonePessoa()+
          "\nSetor: "+listaFunc.get(index).getsetorFuncionario()+
          "\nSalário: "+listaFunc.get(index).getsalarioFuncionario()+
          "\n--------------------------------------------"
          );
          break;
        } catch (InputMismatchException exception) {
          System.out.println("Caracter inválido!");
          leia.nextLine();
          continue;
        }
      } catch (IndexOutOfBoundsException exc) {
        System.out.println("Posição inexistente");
        continue;
      }
    }
  }

  // Função de listar todos os funcionários
  public void listarFuncionario(List<Funcionario> listaFunc) {

    int contador = 0;
    for(Funcionario objeto : listaFunc) {
      System.out.print(
      "\n--------------------------------------------"+
      "\nPosição: "+contador+
      "\nId: "+objeto.getIdPessoa()+
      "\nNome: "+objeto.getNomePessoa()+
      "\nSetor: "+objeto.getsetorFuncionario()+
      "\n--------------------------------------------");
      contador++;
    }
  }

  // Função de excluir funcionário
  public void excluirFuncionario(List<Funcionario> listaFunc) {

    while(true) {
      try {
        int index, resposta;
        System.out.print("Digite a posição do funcionárie que deseja excluir: ");
        index = leia.nextInt();
        System.out.print(
        "\n--------------------------------------------"+
        "\nId: "+listaFunc.get(index).getIdPessoa()+
        "\nNome: "+listaFunc.get(index).getNomePessoa()+
        "\nIdade: "+listaFunc.get(index).getIdadePessoa()+
        "\nTelefone: "+listaFunc.get(index).getTelefonePessoa()+
        "\nSetor: "+listaFunc.get(index).getsetorFuncionario()+
        "\nSalário: "+listaFunc.get(index).getsalarioFuncionario()+
        "\n--------------------------------------------"
        );
        System.out.print("\nTem certeza que deseja excluir esse funcionarie?");
        System.out.print("\n(1)-Sim\n(2)-Não\n");
        resposta = leia.nextInt();
        if(resposta == 1) {
          listaFunc.remove(index);
          System.out.print("\nExcluído com sucesso!");
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

  // Função alterar funcionario
  public void alterarFuncionario(List<Funcionario> listaFunc) {

    while(true) {
      try {
        int index, resposta;
        System.out.print("\nDigite a posição do que funcionarie deseja alterar: ");
        index = leia.nextInt();
        System.out.print(
        "\n--------------------------------------------"+
        "\nId: "+listaFunc.get(index).getIdPessoa()+
        "\nNome: "+listaFunc.get(index).getNomePessoa()+
        "\nIdade: "+listaFunc.get(index).getIdadePessoa()+
        "\nTelefone: "+listaFunc.get(index).getTelefonePessoa()+
        "\nSetor: "+listaFunc.get(index).getsetorFuncionario()+
        "\nSalário: "+listaFunc.get(index).getsalarioFuncionario()+
        "\n--------------------------------------------"
        );
        System.out.print("\nTem certeza que deseja alterar esse funcionarie?");
        System.out.print("\n(1)-Sim\n(2)-Não\n");
        resposta = leia.nextInt();
        if(resposta == 1) {
          Funcionario objeto = new Funcionario();
          System.out.print("\nDigite o id do funcionarie: ");
          objeto.setIdPessoa(leia.nextInt());
          leia.nextLine();
          System.out.print("\nDigite o nome do funcionarie: ");
          objeto.setNomePessoa(leia.nextLine());
          System.out.print("\nDigite a idade do funcionarie: ");
          objeto.setIdadePessoa(leia.nextInt());
          System.out.print("\nDigite o telefone do funcionarie: ");
          objeto.setTelefonePessoa(leia.nextLong());
          leia.nextLine();
          System.out.print("\nDigite o setor do funcionarie: ");
          objeto.setsetorFuncionario(leia.nextLine());
          System.out.print("\nDigite o salario do funcionarie: ");
          objeto.setsalarioFuncionario(leia.nextDouble());
          listaFunc.remove(index);
          listaFunc.add(objeto);
          System.out.print("\nAlteração realizada com sucesso: ");
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
  
  public String getsetorFuncionario() {
    return this.setorFuncionario;
  }

  public void setsetorFuncionario(String setorFuncionario) {
    this.setorFuncionario = setorFuncionario;
  }

  public double getsalarioFuncionario() {
    return this.salarioFuncionario;
  }

  public void setsalarioFuncionario(double salarioFuncionario) {
    this.salarioFuncionario = salarioFuncionario;
  }
}
