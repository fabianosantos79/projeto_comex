package br.com.alura.comex.semana5;

public class Livro extends Produto{
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
}
