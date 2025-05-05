package SistemaBancario;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Banco banco = new Banco();
    Scanner sc = new Scanner(System.in);

    while (true){
      System.out.println("ENTRADA DO SISTEMA");
      System.out.println("1.Criar Conta\n2.Sitema Bancario\n3.Sair");
      System.out.print("Escolha um da opções acima: ");
      int escolha = sc.nextInt();
      sc.nextLine();

      switch (escolha){
        case 1:{
          System.out.print("Digite seu nome: ");
          String nome = sc.nextLine();

          System.out.print("Digite seu sobrenome: ");
          String sobrenome = sc.nextLine();

          System.out.print("Digite seu idade: ");
          int idade = sc.nextInt();
          sc.nextLine();

          System.out.print("Digite seu número da conta: ");
          String numConta = sc.nextLine();

          Cliente cliente = new Cliente(nome, sobrenome, idade, numConta);
          Conta novaConta = new Conta(cliente);
          banco.adicionarConta(novaConta);

          System.out.println("Conta criada com sucesso!");
          break;

        }

        case 2:{

          System.out.println("Digite o número da sua conta: ");
          String numConta = sc.nextLine();
          Conta contaAtual = banco.buscarPorNumero(numConta);

          if(contaAtual == null){
            System.out.println("Conta não encontrada!");
            break;
          }

          int sair = 0;
          while (sair == 0){

            System.out.println("SISTEMA BANCARIO");
            System.out.println(" ");
            System.out.println("Bem vindo " + contaAtual.getCliente().getNome());
            System.out.println(" ");
            System.out.println("1. Saque\n2. Deposito\n3. Transfêrencia\n4. Exibir Saldo\n5. Sair");
            System.out.print("Escolha um da opções acima: ");
            int opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
              case 1: {
                System.out.print("Valor para saque: ");
                double valor = sc.nextDouble();
                contaAtual.saque(valor);
                break;
              }

              case 2:{
                System.out.print("Valor para depósito: ");
                double valor = sc.nextDouble();
                contaAtual.depositar(valor);
                break;
              }

              case 3:{
                System.out.print("Número da conta de destino: ");
                String destinoNum = sc.nextLine();
                Conta destino = banco.buscarPorNumero(destinoNum);
                if (destino == null) {
                  System.out.println("Conta destino não encontrada.");
                  break;
                }
                System.out.print("Valor da transferência: ");
                double valorTransf = sc.nextDouble();
                contaAtual.transferencia(destino, valorTransf );
                break;
              }

              case 4:{
                contaAtual.exibirSaldo();
                break;
              }

              case 5:{
                System.out.println("Saindo da Conta");
                sair = 1;
                break;

              }
              default:
                System.out.println("Opção inválida");

            }
          }
          break;
        }
        case 3:{
          System.out.println("Saindo do sistema");
          sc.close();
          return;
        }
        default:
          System.out.println("Opção inválida.");
      }
    }


  }
}
