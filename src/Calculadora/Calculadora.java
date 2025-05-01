package Calculadora;



public class Calculadora {

    public double Soma(Double  a, Double b){
        return a + b;
    }
    public double Subtracao(Double  a, Double b){
        return a - b;
    }
    public double Multiplicacao(Double  a, Double b){
        return a * b;
    }
    public double Divisao(Double  a, Double b){
        if(b == 0){
            System.out.println("Erro: Denominador não pode ser zero");
             return 0;
        }
        return a / b;
    }
}
