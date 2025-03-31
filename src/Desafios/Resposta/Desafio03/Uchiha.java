package Desafios.Resposta.Desafio03;

public class Uchiha extends Ninja {
    String habilidadeEspecial;
    public void mostrarHabilidadeEspecial(){
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }

    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Nivel dificuldade da missão: " + nivelDificuldade);
        System.out.println("Habilidade Especial: " + habilidadeEspecial);
    }
}
