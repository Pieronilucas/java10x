package Intermediario;

public class Uzumaki extends Ninja {
    Biju biju;


    public Uzumaki() {
        super();
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, RankNinja rankNinja) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rankNinja);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, RankNinja rankNinja, Biju biju) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rankNinja);
        this.biju = biju;
    }

    @Override
    public String toString() {
        return "Uzumaki{" +
                " nome=" + nome + '\'' +
                ", aldeia='" + aldeia + '\'' +
                ", idade=" + idade +
                ", numeroDeMissoesConcluidas=" + numeroDeMissoesConcluidas +
                ", rankNinja=" + rankNinja +
                ", biju=" + biju + '}';
    }
}
