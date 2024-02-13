package br.com.alura.comex.semana5;
public class Cliente implements Identificavel{
    String nome;
    String cpf;
    String telefone;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public String getIdentificacao() {
        System.out.println("Nome: " + this.getNome() + " - CPF: " + this.getCpf());
        return null;
    }
}
