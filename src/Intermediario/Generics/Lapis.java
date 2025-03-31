package Intermediario.Generics;

public class Lapis {
    private String nome;
    private int tamanho;

    public Lapis() {
    }

    public Lapis(String nome, int tamanho) {
        this.nome = nome;
        this.tamanho = tamanho;
    }

    public String toString() {
        return "Esse é o lápis " + nome + " e ele tem " + tamanho + " de tamanho";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
