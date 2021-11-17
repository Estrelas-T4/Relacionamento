package br.com.zup.Relacionamentos.turma;

import br.com.zup.Relacionamentos.cadastro.Cadastro;
import br.com.zup.Relacionamentos.curso.Curso;
import br.com.zup.Relacionamentos.turma.enuns.Periodo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "turmas")
public class Turma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Periodo periodo;
    @ManyToOne
    private Curso curso;

    @ManyToMany
    private List<Cadastro> alunos;

    public Turma() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public List<Cadastro> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Cadastro> alunos) {
        this.alunos = alunos;
    }
}
