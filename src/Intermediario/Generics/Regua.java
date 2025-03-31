package Intermediario.Generics;

public class Regua {
    private int tamanho;

    public Regua() {
    }

    public Regua(int tamanho) {
        this.tamanho = tamanho;
    }

    public String toString() {
        return "Regua de " + tamanho + " cm";
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
}
