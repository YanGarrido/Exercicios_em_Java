package sistemaDeLoginComHash;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    SistemaLogin sistema = new SistemaLogin();
    Scanner sc = new Scanner(System.in);
    int opcao;

    do{
      System.out.println("\n1 - Cadastrar\n2 - Login\n0 - Sair");
      System.out.print("Escolha: ");
      opcao = sc.nextInt();
      sc.nextLine();

      switch (opcao) {
        case 1:
          System.out.print("Nome: ");
          String nomeCad = sc.nextLine();
          System.out.print("Senha: ");
          String senhaCad = sc.nextLine();
          sistema.cadastrar(nomeCad,senhaCad);
          break;

        case 2:
          System.out.print("Nome: ");
          String nomeLogin = sc.nextLine();
          System.out.print("Senha: ");
          String senhaLogin = sc.nextLine();
          sistema.login(nomeLogin,senhaLogin);
          break;
      }
    } while (opcao != 0);

    sc.close();


  }
}
