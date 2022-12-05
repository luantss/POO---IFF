import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MenuFuncionario {
  
  public static void main(String[] args) {
    
    List<Adotante> listaAdotante = new ArrayList<Adotante>();
    List<Animal> listaAnimal = new ArrayList<Animal>();
    List<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
    Opcao op = new Opcao();
    int resposta;
    Scanner leia = new Scanner(System.in);

    while(true) {
      System.out.print("\n---------- Menu Funcionárie ----------");
      System.out.print(
      "\n(1)-Cadastrar"+
      "\n(2)-Consultar"+
      "\n(3)-Listar"+
      "\n(4)-Excluir"+
      "\n(5)-Alterar"+
      "\n(0)-Sair do programa"+
      "\nDigite sua opção: "
      );

      try {
        resposta = leia.nextInt();
      } catch (InputMismatchException exception) {
        System.out.println("Caracter inválido!");
        leia.nextLine();
        continue;
      }

      if(resposta == 0) {
        System.out.println("Programa finalizado!");
        break;
      } else {
        switch(resposta) {

          case 1:
            op.OpcaoCadastrar(listaAdotante, listaAnimal, listaFuncionario);
            break;
          case 2:
            op.OpcaoConsultar(listaAdotante, listaAnimal, listaFuncionario);
            break;
          case 3:
            op.OpcaoListar(listaAdotante, listaAnimal, listaFuncionario);
            break;
          case 4:
            op.OpcaoExcluir(listaAdotante, listaAnimal, listaFuncionario);
            break;
          case 5:
            op.opcaoAlterar(listaAdotante, listaAnimal, listaFuncionario);
            break;
          default:
            System.out.print("\nOpção inválida!");
        }
      }
    }
  }
}
