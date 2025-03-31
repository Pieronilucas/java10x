package Intermediario.Heranca;

public class Ninja {
    public String nome;
    public String aldeia;
    public int idade;


    // Metodo geral, todos os ninjas vao ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é  " + this.nome + " e esse é meu ataque especial!");
    }

    public String BoasVindas(){
        return "Oi, eu sou um ninja!";
    }

    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }

}
