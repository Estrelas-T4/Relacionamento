package br.com.zup.Relacionamentos.cadastro;

import br.com.zup.Relacionamentos.endereco.Endereco;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pessoa")
public class Cadastro {
    @Id
    private String cpf;
    private String nome;
    @Column(unique = true)
    private String email;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Endereco> enderecos;

    public Cadastro() {
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
