package validadorDeCPF;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("VALIDADOR DE CPF");
    System.out.println(" ");
    System.out.print("Digite um CPF: ");
    String cpf = sc.nextLine();
    System.out.println("Resposta: ");
    System.out.println(Validador.validarCpf(cpf));

  }


}

