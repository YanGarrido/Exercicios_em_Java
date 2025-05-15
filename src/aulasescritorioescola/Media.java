package aulasescritorioescola;

import java.util.Scanner;

public class Media {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double media;

    System.out.print("Digite a primeira nota do aluno: ");
    double nota1 = sc.nextDouble();
    System.out.print("Digite a segunda nota do aluno: ");
    double nota2 = sc.nextDouble();

    media = (nota1 + nota2) / 2;

    if(media >=7){
      System.out.println("Aprovado");
    } else if (media == 5) {
      System.out.println("Está de recuperação");

    } else {
      System.out.println("Reprovado");
    }


  }
}
