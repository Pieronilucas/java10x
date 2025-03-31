package Desafios.Tentativas;

public class Desafio01 {
    public static void main(String[] args) {
        String[] ninjas = new String[]{"Naruto", "Kakashi", "Konohamaru"};
        int[] idades = new int[]{17, 27, 15};
        boolean concluida = false;
        char[] dificuldade = {'S', 'A', 'B', 'C', 'D'};
        String[] nomeMissao = new String[]{"Busca membro akatsuki", "Proteção posto avançado", "Escolta idosa"};

        String nomeNinja1 = ninjas[0];
        String nomeNinja2 = ninjas[1];
        String nomeNinja3 = ninjas[2];

        int idadeNinja1 = idades[0];
        int idadeNinja2 = idades[1];
        int idadeNinja3 = idades[2];

        String missaoNinja1 = nomeMissao[1];
        String missaoNinja2 = nomeMissao[0];
        String missaoNinja3 = nomeMissao[2];

        char dificuldadeMissaoNinja1 = dificuldade[1];
        char dificuldadeMissaoNinja2 = dificuldade[0];
        char dificuldadeMissaoNinja3 = dificuldade[3];

        if  (dificuldadeMissaoNinja1 == 'C' || dificuldadeMissaoNinja1 == 'D' && idadeNinja1 >= 15) {
            concluida = true;
        }
        System.out.println("Ninja: " + nomeNinja1);
        System.out.println("Idade: " + idadeNinja1);
        System.out.println("Missao: " + missaoNinja1);
        System.out.println("Dificuldade: " + dificuldadeMissaoNinja1);
        System.out.println("status de concluida:  " + concluida);
        if  (dificuldadeMissaoNinja2 == 'C' || dificuldadeMissaoNinja2 == 'D' && idadeNinja2 == 15) {
            concluida = true;
        }
        System.out.println("Ninja: " + nomeNinja2);
        System.out.println("Idade: " + idadeNinja2);
        System.out.println("Missao: " + missaoNinja2);
        System.out.println("Dificuldade: " + dificuldadeMissaoNinja2);
        System.out.println("status de concluida:  " + concluida);
        if  (dificuldadeMissaoNinja3 == 'C' || dificuldadeMissaoNinja3 == 'D' && idadeNinja3 == 15) {
            concluida = true;
        }
        System.out.println("Ninja: " + nomeNinja3);
        System.out.println("Idade: " + idadeNinja3);
        System.out.println("Missao: " + missaoNinja3);
        System.out.println("Dificuldade: " + dificuldadeMissaoNinja3);
        System.out.println("status de concluida:  " + concluida);

    }
}
