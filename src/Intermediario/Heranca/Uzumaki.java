package Intermediario.Heranca;

public class Uzumaki extends Ninja {

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + this.nome + " e esse é meu ataque Uzumaki, um ataque de ar!");
    }

    public void ModoSabioAtivado() {
        System.out.println("Meu nome é " + this.nome + " e eu ativei o modo sábio.");
    }

}
