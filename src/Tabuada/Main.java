package Tabuada;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escreva o um número desejado: ");
        int num = sc.nextInt();
        System.out.print("Até onde a tabuada dever ir: ");
        int quant = sc.nextInt();

        tabuadaDeNumero(num, quant);
    }
    public static void tabuadaDeNumero(int num, int quant){
        for(int i = 0; i <= quant; i++){
            int resultado = num * i;
            System.out.println("Resultado de: " + num + " * " + i + " = " + resultado);

        }


    }
}
