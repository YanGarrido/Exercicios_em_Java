package AgendaDeContato;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {
    ArrayList<Contato> contatos = new ArrayList<>();

    public  void adicionar(Contato contato){
        contatos.add(contato);
        System.out.println(" ");
    }
    public void listar(){
        if(contatos.isEmpty()){
            System.out.println("Agenda está vazia, nenhum contato cadastrado");
            System.out.println(" ");
        }
        for(int i = 0; i < contatos.size(); i++){
            System.out.println("Nome: " + contatos.get(i).nome + " | Telefone: " + contatos.get(i).telefone + " | E-mail: " + contatos.get(i).email);
            System.out.println("--------------------------------");
        }

    }
    public void buscar(String nome){
        boolean encontrado = false;
        for(int i = 0; i < contatos.size(); i++){
            if(contatos.get(i).nome.equalsIgnoreCase(nome)){
                System.out.println("Nome: " + contatos.get(i).nome + " Telefone: " + contatos.get(i).telefone + " E-mail: " + contatos.get(i).email);
                System.out.println(" ");
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("Nome não encontrado");
            System.out.println(" ");
        }
    }
    public String remover(String nome){
        for(int i = 0; i < contatos.size(); i++){
            if(contatos.get(i).nome.equalsIgnoreCase(nome)){
                    contatos.remove(i);
                    return "Contato removido com sucesso";
            }

        }
        return "Contato não encontrado";

    }

}
