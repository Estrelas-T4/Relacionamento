package br.com.zup.Relacionamentos.cadastro;

import br.com.zup.Relacionamentos.cadastro.dtos.CadastroEntradaDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Cadastro cadastrar(@RequestBody @Valid CadastroEntradaDTO cadastroEntradaDTO){
        Cadastro cadastro = modelMapper.map(cadastroEntradaDTO, Cadastro.class);
        return cadastroService.salvarNovoCadastroComEndereco(cadastro);
    }

    @GetMapping("/{id}")
    public Cadastro exibirCadastro(@PathVariable String id){
        return cadastroService.buscarPorId(id);
    }

}
