package br.com.alura.comex.semana5.modelos;

public class Livro extends Produto implements Identificavel {
    private String isbn;
    private int totalDePaginas;

    public Livro(String nome, String isbn, int totalDePaginas) {
        super(nome);
        this.isbn = isbn;
        this.totalDePaginas = totalDePaginas;
    }

    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public int getTotalDePaginas() {
        return totalDePaginas;
    }
    public void setTotalDePaginas(int totalDePaginas) {
        this.totalDePaginas = totalDePaginas;
    }

    @Override
    public String getIdentificacao() {
        System.out.println("Nome: " + this.getNome() + " - ISBN: " + this.getIsbn());
        return null;
    }
}
