package Desafios.Tentativas.Desafio03;

public class Ninja {
    public String nome;
    public int idade;
    public String missao;
    public String nivelDificuldade;
    String statusMissao;

    public void mostrarInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Nivel dificuldade da missão: " + nivelDificuldade);
        System.out.println("Status da missão: " + statusMissao);
    }

}
