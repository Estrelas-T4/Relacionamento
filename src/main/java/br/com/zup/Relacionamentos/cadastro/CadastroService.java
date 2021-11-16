package br.com.zup.Relacionamentos.cadastro;

import br.com.zup.Relacionamentos.cadastro.custom_exceptions.CadastroNaoEncontradoException;
import br.com.zup.Relacionamentos.endereco.Endereco;
import br.com.zup.Relacionamentos.endereco.EnderecoRepository;
import br.com.zup.Relacionamentos.endereco.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CadastroService {
    @Autowired
    private CadastroRepository cadastroRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;

    public Cadastro salvarCadastro(Cadastro cadastro){
        return cadastroRepository.save(cadastro);
    }

    public Cadastro salvarNovoCadastroComEndereco(Cadastro cadastro){
        enderecoRepository.saveAll(cadastro.getEnderecos());
        return salvarCadastro(cadastro);
    }

    public Cadastro buscarPorId(String id){
        Optional<Cadastro> optionalCadastro = cadastroRepository.findById(id);
        if(optionalCadastro.isEmpty()){
            throw new CadastroNaoEncontradoException();
        }

        return optionalCadastro.get();
    }

    public void deletarCadastro(String cpf){
        cadastroRepository.deleteById(cpf);
    }
}
