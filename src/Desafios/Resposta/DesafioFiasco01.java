package Desafios.Resposta;

public class DesafioFiasco01 {
    public static void main(String[] args) {

        // Ninja 1
        String nomeNinja1 = "Naruto Uzumaki";
        int idadeNinja1 = 16;
        String missao = "Encontrar bandido";
        String statusDaMissao = "Em andamento";
        char nivelDaMissao = 'C';

        if (idadeNinja1 < 15) {
            if (nivelDaMissao == 'C' || nivelDaMissao == 'D') {
                statusDaMissao = "Concluido";
            } else {
                statusDaMissao = "Missão não concluida. Idade insuficiente para missão";
            }
        } else {
            statusDaMissao = "Concluido";
        }

        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("Idade: " + idadeNinja1);
        System.out.println("Missão: " + missao);
        System.out.println("Status da missão:  " + statusDaMissao);
        System.out.println("Nível da missão:  " + nivelDaMissao);

        System.out.println("----------------------");

        // Ninja 2
        String nomeNinja2 = "Sasuke Uchiha";
        int idadeNinja2 = 14;
        String missao2 = "Reconhecimento da aldeia";
        String statusDaMissao2 = "Em andamento";
        char nivelDaMissao2 = 'S';

        if (idadeNinja2 < 15) {
            if (nivelDaMissao2 == 'C' || nivelDaMissao2 == 'D') {
                statusDaMissao2 = "Concluido";
            } else {
                statusDaMissao2 = "Missão não concluida. Idade insuficiente para missão";
            }
        } else {
            statusDaMissao2 = "Concluido";
        }

        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("Idade: " + idadeNinja2);
        System.out.println("Missão: " + missao2);
        System.out.println("Status da missão:  " + statusDaMissao2);
        System.out.println("Nível da missão:  " + nivelDaMissao2);

        System.out.println("----------------------");


        // Ninja 3
        String nomeNinja3 = "Sakura Haruno";
        int idadeNinja3 = 16;
        String missao3 = "Curar feridos da guerra";
        String statusDaMissao3 = "Concluido";
        char nivelDaMissao3 = 'D';

        if (idadeNinja3 < 15) {
            if (nivelDaMissao3 == 'C' || nivelDaMissao3 == 'D') {
                statusDaMissao3 = "Concluido";
            } else {
                statusDaMissao3 = "Missão não concluida. Idade insuficiente para missão";
            }
        } else {
            statusDaMissao3 = "Concluido";
        }

        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("Idade: " + idadeNinja3);
        System.out.println("Missão: " + missao3);
        System.out.println("Status da missão:  " + statusDaMissao3);
        System.out.println("Nível da missão:  " + nivelDaMissao3);

        System.out.println("----------------------");
    }
}
