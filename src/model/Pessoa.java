package model;

public class Pessoa
{
    private String nome;
    private String telefone;
    private endereco Endereco;

    public Pessoa(String nome, String telefone, endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        Endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public endereco getEndereco() {
        return Endereco;
    }

    public void setEndereco(endereco endereco) {
        Endereco = endereco;
    }
}
