package model;

public class Nota extends Pessoa
{
    private Aluno aluno;
    private Disciplina disciplina;
    private double valor;
    private String data;

    public Nota(String nome, String telefone, endereco endereco, Aluno aluno, Disciplina disciplina, double valor, String data) {
        super(nome, telefone, endereco);
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.valor = valor;
        this.data = data;
    }

    public Aluno getAluno()
    {
        return aluno;
    }

    public void setAluno(Aluno aluno)
    {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina()
    {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina)
    {
        this.disciplina = disciplina;
    }

    public double getValor()
    {
        return valor;
    }

    public void setValor(double valor)
    {
        this.valor = valor;
    }

    public String getData()
    {
        return data;
    }

    public void setData(String data)
    {
        this.data = data;
    }

}
