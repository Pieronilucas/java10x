package Intermediario.Heranca.Herancamultipla;


public class Hatake extends Ninja implements Sharigan, Anbu {

    public Hatake() {
        super();
    }

    public Hatake(String nome, String sobrenome, int idade) {
        super(nome, sobrenome, idade);
    }

    public void boasVindas() {
        System.out.println("Eu sou um Hatake!");
    }

    @Override
    public void shariganAtivado() {
        System.out.println(nome + " ativou o Sharigan!");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println("Eu, " + nome + ", sou um ninja de elite da Anbu!");
    }
}
