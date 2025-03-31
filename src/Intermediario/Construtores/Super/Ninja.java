package Intermediario.Construtores.Super;

public abstract class Ninja implements EstrategiaDeBatalha {
    // TODO: Incluir 2 novos atributos: numeroDeMissoesConcluidas e rank;
    // TODO: ranks (Gennin, Chunnin, Jounnin, Kages)

    public String nome;
    public String aldeia;
    public int idade;
    public int numeroDeMissoesConcluidas;
    public RankNinja rankNinja;


    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // TODO: sobrecargar do construtor

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, RankNinja rankNinja) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rankNinja = rankNinja;
    }

    public final void tacarKunai() {
        System.out.println("O ninja tacou uma kunai!");
    }

    // Metodo geral, todos os ninjas vao ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é  " + this.nome + " e esse é meu ataque especial!");
    }

    public void estrategiaDeBatalha() {
        System.out.println("Eu sou " + this.nome + "e essa é minha estrategia de combate!");
    }

    public void inteligenciaDeCombate() {
        System.out.println("Eu sou " + this.nome + "e essa é minha inteligencia de combate!");
    }

    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é: " + qi + " e você é um gênio!");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi + " e você é um ninja promissor!");
        } else {
            System.out.println("Seu QI é: " + qi + " e você precisa treinar mais suas estrategias!");
        }

    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", aldeia='" + aldeia + '\'' +
                ", idade=" + idade +
                ", numeroDeMissoesConcluidas=" + numeroDeMissoesConcluidas +
                ", rankNinja=" + rankNinja +
                '}';
    }
}
