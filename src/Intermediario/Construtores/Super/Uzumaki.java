package Intermediario.Construtores.Super;

public class Uzumaki extends Ninja {
    public Uzumaki() {
        super();
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, RankNinja rankNinja) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rankNinja);
    }
}
