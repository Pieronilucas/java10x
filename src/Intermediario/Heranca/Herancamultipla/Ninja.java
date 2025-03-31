package Intermediario.Heranca.Herancamultipla;

public abstract class Ninja {
    public String nome;
    public String aldeia;
    public int idade;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public void habilidadeEspecial() {
        System.out.println("Meu nome é  " + this.nome + " e esse é meu ataque especial!");
    }
}
