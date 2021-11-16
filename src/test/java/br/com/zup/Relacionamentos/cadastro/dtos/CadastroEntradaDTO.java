package br.com.zup.Relacionamentos.cadastro.dtos;


public class CadastroEntradaDTO {
    private String cpf;
    private String nome;
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
