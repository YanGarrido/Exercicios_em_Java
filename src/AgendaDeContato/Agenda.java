package AgendaDeContato;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

    ArrayList<Contato> contatos = new ArrayList<>();

    public static void main(String[] args) {
        Agenda agenda = new Agenda();
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
            System.out.println(" ");

            switch (escolha){
                case 1:{
                    System.out.print("Escreva o nome: ");
                    nome = sc.nextLine();
                    System.out.print("Escreva o telefone: ");
                    telefone = sc.nextLine();
                    System.out.print("Escreva o e-mail: ");
                    email = sc.nextLine();
                    Contato contato = new Contato(nome,telefone,email);
                    agenda.adicionar(contato);
                    break;
                }
                case 2:{
                    System.out.println("Listando todos os contatos");
                    agenda.listar();
                    break;

                }
                case 3:{
                    System.out.print("Digite o nome do contato que você quer buscar: ");
                    nome = sc.nextLine();
                    agenda.buscar(nome);
                    break;
                }
                case 4:{
                    System.out.print("Digite o nome do contato que você quer remover: ");
                    nome = sc.nextLine();
                    System.out.println(agenda.remover(nome));
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
