package Intermediario.Construtores.Super;

import Intermediario.Heranca.Boruto;
import Intermediario.Heranca.Haruno;
import Intermediario.Heranca.Hyuga;

public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Konoha", 17, 40, RankNinja.GENIN);
        naruto.estrategiaDeBatalha();
        System.out.println(naruto);


        Uchiha itachi = new Uchiha("Itachi Uchiha", "Konoha", 27);
        itachi.habilidadeEspecial();

        Uchiha madara = new Uchiha("Madara Uchiha", "Konoha", 45, 650, RankNinja.KAGE);
        madara.habilidadeEspecial();
        madara.inteligenciaDeCombate(160);


    }
}
