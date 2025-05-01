import Calculadora.Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        String escolha;
        Scanner scanner = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        while(a == 1){
            System.out.println("CALCULADORA");
            System.out.println("Escolha uma das operações\nSoma\nSubtração\nMultiplicação\nDivisão\nSair");
            escolha = scanner.next();
            switch (escolha){
                case "Soma":{
                    System.out.print("Digite o primeiro numero: ");
                    Double num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo numero: ");
                    Double num2 = scanner.nextDouble();
                    System.out.print("Resultado da Soma: ");
                    //Chama a função
                    System.out.println(calculadora.Soma(num1,num2));
                    break;

                }
                case "Subtração":{
                    System.out.print("Digite o primeiro numero: ");
                    Double num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo numero: ");
                    Double num2 = scanner.nextDouble();
                    System.out.print("Resultado da Subtração: ");
                    //Chama a função
                    System.out.println(calculadora.Subtracao(num1,num2));
                    break;

                }
                case "Multiplicação":{
                    System.out.print("Digite o primeiro numero: ");
                    Double num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo numero: ");
                    Double num2 = scanner.nextDouble();
                    System.out.print("Resultado da Multiplicação: ");
                    //Chama a função
                    System.out.println(calculadora.Multiplicacao(num1,num2));
                    break;

                }
                case "Divisão":{
                    System.out.print("Digite o primeiro numero: ");
                    Double num1 = scanner.nextDouble();
                    System.out.print("Digite o segundo numero: ");
                    Double num2 = scanner.nextDouble();
                    System.out.print("Resultado da Divisão: ");
                    //Chama a função
                    System.out.println(calculadora.Divisao(num1,num2));
                    break;
                }
                case "Sair":{
                    System.out.println("Saindo da Calculadora");
                    a = 0;
                    break;
                }
                default:{
                    System.out.println("Escolha uma das Opções");
                    break;
                }


            }
        }
        scanner.close();
    }
}