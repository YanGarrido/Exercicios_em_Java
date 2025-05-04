package ConvesorDeMoedas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main main = new Main();
        System.out.print("Escolha a moeda que deseja converter: ");
        String moeda = sc.nextLine();
        System.out.print("Valor que deseja converter: ");
        double valor = sc.nextDouble();
        sc.nextLine();
        System.out.print("Para qual cambio: ");
        String cambio = sc.nextLine();

        if(moeda.equalsIgnoreCase("real")){
            main.converterReal(valor, cambio);
        } else if (moeda.equalsIgnoreCase("dolar")) {
            main.converterDolar(valor, cambio);
        } else if (moeda.equalsIgnoreCase("euro")) {
            main.converterEuro(valor, cambio);
        } else {
            System.out.println("Moeda não reconhecida");
        }
    }
    public void converterReal(double valor, String cambio){
        double cambioDolar = 5.66;
        double cambioEuro = 6.40;
        double valorCambiado = 0;
        if(cambio.equalsIgnoreCase("dolar")){
             valorCambiado = valor * cambioDolar;
            System.out.printf("Valor em real inserido: R$%.2f\n",valor);
            System.out.printf("Valor cambiado para Dolar: $%.2f\n", valorCambiado);
        } else if (cambio.equalsIgnoreCase("euro")) {
             valorCambiado = valor * cambioEuro;
            System.out.printf("Valor em real inserido: R$%.2f\n", valor);
            System.out.printf("Valor cambiado para Euro: §%.2f\n", valorCambiado);
        }

    }

    public void converterDolar(double valor, String cambio){
        double cambioReal = 5.66;
        double cambioEuro = 1.13;
        double valorCambiado = 0;
        if(cambio.equalsIgnoreCase("real")){
            valorCambiado = valor * cambioReal;
            System.out.printf("Valor em Dólar inserido: $%.2f\n",valor);
            System.out.printf("Valor cambiado para Real: R$%.2f\n",valorCambiado);
        } else if (cambio.equalsIgnoreCase("euro")) {
            valorCambiado = valor / cambioEuro;
            System.out.printf("Valor em Dólar inserido: $%.2f\n",valor);
            System.out.printf("Valor cambiado para Euro: §%.2f\n",valorCambiado);
        }

    }
    public void converterEuro(double valor, String cambio){
        double cambioReal = 6.40;
        double cambioDolar = 1.13;
        double valorCambiado = 0;
        if(cambio.equalsIgnoreCase("real")){
            valorCambiado = valor * cambioReal;
            System.out.printf("Valor em Euro inserido: §%.2f\n", valor);
            System.out.printf("Valor cambiado para Real: R$%.2f\n", valorCambiado);
        } else if (cambio.equalsIgnoreCase("dolar")) {
            valorCambiado = valor * cambioDolar;
            System.out.printf("Valor em Euro inserido: §%.2f\n",valor);
            System.out.printf("Valor cambiado para Dolar: $%.2f\n",valorCambiado);
        }

    }
}
