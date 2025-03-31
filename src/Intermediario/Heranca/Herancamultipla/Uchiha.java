package Intermediario.Heranca.Herancamultipla;

public class Uchiha extends Ninja implements Sharigan {
    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + this.nome + " e esse é meu ataque Uchiha, um ataque de fogo!");
    }


    @Override
    public void shariganAtivado() {
        System.out.println(nome + " ativou o Sharigan!");
    }
}
