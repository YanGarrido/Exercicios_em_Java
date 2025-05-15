package aulasescritorioescola;

import java.util.Scanner;

public class Clima {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite a temperatura atual: ");
    int temp = sc.nextInt();

    if(temp >= 35){
      System.out.println("Quente que só falta derreter");
    } else if (temp <= 5) {
      System.out.println("Ta frio meu filho");

    }else{
      System.out.println("A temperatura está meio termo");
    }
  }
}
