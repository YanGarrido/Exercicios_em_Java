package SistemaBancario;

import java.util.ArrayList;


public class Banco {
    private ArrayList<Conta> contas = new ArrayList<>();

    public void adicionarConta(Conta conta){
        contas.add(conta);
    }

    public Conta buscarPorNumero(String numero){
        for (Conta c : contas){
            if(c.getCliente().getNumConta().equals(numero)){
                return  c;
            }
        }
        return null;
    }

    public void listarContas(){
        for(Conta c : contas){
            System.out.println("Conta " + c.getCliente().getNumConta() + "- Titular: " +
                    c.getCliente().getNome());
        }
    }

}