package Basico.Condicoes;

public class IfEElse {
    public static void main(String[] args) {

        /*
        Objetivo: passar o ninja de nível de acordo com o n[umero de missões
         */


        // Naruto
        String nome = "Naruto Uzumaki";
        String rank;
        int idade = 16;
        boolean hokage = false;
        short numeroMissoes = 14;

        // se(condição) {faça isso} do contrário {faça isso}
        if (numeroMissoes >= 10 && idade > 15) {
            rank = "Chounnin";
            System.out.println("Ninja atendeu os requisitos e seu rank é: " + rank);

        } else if (numeroMissoes >= 30 && idade > 17) {
            rank = "Jounnin";
            System.out.println("Ninja atendeu os requisitos e seu rank é: " + rank);
        }
        else {
            rank = "Gennim";
            System.out.println("Ninja não atendeu os requisitos e seu rank é: "  + rank);
        }
    }
}
