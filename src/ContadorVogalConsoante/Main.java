package ContadorVogalConsoante;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma frase abaixo:");
        String frase = sc.nextLine().toLowerCase();

        int quantVogais = 0;
        int quantConsoantes = 0;
        int quantEspacos = 0;
        int quantNum = 0;
        int quantPontuacao = 0;
        for (int i = 0; i < frase.length(); i++){
            char c = frase.charAt(i);
            if(Character.isLetter(c)){
                if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e' || frase.charAt(i) == 'i'
                        || frase.charAt(i) == 'o' || frase.charAt(i) == 'u'){
                    quantVogais ++ ;

                } else {
                    quantConsoantes ++;
                }
            } else if(frase.charAt(i) == ' ') {
                quantEspacos ++;

            } else if (Character.isDigit(c)) {
                quantNum ++;
            } else {
                quantPontuacao ++;
            }

        }
        System.out.println("Quantidade de vogais: " + quantVogais);
        System.out.println("Quantidade de consoantes: " + quantConsoantes);
        System.out.println("Quantidade de espaços: " + quantEspacos);
        System.out.println("Quantidade de números: " + quantNum);
        System.out.println("Quantidade de pontuações: " + quantPontuacao);
    }
}
