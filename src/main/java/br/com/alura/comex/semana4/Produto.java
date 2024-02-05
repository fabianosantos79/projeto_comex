package br.com.alura.comex.semana4;

public class Produto {
    String nome;
    String descricao;
    double precoUnitario;
    int quantidade;

    public void imprimeDados(){
        System.out.println(">>> Dados do produto");
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: "+ descricao);
    }
}
