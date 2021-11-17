package br.com.zup.Relacionamentos.turma.dtos;

import br.com.zup.Relacionamentos.curso.Curso;
import br.com.zup.Relacionamentos.curso.dtos.CursoDTO;
import br.com.zup.Relacionamentos.turma.enuns.Periodo;

public class TurmaEntradaDTO {
    private Periodo periodo;
    private CursoDTO curso;

    public TurmaEntradaDTO() {
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public CursoDTO getCurso() {
        return curso;
    }

    public void setCurso(CursoDTO curso) {
        this.curso = curso;
    }
}
