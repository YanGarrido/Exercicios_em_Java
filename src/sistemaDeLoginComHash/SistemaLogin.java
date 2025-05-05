package sistemaDeLoginComHash;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class SistemaLogin {

  private Map<String, User> usuarios = new HashMap<>();
  private Map<String, Integer> tentativas = new HashMap<>();
  private final String arquivo ="usuarios.txt";

  public SistemaLogin(){
    carregarUsuarios();
  }

  public void cadastrar(String nome, String senha){
    if(usuarios.containsKey(nome)) {
      System.out.println("Usuário já existe");
      return;
    }
    String hash = HashUtil.hashSenha(senha);
    User u = new User(nome, hash);
    usuarios.put(nome , u);
    salvarUsuarios();
    System.out.println("Usuário cadastrado com sucesso!");

  }

  public void login(String nome,String senha){
    if(!usuarios.containsKey(nome)){
      System.out.println("Usuário não encontrado.");
      return;
    }

    int tentativasErradas = tentativas.getOrDefault(nome, 0);
    if(tentativasErradas >= 3){
      System.out.println("Usuário bloqueado por excesso de tentativas.");
      return;
    }

    String hash = HashUtil.hashSenha(senha);
    User u = usuarios.get(nome);

    if(u.getUserPassword().equals(hash)){
      System.out.println("Login bem-sucedido!");
      tentativas.put(nome, 0);
    } else {
      tentativasErradas++;
      tentativas.put(nome, tentativasErradas);
      System.out.println("Senha incorreta. Tentativas restantes: " + (3 - tentativasErradas));
    }
  }

  private void carregarUsuarios() {
    try (BufferedReader br = new BufferedReader(new FileReader(arquivo))){
      String linha;
      while ((linha = br.readLine()) != null) {
        User u = User.fromString(linha);
        usuarios.put(u.getUserName(), u);
      }
    } catch (IOException e) {

    }
  }

  private void salvarUsuarios() {
    try (BufferedWriter bw = new BufferedWriter(new FileWriter(arquivo))){
      for ( User u :usuarios.values()){
        bw.write(u.toString());
        bw.newLine();
      }
    } catch (IOException e){
        System.out.println("Erro ao salvar usuários " + e.getMessage());
    }
  }
}
