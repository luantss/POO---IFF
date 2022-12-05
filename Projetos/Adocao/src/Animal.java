import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Animal {
  
  Scanner leia = new Scanner(System.in);

  // Declaração dos atributos
  private int idAnimal;
  private String tipoAnimal;
  private String nomeAnimal;
  private String racaAnimal;
  private int idadeAnimal;
  private double pesoAnimal;
  private String petiscoFav;

  // Método construtor
  public Animal(int idAnimal, String tipoAnimal, String nomeAnimal, String racaAnimal, int idadeAnimal, 
  double pesoAnimal, String petiscoFav) 
  {
    this.idAnimal = idAnimal;
    this.tipoAnimal = tipoAnimal;
    this.nomeAnimal = nomeAnimal;
    this.racaAnimal = racaAnimal;
    this.idadeAnimal = idadeAnimal;
    this.pesoAnimal = pesoAnimal;
    this.petiscoFav = petiscoFav;
  }

  // Construtor vazio
  public Animal() {
    this.idAnimal = 0;
    this.tipoAnimal = null;
    this.nomeAnimal = null;
    this.racaAnimal = null;
    this.idadeAnimal = 0;
    this.pesoAnimal = 0;
    this.petiscoFav = null;
  }

  // Função cadastrar animal
  public void cadastrarAnimal(List<Animal> listaAnimal) {

    while(true) {
      // Try...catch para tratamento de exceções
      try {
        // Instanciando objeto animal
        Animal objeto = new Animal();
        // Pedindo a entrada de dados
        System.out.print("\nDigite o ID do animal: ");
        // Atribuindo o valor digitado no teclado ao id do objeto animal
        objeto.setIdAnimal(leia.nextInt());
        leia.nextLine();
        System.out.print("\nDigite o tipo de animal: ");
        objeto.setTipoAnimal(leia.nextLine());
        System.out.print("\nDigite o nome do animal: ");
        objeto.setNomeAnimal(leia.nextLine());
        System.out.print("\nDigite a raça do animal: ");
        objeto.setRacaAnimal(leia.nextLine());
        System.out.print("\nDigite a idade do animal: ");
        objeto.setIdadeAnimal(leia.nextInt());
        System.out.print("\nDigite o peso do animal: ");
        objeto.setPesoAnimal(leia.nextDouble());
        leia.nextLine();
        System.out.print("\nDigite o petisco favorito do animal: ");
        objeto.setPetiscoFav(leia.nextLine());
        listaAnimal.add(objeto);
        System.out.println("Cadastro realizado com sucesso!");
        break;    
        
      } catch (InputMismatchException exception) {
        // Exceção de entrada de caracter inválido
        System.out.println("Caracter não válido!");
        leia.nextLine();
        continue;
      }
    }
  }

  // Função consultar animal pelo index da lista
  public void consultarIndexAnimal(List<Animal> listaAnimal) {
    
    while(true) {
      try {
        try {
          int index;
          System.out.print("\nDigite a posição que você deseja consultar: ");
          index = leia.nextInt();
          System.out.print(
          "\n--------------------------------------------"+
          "\nId: "+listaAnimal.get(index).getIdAnimal()+
          "\nTipo: "+listaAnimal.get(index).getTipoAnimal()+
          "\nNome: "+listaAnimal.get(index).getNomeAnimal()+
          "\nRaça: "+listaAnimal.get(index).getRacaAnimal()+
          "\nIdade: "+listaAnimal.get(index).getIdadeAnimal()+
          "\nPeso: "+listaAnimal.get(index).getPesoAnimal()+
          "\nPetisco: "+listaAnimal.get(index).getPetiscoFav()+
          "\n--------------------------------------------");
          break;
        } catch (InputMismatchException exception) {
          System.out.println("Caracter não válido!");
          leia.nextLine();
          continue;
        }
      } catch (IndexOutOfBoundsException exc) {
        System.out.println("Posição inexistente!");
        continue;
      }
    }
  }

  // Função listar todos os animais
  public void listarAnimal(List<Animal> listaAnimal) {

    int contador = 0;
    for(Animal objeto : listaAnimal) {
      System.out.print(
      "\n--------------------------------------------"+
      "\nPosição: "+contador+
      "\nId: "+objeto.getIdAnimal()+
      "\nTipo: "+objeto.getTipoAnimal()+
      "\nNome: "+objeto.getNomeAnimal()+
      "\nIdade: "+objeto.getIdadeAnimal()+
      "\n--------------------------------------------");
      contador++;
    }
  }

  // Função excluir animal
  public void excluirAnimal(List<Animal> listaAnimal) {

    while(true) {
      try {
        int index, resposta;
        System.out.print("\nDigite a posição do animal que deseja excluir: ");
        index = leia.nextInt();
        System.out.print(
        "\n--------------------------------------------"+
        "\nId: "+listaAnimal.get(index).getIdAnimal()+
        "\nTipo: "+listaAnimal.get(index).getTipoAnimal()+
        "\nNome: "+listaAnimal.get(index).getNomeAnimal()+
        "\nRaça: "+listaAnimal.get(index).getRacaAnimal()+
        "\nIdade: "+listaAnimal.get(index).getIdadeAnimal()+
        "\nPeso: "+listaAnimal.get(index).getPesoAnimal()+
        "\nPetisco: "+listaAnimal.get(index).getPetiscoFav()+
        "\n--------------------------------------------");
        System.out.print("\nTem certeza que deseja excluir esse animal?");
        System.out.print("\n(1)-Sim\n(2)-Não\n");
        resposta = leia.nextInt();
        if(resposta == 1) {
          listaAnimal.remove(index);
          System.out.println("Excluído com sucesso!");
          break;
        } else {
          if(resposta != 1 && resposta != 2) {
            System.out.println("Opção inválida!");
          }
        }
      } catch (InputMismatchException exception) {
        System.out.println("Caracter não válido!");
        leia.nextLine();
        continue;
      }
    }
  }

  public void alterarAnimal(List<Animal> listaAnimal) {
    while(true) {
      try {
        int index, resposta;
        System.out.print("\nDigite a posição do animal que deseja alterar: ");
        index = leia.nextInt();
        System.out.print(
        "\n--------------------------------------------"+
        "\nId: "+listaAnimal.get(index).getIdAnimal()+
        "\nTipo: "+listaAnimal.get(index).getTipoAnimal()+
        "\nNome: "+listaAnimal.get(index).getNomeAnimal()+
        "\nRaça: "+listaAnimal.get(index).getRacaAnimal()+
        "\nIdade: "+listaAnimal.get(index).getIdadeAnimal()+
        "\nPeso: "+listaAnimal.get(index).getPesoAnimal()+
        "\nPetisco: "+listaAnimal.get(index).getPetiscoFav()+
        "\n--------------------------------------------");
        System.out.print("\nTem certeza que deseja alterar esse animal?");
        System.out.print("\n(1)-Sim\n(2)-Não\n");
        resposta = leia.nextInt();
        if(resposta == 1) {
          Animal objeto = new Animal();
          System.out.print("\nDigite o ID do animal: ");
          objeto.setIdAnimal(leia.nextInt());
          leia.nextLine();
          System.out.print("\nDigite o tipo de animal: ");
          objeto.setTipoAnimal(leia.nextLine());
          System.out.print("\nDigite o nome do animal: ");
          objeto.setNomeAnimal(leia.nextLine());
          System.out.print("\nDigite a raça do animal: ");
          objeto.setRacaAnimal(leia.nextLine());
          System.out.print("\nDigite a idade do animal: ");
          objeto.setIdadeAnimal(leia.nextInt());
          System.out.print("\nDigite o peso do animal: ");
          objeto.setPesoAnimal(leia.nextDouble());
          leia.nextLine();
          System.out.print("\nDigite o petisco favorito do animal: ");
          objeto.setPetiscoFav(leia.nextLine());
          listaAnimal.remove(index);
          listaAnimal.add(objeto);
          System.out.println("Alteração realizada com sucesso!");
          break;
        } else {
          if(resposta != 1 && resposta != 2) {
            System.out.println("Opção inválida!");
          }
        }

      } catch (InputMismatchException exception) {
        System.out.println("Caracter não válido!");
        leia.nextLine();
        continue;
      }
    }
  }


  public int getIdAnimal() {
    return this.idAnimal;
  }

  public void setIdAnimal(int idAnimal) {
    this.idAnimal = idAnimal;
  }

  public String getTipoAnimal() {
    return this.tipoAnimal;
  }

  public void setTipoAnimal(String tipoAnimal) {
    this.tipoAnimal = tipoAnimal;
  }

  public String getNomeAnimal() {
    return this.nomeAnimal;
  }

  public void setNomeAnimal(String nomeAnimal) {
    this.nomeAnimal = nomeAnimal;
  }

  public String getRacaAnimal() {
    return this.racaAnimal;
  }

  public void setRacaAnimal(String racaAnimal) {
    this.racaAnimal = racaAnimal;
  }

  public int getIdadeAnimal() {
    return this.idadeAnimal;
  }

  public void setIdadeAnimal(int idadeAnimal) {
    this.idadeAnimal = idadeAnimal;
  }

  public double getPesoAnimal() {
    return this.pesoAnimal;
  }

  public void setPesoAnimal(double pesoAnimal) {
    this.pesoAnimal = pesoAnimal;
  }

  public String getPetiscoFav() {
    return this.petiscoFav;
  }

  public void setPetiscoFav(String petiscoFav) {
    this.petiscoFav = petiscoFav;
  }

}
