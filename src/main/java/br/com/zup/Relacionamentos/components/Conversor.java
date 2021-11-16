package br.com.zup.Relacionamentos.components;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component // instancia a classe para criar o objeto gerenciado pelo spring
public class Conversor {

    @Bean // executa o metodo e pega o objeto de retorno para ser gerenciado pelo spring, assim podemos fazer injeção de dependencia.
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
