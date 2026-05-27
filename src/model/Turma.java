package model;
import java.util.ArrayList;

public class Turma extends Aluno
{
    private int codigoturma;
    private Disciplina disciplina;
    private Professor professor;
    private int anoLetivo;

    public ArrayList<Aluno> Array_Aluno = new ArrayList<Aluno>();

    public Turma(String nome, String telefone, endereco endereco, int matricula, int anoIngressao, Turma turma, int codigoturma, Disciplina disciplina, Professor professor, int anoLetivo, ArrayList<Aluno> array_Aluno)
    {
        super(nome, telefone, endereco, matricula, anoIngressao, turma);
        this.codigoturma = codigoturma;
        this.disciplina = disciplina;
        this.professor = professor;
        this.anoLetivo = anoLetivo;
        Array_Aluno = array_Aluno;
    }


    public int getCodigoturma() {
        return codigoturma;
    }

    public void setCodigoturma(int codigoturma) {
        this.codigoturma = codigoturma;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public int getAnoLetivo() {
        return anoLetivo;
    }

    public void setAnoLetivo(int anoLetivo) {
        this.anoLetivo = anoLetivo;
    }

    public ArrayList<Aluno> getArray_Aluno()
    {
        return Array_Aluno;
    }

    public void setArray_Aluno(Aluno f)
    {
        this.Array_Aluno.add(f);
    }
}


