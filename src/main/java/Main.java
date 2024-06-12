import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);

    System.out.println("digite seu primeiro nome:");
    String nome = sc.next();

    System.out.println("digite seu sobrenome:");
    String sobrenome = sc.next();
    System.out.println(" seu nome completo é:" + nome + " " + sobrenome);
    
    System.out.println("digite a sua idade:");
    String idade = sc.next();

    System.out.println("digite a sua altura:");
    String altura = sc.next();

    System.out.println("digite a sua massa:");
    String massa = sc.next();

    System.out.println("fórmula para calcular o IMC:");
    System.out.println("IMC = massa/(altura*altura");
    
    System.out.println("digite o resultado da fórmula:");
    String resultado = sc.next();

    sc.close();

  }
}