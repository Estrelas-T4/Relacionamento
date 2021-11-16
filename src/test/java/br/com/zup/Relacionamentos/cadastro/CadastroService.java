package br.com.zup.Relacionamentos.cadastro;

import br.com.zup.Relacionamentos.cadastro.custom_exceptions.CadastroNaoEncontradoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CadastroService {
    @Autowired
    private CadastroRepository cadastroRepository;

    public Cadastro salvarCadastro(Cadastro cadastro){
        return cadastroRepository.save(cadastro);
    }

    public Cadastro buscarPorId(String id){
        Optional<Cadastro> optionalCadastro = cadastroRepository.findById(id);
        if(optionalCadastro.isEmpty()){
            throw new CadastroNaoEncontradoException();
        }

        return optionalCadastro.get();
    }
}
