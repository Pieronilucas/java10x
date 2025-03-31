package Intermediario;

public class Main {
    public static void main(String[] args) {
        System.out.println("----------------- Naruto Uzumaki -----------------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Konoha", 17, 40, RankNinja.GENIN, Biju.KURAMA);
        naruto.estrategiaDeBatalha();
        System.out.println(naruto);

        System.out.println("----------------- Itachi Uchiha -----------------");
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Konoha", 27);
        itachi.habilidadeEspecial();

        System.out.println("----------------- Madara Uchiha -----------------");
        Uchiha madara = new Uchiha("Madara Uchiha", "Konoha", 45, 650, RankNinja.KAGE);
        madara.habilidadeEspecial();
        madara.inteligenciaDeCombate(160);


    }
}
