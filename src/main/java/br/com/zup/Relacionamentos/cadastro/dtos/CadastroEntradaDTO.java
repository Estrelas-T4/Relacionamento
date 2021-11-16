package br.com.zup.Relacionamentos.cadastro.dtos;


import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class CadastroEntradaDTO {
    @CPF
    @NotNull
    private String cpf;
    @NotBlank
    private String nome;
    @Email
    @NotBlank
    private String email;

    public CadastroEntradaDTO() {
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
