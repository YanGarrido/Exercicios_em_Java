package AgendaDeContato;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    ArrayList<ArrayList<String>> contatos = new ArrayList<>();

    public static void main(String[] args) {
        Agenda contatos = new Agenda();
        int sair = 0;
        Scanner sc = new Scanner(System.in);
        int escolha;
        String nome;
        String telefone;
        String email;



        while (sair == 0){
            System.out.println("AGENDA DE CONTATOS");
            System.out.println("1. Adicionar\n2. Listar\n 3. Buscar\n 4. Remover\n 5. Sair");
            System.out.print("Escolha sua opção: ");
            escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha){
                case 1:{
                    System.out.print("Escreva o nome: ");
                    nome = sc.nextLine();
                    System.out.print("Escreva o telefone: ");
                    telefone = sc.nextLine();
                    System.out.print("Escreva o e-mail: ");
                    email = sc.nextLine();
                    Contato contato = new Contato(nome,telefone,email);
                    contatos.adicionar(contato.nome, contato.telefone, contato.email);
                    break;
                }
                case 2:{
                    System.out.println("Listando todos os contatos");
                    contatos.listar();
                    break;

                }
                case 3:{
                    System.out.print("Digite o nome do contato que você quer buscar: ");
                    nome = sc.nextLine();
                    contatos.buscar(nome);
                    break;
                }
                case 4:{
                    System.out.print("Digite o nome do contato que você quer remover: ");
                    nome = sc.nextLine();
                    System.out.println(contatos.remover(nome));
                    break;
                }
                case 5:{
                    System.out.println("Saindo da Agenda");
                    sair ++;
                    break;
                }
                default:{
                    System.out.println("Nenhuma das opções foi escolhida");
                    break;
                }
            }
        }
    }

    public  void adicionar(String nome, String telefone, String email){
        ArrayList<String> contato = new ArrayList<>();
        contato.add(nome);
        contato.add(telefone);
        contato.add(email);
        System.out.println(contato);
        contatos.add(contato);
        System.out.println(contatos);
    }
    public void listar(){
        for(int i = 0; i < contatos.size(); i++){
            System.out.println(contatos.get(i));
        }
    }
    public void buscar(String nome){
        for(int i = 0; i < contatos.size(); i++){
            for(int j = 0; j < contatos.get(i).size(); j++ ){
                if(contatos.get(i).get(j).equals(nome)){
                    System.out.println(contatos.get(i));
                }
            }
        }
    }
    public String remover(String nome){
        for(int i = 0; i < contatos.size(); i++){
            for(int j = 0; j < contatos.get(i).size(); j++ ){
                if(contatos.get(i).get(j).equals(nome)){
                    contatos.remove(i);
                }
            }
        }
        return "Contato removido com sucesso";
    }

}
