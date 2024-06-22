import java.util.Scanner;

public class Contador {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.print("Digite o primeiro parâmetro: ");
    int parametro1 = sc.nextInt();
    System.out.print("Digite o segundo parâmetro: ");
    int parametro2 = sc.nextInt();

    try {
      contar(parametro1, parametro2);

    } catch (ParametrosInvalidosException e) {
      System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }
    sc.close();
  }

  static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {
    if (parametro1 >= parametro2) {
      throw new ParametrosInvalidosException();
    } else {
      int contagem = parametro2 - parametro1;
      System.out.println("Foram contados " + contagem + " números.");
      for (int i = 1; i < contagem + 1; i++) {
        System.out.println("Imprimindo o número " + i);
      }
    }
  }
}
