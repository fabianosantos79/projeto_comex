package br.com.alura.comex.semana4;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.nome = "Celular S30";
        produto.descricao = "celular com 48MB, tela 7 polegadas e bateria de 6000 amperes.";
        produto.precoUnitario = 2500.50;
        produto.quantidade = 12;

        System.out.println("O nome do produto é " + produto.nome);
        System.out.println("Descrição: " + produto.descricao);
        System.out.println("O valor de cada unidade é R$ " + produto.precoUnitario);
        System.out.println("Temos em estoque " + produto.quantidade + " unidades.");

        Produto produto3 = new Produto();
        produto3.nome = "Geladeira Brastemp";
        produto3.descricao = "FrostFree 240 litros duplex bivolt";
        produto3.precoUnitario = 5500.00;
        produto3.quantidade = 8;

        produto3.imprimeDados();
    }
}
