package Tabuada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva o número de inicio da tabuada: ");
        int inicio = sc.nextInt();
        System.out.print("Escreva o número final da tabuada: ");
        int fim =sc.nextInt();
        if(fim < inicio){
            System.out.println("Fim não pode ser menor que o inicio");

        } else {
            System.out.print("Até onde a tabuada dever ir: ");
            int limite = sc.nextInt();

            for(int num = inicio; num<= fim; num++){
                System.out.println(" ");
                System.out.println("TABUADA DO NÚMERO:" + num);
                System.out.println(" ");
                tabuadaDeNumero(num, limite);
            }
        }


    }
    public static void tabuadaDeNumero(int num, int limite){
        for(int i = 0; i <= limite; i++){
            int resultado = num * i;
            System.out.println(num + " * " + i + " = " + resultado);

        }


    }
}
