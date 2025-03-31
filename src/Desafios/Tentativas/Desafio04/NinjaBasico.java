package Desafios.Tentativas.Desafio04;

public class NinjaBasico implements Ninja {
    public String nome;
    public int idade;
    public String habilidade;

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Executando Habilidade: " + habilidade);
    }
}
