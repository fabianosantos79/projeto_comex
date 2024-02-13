package br.com.alura.comex.semana5;

import java.util.InputMismatchException;

public class ErroDeEntrada extends InputMismatchException {
    private String mensagem;

    public ErroDeEntrada(String mensagem){
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}
