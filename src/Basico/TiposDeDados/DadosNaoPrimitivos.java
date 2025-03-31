package Basico.TiposDeDados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
         /*
         Dados não primitivos: String, Array, Class, enum
         Objetivo: criar ninja e atribuir metodos a ele
          */

        String nome = "Naruto Uzumaki";
        String nomeUpperCase = nome.toUpperCase(); // colocar toda a String em caixa alta
        System.out.println("Nome em caixa alta: " + nomeUpperCase);
        System.out.println("Nome: " + nome);

        String aldeia = "Konoha";
        String aldeiaLowerCase = aldeia.toLowerCase();
        System.out.println("Nome da aldeia em minusculo: " + aldeiaLowerCase);
        System.out.println("Nome da aldeia: " + aldeia);
    }
}
