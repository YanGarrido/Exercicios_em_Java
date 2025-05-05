package ContadorVogalConsoante;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Digite uma frase abaixo:");
    String frase = sc.nextLine().toLowerCase();


    System.out.println("Quantidade de vogais: " + contaVogal(frase));
    System.out.println("Quantidade de consoantes: " + contaConsoante(frase));
    System.out.println("Quantidade de espaços: " + contaEspacos(frase));
    System.out.println("Quantidade de números: " + contaNum(frase));
    System.out.println("Quantidade de pontuações: " + contaPontuacao(frase));
  }


  public static int contaVogal(String frase) {
    int quantVogais = 0;

    for (int i = 0; i < frase.length(); i++) {
      char c = frase.charAt(i);
      if (Character.isLetter(c)) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
          quantVogais++;
        }
      }

    }
    return quantVogais;
  }
  public static int contaConsoante(String frase){
    int quantConsoante = 0;
    for (int i = 0; i < frase.length(); i++) {
      char c = frase.charAt(i);
      if (Character.isLetter(c)) {
        if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
          quantConsoante++;
        }
      }
    }
    return quantConsoante;
  }
  public static int contaEspacos(String frase){
    int quantEspacos = 0;
    for (int i = 0; i < frase.length(); i++){
      if(frase.charAt(i) == ' '){
        quantEspacos ++;
      }
    }
    return  quantEspacos;
  }
  public static int contaNum(String frase){
    int quantNum = 0;
    for (int i = 0; i < frase.length(); i++){
      char c = frase.charAt(i);
      if(Character.isDigit(c)){
        quantNum ++;
      }
    }
    return quantNum;
  }

  public static int contaPontuacao(String frase){
    int quantPontuacao = 0;
    for (int i = 0; i < frase.length(); i ++){
      char c = frase.charAt(i);
      if(!Character.isLetterOrDigit(c) && c != ' ' ){
        quantPontuacao ++;
      }
    }
    return quantPontuacao;
  }
}
