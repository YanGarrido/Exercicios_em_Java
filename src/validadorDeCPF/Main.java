package validadorDeCPF;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
  public static void main(String[] args) {
    Validador validador = new Validador();
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um CPF: ");
    String cpf = sc.nextLine();
    System.out.println(validador.validarCpf(cpf));

  }


}

