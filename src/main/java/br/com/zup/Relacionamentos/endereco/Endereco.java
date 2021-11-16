package br.com.zup.Relacionamentos.endereco;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "enderecos")
public class Endereco {
    @Id
    private Integer id;
    @Column(nullable = false)
    private String locradouro;
    @Column(nullable = false)
    private String numero;
    @Column(columnDefinition = "varchar(50) default 'NT'")
    private String complemento;
    @Column(nullable = false)
    private String cep;

    public Endereco() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocradouro() {
        return locradouro;
    }

    public void setLocradouro(String locradouro) {
        this.locradouro = locradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
