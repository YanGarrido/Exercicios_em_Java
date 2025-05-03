package SistemaBancario;

public class Cliente {
    private String nome;
    String sobrenome;
    int idade;
    private String numConta;

    public Cliente(String nome, String sobrenome, int idade, String numConta){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.numConta = numConta;
    }
    public String getNomeCompleto(){
        return nome + " " + sobrenome;
    }

    public String getNumConta(){
        return numConta;
    }
    public String getNome(){
        return nome;
    }
}
