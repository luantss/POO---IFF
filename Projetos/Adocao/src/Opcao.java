import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Opcao {
  
  Scanner leia = new Scanner(System.in);

  public void OpcaoCadastrar(List<Adotante> listaAdotante, List<Animal> listaAnimal, List<Funcionario> listaFunc) {

    int opcao;
    while(true) {
      System.out.println("\n\n--------- Cadastro ---------");
      System.out.print(
        "\n(1)-Cadastrar Adotante"+
        "\n(2)-Cadastrar Animal"+
        "\n(3)-Cadastrar Funcionárie"+
        "\n(0)-Voltar\n"+
        "\nDigite a opção:"
      );
      try {
        opcao = leia.nextInt();

      } catch (InputMismatchException exception) {
        System.out.println("Caracter inválido!");
        leia.nextLine();
        continue;
      }

      if(opcao == 0) {
        break;
      } else {
        switch(opcao) {
          case 1:
            Adotante objetoAdotante = new Adotante();
            objetoAdotante.cadastrarAdotante(listaAdotante);
            break;
          case 2:
            Animal objetoAnimal = new Animal();
            objetoAnimal.cadastrarAnimal(listaAnimal);
            break;
          case 3:
            Funcionario objetoFuncionario = new Funcionario();
            objetoFuncionario.cadastrarFuncionario(listaFunc);
            break;
          default:
            System.out.println("Opção inválida!");
        }
      }
    }
  }

  public void OpcaoListar(List<Adotante> listaAdotante, List<Animal> listaAnimal, List<Funcionario> listaFunc) {

    int opcao;
    while(true) {
      System.out.println("\n\n--------- Listar ---------");
      System.out.print(
        "\n(1)-Listar Adotante"+
        "\n(2)-Listar Animal"+
        "\n(3)-Listar Funcionárie"+
        "\n(0)-Voltar\n"+
        "\nDigite a opção:"
      );

      try {
        opcao = leia.nextInt();

      } catch (InputMismatchException exception) {
        System.out.println("Caracter inválido!");
        leia.nextLine();
        continue;
      }

      if(opcao == 0) {
        break;
      } else {
        switch(opcao) {

          case 1:
            Adotante objetoAdotante = new Adotante();
            objetoAdotante.listarAdotante(listaAdotante);
            break;
          case 2:
            Animal objetoAnimal = new Animal();
            objetoAnimal.listarAnimal(listaAnimal);
            break;
          case 3:
            Funcionario objetoFuncionario = new Funcionario();
            objetoFuncionario.listarFuncionario(listaFunc);
            break;
          default:
            System.out.print("\nOpçãp inválida!");
        }
      }
    }
  }

  public void OpcaoConsultar(List<Adotante> listaAdotante, List<Animal> listaAnimal, List<Funcionario> listaFunc) {

    int opcao;
    while(true) {

      System.out.println("\n\n--------- Consultar ---------");
      System.out.print(
        "\n(1)-Consultar Adotante"+
        "\n(2)-Consultar Animal"+
        "\n(3)-Consultar Funcionárie"+
        "\n(0)-Voltar\n"+
        "\nDigite a opção:"
      );

      try {
        opcao = leia.nextInt();

      } catch (InputMismatchException exception) {
        System.out.println("Caracter inválido!");
        leia.nextLine();
        continue;
      }

      if(opcao == 0) {
        break;
      } else {
        switch(opcao) {

          case 1:
            Adotante objetoAdotante = new Adotante();
            objetoAdotante.consultarAdotanteIndex(listaAdotante);
            break;
          case 2:
            Animal objetoAnimal = new Animal();
            objetoAnimal.consultarIndexAnimal(listaAnimal);
            break;
          case 3:
            Funcionario objetoFuncionario = new Funcionario();
            objetoFuncionario.consultarIndexFuncionario(listaFunc);
            break;
          default:
            System.out.print("\nOpção inválida!");
        }
      }
    }
  }

  public void OpcaoExcluir(List<Adotante> listaAdotante, List<Animal> listaAnimal, List<Funcionario> listaFunc) {

    int opcao;
    while(true) {

      System.out.println("\n\n--------- Excluir ---------");
      System.out.print(
        "\n(1)-Excluir Adotante"+
        "\n(2)-Excluir Animal"+
        "\n(3)-Excluir Funcionárie"+
        "\n(0)-Voltar\n"+
        "\nDigite a opção:"
      );

      try {
        opcao = leia.nextInt();

      } catch (InputMismatchException exception) {
        System.out.println("Caracter inválido!");
        leia.nextLine();
        continue;
      }

      if(opcao == 0) {
        break;
      } else {
        switch(opcao) {

          case 1:
            Adotante objetoAdotante = new Adotante();
            objetoAdotante.excluirAdotante(listaAdotante);
            break;
          case 2:
            Animal objetoAnimal = new Animal();
            objetoAnimal.excluirAnimal(listaAnimal);
            break;
          case 3:
            Funcionario objetoFuncionario = new Funcionario();
            objetoFuncionario.excluirFuncionario(listaFunc);
            break;
          default:
            System.out.print("Opção inválida!");
        }
      }
    }
  }

  public void opcaoAlterar(List<Adotante> listaAdotante, List<Animal> listaAnimal, List<Funcionario> listaFunc) {

    int opcao;
    while(true) {

      System.out.println("\n\n--------- Alterar ---------");
      System.out.print(
        "\n(1)-Alterar Adotante"+
        "\n(2)-Alterar Animal"+
        "\n(3)-Alterar Funcionárie"+
        "\n(0)-Voltar\n"+
        "\nDigite a opção:"
      );

      try {
        opcao = leia.nextInt();
      } catch (InputMismatchException exception) {
        System.out.println("Caracter inválido!");
        leia.nextLine();
        continue;
      }

      if(opcao == 0) {
        break;
      } else {
        switch(opcao) {

          case 1:
            Adotante objetoAdotante = new Adotante();
            objetoAdotante.alterarAdotante(listaAdotante);
            break;
          case 2:
            Animal objetoAnimal = new Animal();
            objetoAnimal.alterarAnimal(listaAnimal);
            break;
          case 3:
            Funcionario objetoFuncionario = new Funcionario();
            objetoFuncionario.alterarFuncionario(listaFunc);
            break;
          default:
            System.out.print("\nOpção inválida!");
        }
      }
    }
  }
}
