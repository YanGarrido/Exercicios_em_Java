package SistemaBancario;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Yan", "Garrido", 20,"123");
        Cliente cliente2 = new Cliente("João", "Carvalho", 39,"321");

        Conta conta1 = new Conta(cliente1);
        Conta conta2 = new Conta(cliente2);
        int sair = 0;

        Scanner sc = new Scanner(System.in);

        while (sair == 0){
            System.out.println("SISTEMA BANCARIO");
            System.out.println("1. Saque\n2. Deposito\n3. Transfêrencia\n4. Exibir Saldo\n5. Sair");
            System.out.print("Escolha um da opções acima: ");
            int escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha){
                case 1: {
                    System.out.print("Digite o valor que deseja sacar: ");
                    double valor = sc.nextDouble();
                    conta1.saque(valor);
                    break;
                }
                case 2:{
                    System.out.print("Valor que deseja depositar na sua conta: ");
                    double valor = sc.nextDouble();
                    conta1.depositar(valor);
                    break;
                }
                case 3:{
                    System.out.println("Valor a transferir");
                    double valor = sc.nextDouble();
                    conta1.transferencia(conta2, valor );
                    break;
                }
                case 4:{
                    conta1.exibirSaldo();
                    break;
                }
                case 5:{
                    System.out.println("Saindo do sistema");
                    sair = 1;
                    break;

                }
                default:
                    System.out.println("Escolha inválida");
                    break;
            }
        }
    }
}
