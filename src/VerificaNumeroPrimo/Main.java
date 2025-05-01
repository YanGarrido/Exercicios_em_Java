package VerificaNumeroPrimo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int num = sc.nextInt();
        System.out.println(ehPrimo(num));

    }
    public static String ehPrimo(int num){
        double sqrt = Math.sqrt(num);
        if( num <= 1){
            return "Não é primo";
        }
        for(int i = 2; i<= sqrt;i++){
            if (num % i == 0){
                return "Não é primo";
            }
        }
        return ("É primo");
    }

}
