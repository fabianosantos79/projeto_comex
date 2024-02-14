package br.com.alura.comex.semana5.modelos;

public class Eletronico extends Produto {
    private int voltagem;
    private int potencia;

    public Eletronico(String nome, int voltagem, int potencia) {
        super(nome);
        this.voltagem = voltagem;
        this.potencia = potencia;
    }

    public int getVoltagem() {
        return voltagem;
    }
    public void setVoltagem(int voltagem) {
        this.voltagem = voltagem;
    }

    public int getPotencia() {
        return potencia;
    }
    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
}
