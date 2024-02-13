package br.com.alura.comex.semana5;

import javax.swing.text.TableView;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Eletronico eletro1 = new Eletronico("Radio",110, 200 );
        eletro1.setDescricao("Radio AM/FM com CD e voltagem 110 e potencia 200W");
        eletro1.setQuantidade(2);
        eletro1.setPrecoUnitario(150);
        System.out.println("Descrição: " + eletro1.getDescricao());
        System.out.println(eletro1.toString());

        Livro livro1 = new Livro("Açucar Amargo", "25411", 159);
        livro1.setDescricao("Livro romance que acontece em um canavial");
        livro1.setQuantidade(4);
        livro1.setPrecoUnitario(42);
        System.out.println("Descrição do Livro: " + livro1.getDescricao());
        System.out.println(livro1.toString());
        livro1.getIdentificacao();

        Cliente cliente1 = new Cliente();
        cliente1.setNome("Fulano");
        cliente1.setCpf("11122233344");
        cliente1.setTelefone("11 9999-9999");
        cliente1.getIdentificacao();

        int idFilme;

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite um número para idFilme");
        idFilme = leitura.nextInt();
        try {
            System.out.println("O valor de idFilme é: "+ idFilme);
        }
        catch (InputMismatchException e) {
            System.out.println("Você deve inserir somente números." + e.getMessage());
        }
    }
}
