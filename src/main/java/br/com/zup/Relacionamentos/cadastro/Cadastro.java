package br.com.zup.Relacionamentos.cadastro;

import br.com.zup.Relacionamentos.endereco.Endereco;
import br.com.zup.Relacionamentos.turma.Turma;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "pessoas")
public class Cadastro {
    @Id
    private String cpf;
    private String nome;
    @Column(unique = true)
    private String email;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Endereco> enderecos;
    @ManyToMany(mappedBy = "alunos")
    private List<Turma> turmas;

    public Cadastro() {
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public void setTurmas(List<Turma> turmas) {
        this.turmas = turmas;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

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
}
