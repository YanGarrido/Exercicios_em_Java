package leituraDeArquivoCSV;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
  public static void main(String[] args) {
    String caminhoArquivo = "dados.csv";

    try (BufferedReader br = new BufferedReader(new FileReader(caminhoArquivo))){
      String linha;

      while ((linha = br.readLine()) != null) {
        String[] valores = linha.split(",");

        for(String valor : valores){
          System.out.print(valor + " ");
        }
        System.out.println();
      }
    } catch (IOException e){
      e.printStackTrace();
    }
  }
}
