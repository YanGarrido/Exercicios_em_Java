package aulasescritorioescola;

import java.util.Scanner;

public class Votação {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite sua idade: ");
    int idade = sc.nextInt();

    if(idade > 80){
      System.out.println("Velho demais não pode votar");
    } else if (idade >= 16) {
      System.out.println("Faça sua votação");

    }else{
      System.out.println("Não tem idade suficiente para votar");
    }
  }
}
