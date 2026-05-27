package model;
import java.util.ArrayList;

public class Disciplina extends Pessoa
{
    private String nomeDisciplina;
    private int CargaHoraria;
    private int codigo;

    public ArrayList<Professor> Array_Professor = new ArrayList<>();

    public Disciplina(String nome, String telefone, endereco endereco, String nomeDisciplina, int cargaHoraria, int codigo, ArrayList<Professor> array_Professor) {
        super(nome, telefone, endereco);
        this.nomeDisciplina = nomeDisciplina;
        CargaHoraria = cargaHoraria;
        this.codigo = codigo;
        Array_Professor = array_Professor;
    }


    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public int getCargaHoraria() {
        return CargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        CargaHoraria = cargaHoraria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Professor> getArray_Professor()
    {
        return Array_Professor;
    }

    public void setArray_Professor(Professor h)
    {
        this.Array_Professor.add(h);
    }

}
