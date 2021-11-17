package br.com.zup.Relacionamentos.config;

import br.com.zup.Relacionamentos.cadastro.custom_exceptions.CadastroNaoEncontradoException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ControllerAdivisor {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public Map<Object, Object> manipularValidacao(MethodArgumentNotValidException exception){
        Map<Object, Object> json =
                exception.getFieldErrors().stream().collect(Collectors.toMap(m -> m.getField(), m -> m.getDefaultMessage() ));


        return json;
    }

    @ExceptionHandler(CadastroNaoEncontradoException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public HashMap<String, String> manipularCadastroNaoEncontro(){
        HashMap<String, String> json = new HashMap<String, String>();
        json.put("mensagem", "Cadastro não encontrado");
        return json;
    }
}
