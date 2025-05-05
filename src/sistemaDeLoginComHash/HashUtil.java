package sistemaDeLoginComHash;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class HashUtil {
  public static String hashSenha(String senha){
    try{
      MessageDigest md = MessageDigest.getInstance("SHA-256");
      byte[] hash = md.digest(senha.getBytes());

      StringBuilder hexString = new StringBuilder();
      for(byte b : hash) {
        hexString.append(String.format("%02x", b));
      }

      return hexString.toString();
    } catch (NoSuchAlgorithmException e){
      throw new RuntimeException("Error ao gerar hash", e);
    }
  }
}
