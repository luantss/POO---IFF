import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MenuAdotante {
  
  public static void main(String[] args) {
    
    List<Animal> listaAnimal = new ArrayList<Animal>();
    Animal objetoAnimal = new Animal();
    int resposta;
    Scanner leia = new Scanner(System.in);

    while(true) {
      System.out.print("\n---------- Menu Adotante ----------");
      System.out.print(
      "\n(1)-Listar Animal"+
      "\n(2)-Consultar Animal"+
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
        System.out.print("\nPrograma finizalido!");
        break;
      } else {
        switch(resposta) {

          case 1:
            objetoAnimal.listarAnimal(listaAnimal);
            break;
          case 2:
            objetoAnimal.consultarIndexAnimal(listaAnimal);
            break;
          default:
            System.out.println("Opção inválida!");
        }
      }
    }
    
  }
}
