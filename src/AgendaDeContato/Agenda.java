package AgendaDeContato;

import java.io.*;
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

    public void salvarArquivo(String nomeArquivo){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))){
            for (Contato contato : contatos){
                String linha = contato.nome + ";" + contato.telefone + ";" + contato.email;
                writer.write(linha);
                writer.newLine();
            }
            System.out.println("Contatos salvos com sucesso em: " + nomeArquivo);
        } catch (IOException e){
            System.out.println("Erro ao salvar os contatos: " + e.getMessage());
        }
    }

    public void carregarArquivo(String nomeArquivo){
        contatos.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split(";");
                if (dados.length == 3) {
                    Contato contato = new Contato(dados[0], dados[1], dados[2]);
                    contatos.add(contato);
                }
            }
            System.out.println("Contatos carregados com sucesso de: " + nomeArquivo);
        } catch (IOException e) {
            System.out.println("Erro ao carregar os contatos: " + e.getMessage());
        }
    }

}
