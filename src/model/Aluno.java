package model;

public class Aluno extends Pessoa
{
    private int matricula;
    private int anoIngressao;
    private Turma turma;

    public Aluno(String nome, String telefone, endereco endereco, int matricula, int anoIngressao, Turma turma) {
        super(nome, telefone, endereco);
        this.matricula = matricula;
        this.anoIngressao = anoIngressao;
        this.turma = turma;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getAnoIngressao() {
        return anoIngressao;
    }

    public void setAnoIngressao(int anoIngressao) {
        this.anoIngressao = anoIngressao;
    }

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
