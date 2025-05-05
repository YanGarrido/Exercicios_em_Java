package sistemaDeLoginComHash;


import java.util.Map;

public class User {
 private String nome;
 private String hashSenha;

 public User(String nome, String hashSenha){
   this.nome = nome;
   this.hashSenha = hashSenha;
 }

 public String getUserName(){
   return nome;
 }

  public String getUserPassword(){
    return hashSenha;
  }

  @Override
  public String toString() {
   return nome + ";" + hashSenha;
  }

  public static User fromString(String linha){
   String[] partes = linha.split(";");
   return new User(partes[0], partes[1]);
  }
}
