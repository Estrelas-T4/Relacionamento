package br.com.zup.Relacionamentos.turma.dtos;

import org.hibernate.validator.constraints.br.CPF;

public class MatriculaDTO {
    @CPF
    private String alunoId;
    private Integer turmaId;

    public MatriculaDTO() {
    }

    public String getAlunoId() {
        return alunoId;
    }

    public void setAlunoId(String alunoId) {
        this.alunoId = alunoId;
    }

    public Integer getTurmaId() {
        return turmaId;
    }

    public void setTurmaId(Integer turmaId) {
        this.turmaId = turmaId;
    }
}
