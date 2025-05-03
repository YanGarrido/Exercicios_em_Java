package SistemaBancario;

import java.util.Scanner;

public class Conta {
    Scanner sc = new Scanner(System.in);
    Cliente cliente;
    double saldo;

    public Conta(Cliente cliente){
        this.cliente = cliente;
        this.saldo = 0;
    }

    public double saque(double valorSaque){
        if(valorSaque <= 0){
            System.out.println("Valor inválido para saque");
        }
        if (valorSaque > saldo){
            System.out.println("Valor a sacar maior que o seu saldo");
        }
        saldo -= valorSaque;
        System.out.println("Saque realizado");
        return saldo;

    }
    public double depositar(double valor){
        if(valor <=0){
            System.out.println("Valor inválido para deposito");
        }
        saldo = saldo + valor;
        System.out.println("Deposito realizado");
        return saldo;
    }
    public void transferencia(Conta destino, double valor){
        if(saldo == 0){
            System.out.println("Saldo Insuficiente!");
        }
        if (valor > saldo){
            System.out.println("Valor a trasferir maior que o seu saldo");
        }
        this.saldo -= valor;
        destino.saldo += valor;

        System.out.println("Transferência de R$" + valor + " relizada com sucesso." );
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual de " + cliente.getNomeCompleto() + ": R$" + saldo);
    }
}
