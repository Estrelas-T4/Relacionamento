package br.com.zup.Relacionamentos.cadastro;

import br.com.zup.Relacionamentos.cadastro.dtos.CadastroDetailDTO;
import br.com.zup.Relacionamentos.cadastro.dtos.CadastroEntradaDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {
    @Autowired
    private CadastroService cadastroService;
    @Autowired
    private ModelMapper modelMapper;

    @PostMapping()
    public CadastroDetailDTO cadastrar(@RequestBody @Valid CadastroEntradaDTO cadastroEntradaDTO){
        Cadastro cadastro = modelMapper.map(cadastroEntradaDTO, Cadastro.class);
        cadastro = cadastroService.salvarNovoCadastroComEndereco(cadastro);
        return modelMapper.map(cadastro, CadastroDetailDTO.class);
    }

    @GetMapping("/{id}")
    public CadastroDetailDTO exibirCadastro(@PathVariable String id){
        Cadastro cadastro = cadastroService.buscarPorId(id);
        return modelMapper.map(cadastro, CadastroDetailDTO.class);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletarCadastro(@PathVariable String id){
        cadastroService.deletarCadastro(id);
    }
}
