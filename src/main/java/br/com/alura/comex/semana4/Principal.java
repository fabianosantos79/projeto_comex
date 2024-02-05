package br.com.alura.comex.semana4;

public class Principal {
    public static void main(String[] args) {
        Produto produto = new Produto("Celular S30");
        produto.setDescricao("celular com 48MB, tela 7 polegadas e bateria de 6000 amperes.");
        produto.setPrecoUnitario(2500.50);
        produto.setQuantidade(12);

        System.out.println("O nome do produto é " + produto.getNome());
        System.out.println("Descrição: " + produto.getDescricao());
        System.out.println("O valor de cada unidade é R$ " + produto.getPrecoUnitario());
        System.out.println("Temos em estoque " + produto.getQuantidade() + " unidades.");

        Produto produto3 = new Produto("Geladeira Brastemp");
        produto3.setDescricao("FrostFree 240 litros duplex bivolt");
        produto3.setPrecoUnitario(5500.00);
        produto3.setQuantidade(8);

        produto3.imprimeDados();

        Endereco endereco = new Endereco();
        endereco.rua = "Pedro Alvares Cabral";
        endereco.numero = 131;
        endereco.complemento = "casa 2";
        endereco.bairro = "Centro";
        endereco.cidade = "São Paulo";
        endereco.estado = "SP";

        Cliente cliente = new Cliente();
        cliente.nome = "Fabiano";
        cliente.cpf = "111.222.333-44";
        cliente.email = "fabiano@email.com";
        cliente.profissao = "Desenvolvedor";
        cliente.telefone = "11999999999";
        cliente.endereco = endereco;

        System.out.println("O cliente " + cliente.nome + " tem o CPF " + cliente.cpf + " e reside na Rua " + cliente.endereco.rua + " na cidade de " + cliente.endereco.cidade );
    }
}
