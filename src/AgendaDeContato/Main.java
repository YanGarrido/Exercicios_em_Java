package AgendaDeContato;

import java.util.Scanner;

public class Main {
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
        sc.close();
    }
}
