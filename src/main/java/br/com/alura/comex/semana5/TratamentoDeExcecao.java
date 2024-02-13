package br.com.alura.comex.semana5;

import java.io.IOException;
import java.util.Scanner;

public class TratamentoDeExcecao extends IOException {

    private String mensagem;

    public TratamentoDeExcecao(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }
}