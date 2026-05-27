package model;
import java.util.ArrayList;

public class Professor extends Pessoa
{
    private String anoDeFormacao;
    private int anoDeAdmissao;
    private String email;

    public ArrayList<Disciplina> Array_Disciplina = new ArrayList<Disciplina>();


    public Professor(String nome, String telefone, endereco endereco, String anoDeFormacao, int anoDeAdmissao, String email, ArrayList<Disciplina> array_Disciplina) {
        super(nome, telefone, endereco);
        this.anoDeFormacao = anoDeFormacao;
        this.anoDeAdmissao = anoDeAdmissao;
        this.email = email;
        Array_Disciplina = array_Disciplina;
    }

    public String getAnoDeFormacao() {
        return anoDeFormacao;
    }

    public void setAnoDeFormacao(String anoDeFormacao) {
        this.anoDeFormacao = anoDeFormacao;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAnoDeAdmissao() {
        return anoDeAdmissao;
    }

    public void setAnoDeAdmissao(int anoDeAdmissao) {
        this.anoDeAdmissao = anoDeAdmissao;
    }

    public ArrayList<Disciplina> getArray_Disciplina()
    {
        return Array_Disciplina;
    }

    public void setArray_Disciplina(Disciplina x)
    {
        this.Array_Disciplina.add(x);
    }

}

