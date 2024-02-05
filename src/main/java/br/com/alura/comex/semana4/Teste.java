package br.com.alura.comex.semana4;

public class Teste {
    public static void main(String[] args) {
        Produto produto1 = new Produto("TV");
        produto1.setDescricao("TV 29 polegadas");
        produto1.setPrecoUnitario(1000.00);
        produto1.setQuantidade(2);

        Produto produto2 = new Produto("TV");
        produto2.setNome("TV");
        produto2.setDescricao("TV 29 polegadas");
        produto2.setPrecoUnitario(1000.00);
        produto2.setQuantidade(2);

        if(produto1 == produto2){
            System.out.println("Os objetos são idênticos");
        }else{
            System.out.println("Os objetos não são idênticos, eles possuem referências diferentes");
        }
    }
}
