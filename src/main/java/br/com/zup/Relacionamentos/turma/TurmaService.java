package br.com.zup.Relacionamentos.turma;

import br.com.zup.Relacionamentos.cadastro.Cadastro;
import br.com.zup.Relacionamentos.cadastro.CadastroService;
import br.com.zup.Relacionamentos.turma.custom_exceptions.TurmaNaoEncontrada;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TurmaService {
    @Autowired
    TurmaRepository turmaRepository;
    @Autowired
    CadastroService cadastroService;

    public Turma salvarTurma(Turma turma){
        return turmaRepository.save(turma);
    }

    public Turma vincularAlunoNaTurma(String idCadastro, Integer idTurma){
        Cadastro cadastro = cadastroService.buscarPorId(idCadastro);
        Optional<Turma> turmaOptional = turmaRepository.findById(idTurma);

        if(turmaOptional.isEmpty()){
            throw new TurmaNaoEncontrada();
        }

        turmaOptional.get().getAlunos().add(cadastro);
        return turmaRepository.save(turmaOptional.get());
    }
}
