package Intermediario.Construtores.Super;

public class Uchiha extends Ninja implements Sharigan {
    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, RankNinja rankNinja) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rankNinja);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + this.nome + " e esse é meu ataque Uchiha, um ataque de fogo! Eu já completei: " + this.numeroDeMissoesConcluidas + " missões.");
    }

    @Override
    public void shariganAtivado() {
        System.out.println("Meu nome é " + this.nome + ". O Sharigan ativou, pois eu sou um Uchiha.");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Eu sou " + this.nome + "e essa é minha inteligencia de combate!");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é: " + qi + " e você é um gênio!");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi + " e você é um ninja promissor!");
        } else {
            System.out.println("Seu QI é: " + qi + " e você precisa treinar mais suas estrategias!");
        }

    }

}
