package Basico.Condicoes;

public class Ternario {
    public static void main(String[] args) {

        /*
        Ternarios: uma maneira utilizada para reduzir o código testando condicionais
        variavel = (condicao) ? valorSeVerdade : valorSeFalso;
         */

        short numeroDeMissoes = 11;
        String nivelDoNinja  = (numeroDeMissoes >= 10) ? "Esse ninja esta com mais de 10 missoes" : "Esse ninja tem menos que 10 missoes";
        System.out.println(nivelDoNinja);


    }
}
