package br.com.zup.Relacionamentos.cadastro.dtos;

import br.com.zup.Relacionamentos.endereco.Endereco;
import br.com.zup.Relacionamentos.turma.dtos.TurmaResumoDTO;

import java.util.List;

public class CadastroDetailDTO {
    private String cpf;
    private String nome;
    private String email;
    private List<Endereco> enderecos;
    private List<TurmaResumoDTO> turmas;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public List<TurmaResumoDTO> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<TurmaResumoDTO> turmas) {
        this.turmas = turmas;
    }
}
