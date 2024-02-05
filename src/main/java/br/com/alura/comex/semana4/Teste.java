package br.com.alura.comex.semana4;

public class Teste {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        produto1.nome = "TV";
        produto1.descricao = "TV 29 polegadas";
        produto1.precoUnitario = 1000.00;
        produto1.quantidade = 2;

        Produto produto2 = new Produto();
        produto2.nome = "TV";
        produto2.descricao = "TV 29 polegadas";
        produto2.precoUnitario = 1000.00;
        produto2.quantidade = 2;

        if(produto1 == produto2){
            System.out.println("Os objetos são idênticos");
        }else{
            System.out.println("Os objetos não são idênticos, eles possuem referências diferentes");
        }
    }
}
