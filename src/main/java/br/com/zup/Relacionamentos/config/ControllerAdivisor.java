package br.com.zup.Relacionamentos.config;

import br.com.zup.Relacionamentos.cadastro.custom_exceptions.CadastroNaoEncontradoException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;

@RestControllerAdvice
public class ControllerAdivisor {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public HashMap<String, String> manipularValidacao(MethodArgumentNotValidException exception){
        HashMap<String, String> json = new HashMap<>();
        exception.getFieldErrors().stream().map(erro -> json.put(erro.getField(), erro.getDefaultMessage()));

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
