package br.com.zup.Relacionamentos.endereco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {
    @Autowired
    private EnderecoRepository enderecoRepository;

    public List<Endereco> salvarTodosEnderecos(List<Endereco> enderecos){
        return (List<Endereco>) enderecoRepository.saveAll(enderecos);
    }
}
