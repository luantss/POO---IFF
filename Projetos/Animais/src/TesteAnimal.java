public class TesteAnimal {
  
  public static void main(String[] args) {
    
    // Instanciando o 'dog1' da classe 'cachorro'
    Cachorro dog1 = new Cachorro("Aurora", "SRD",
    6, 16.3, "Casa grande", "Croc", 9.97);

    // Instanciando o 'sloth1' da classe 'preguica'
    Preguica sloth1 = new Preguica("Cleide", "Raça 1",
    2, 15, "Floresta Tropical", 16);

    // Chamando os métodos de imprimir info do 'dog1' e 'sloth1'
    dog1.imprimirInfoCachorro();
    sloth1.imprimirInfoPreguica();
  }
}
