package Intermediario.Heranca;

public class Uchiha extends Ninja{

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é  " + this.nome + " e esse é meu ataque Uchiha, um ataque de fogo!");
    }

    public void ShariganAtivado() {
        System.out.println("Meu nome é " + this.nome + ". O Sharigan ativou, pois eu sou um Uchiha.");
    }
}
