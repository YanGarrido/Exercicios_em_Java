package validadorDeCPF;

import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
  public static void main(String[] args) {
    Main main = new Main();
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite um CPF: ");
    String cpf = sc.nextLine();
    System.out.println(main.validarCpf(cpf));

  }

  public int calcularVerificadorUm(String cpf){
    int digitoVerificadorUm = 0;
    String noveDigitos = cpf.substring(0,9);

    int num1 = 0;
    for(int i = 0; i < noveDigitos.length(); i ++){
      int num = parseInt(String.valueOf(noveDigitos.charAt(i)));

      num1 = num1 + num * (10 - i);


    }
    int resto = num1 % 11;
    if(resto < 2){
      digitoVerificadorUm = 0;
    } else if(resto >= 2){
      digitoVerificadorUm = 11 - resto;
    }

    return digitoVerificadorUm;
  }
  public int calcularVerificadorDois(String cpf, int digitoVerificadorUm){
    int digitoVerificadorDois = 0;
    String digitoVerificador = String.valueOf(digitoVerificadorUm);
    String noveDigitos = cpf.substring(0,9);
    String dezDigitos = noveDigitos + digitoVerificador;

    int num1 = 0;
    for(int i = 0; i < dezDigitos.length(); i ++){
      int num = parseInt(String.valueOf(dezDigitos.charAt(i)));

      num1 = num1 + num * (11 - i);


    }
    int resto = num1 % 11;
    if(resto < 2){
      digitoVerificadorDois = 0;
    } else if(resto >= 2){
      digitoVerificadorDois = 11 - resto;
    }

    return digitoVerificadorDois;
  }

  public String validarCpf(String cpf){
    cpf = cpf.replaceAll("\\D","");
    int verificadorUm = calcularVerificadorUm(cpf);
    if(cpf.length() != 11){
      return "CPF INVÁLiDO";
    }

    if(cpf.chars().distinct().count() == 1){
      return "CPF INVÁLIDO";
    }

    if(verificadorUm != Character.getNumericValue(cpf.charAt(9))){
      return "CPF INVÁLIDO";
    }
    int verificadorDois = calcularVerificadorDois(cpf, verificadorUm);
    if(verificadorDois != Character.getNumericValue(cpf.charAt(10))){
      return "CPF INVÁLIDO";
    }
    return "SEU CPF É VALIDO";
  }
}

