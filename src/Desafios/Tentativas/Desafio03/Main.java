package Desafios.Tentativas.Desafio03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke";
        Sasuke.idade = 18;
        Sasuke.habilidadeEspecial = "Sharigan";
        Sasuke.missao = "Recuperar amuleto";
        Sasuke.nivelDificuldade = "B";
        Sasuke.statusMissao = "Em andamento";
        Sasuke.mostrarInformacoes();



        input.close();
    }
}
