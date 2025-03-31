package Intermediario.HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<String> ninjas = new ArrayList<String>();
        ninjas.add("Naruto Uzumaki");
        ninjas.add("Sakura Haruno");
        ninjas.add("Sasuke Uchiha");
        ninjas.add("Naruto Uzumaki");

        System.out.println(ninjas);

        Set<String> ninjaSet = new HashSet<>();
        ninjaSet.addAll(ninjas);
        ninjaSet.remove("Naruto Uzumaki");
        System.out.println(ninjaSet);

        /*
        HashSet utilizado para fazer o controle de dados repetidos, mas sem ordenação
        TreeSet utilizado para fazer ordenação por ordem de iteração, seguindo o quesito do tipo de dado (ordem alfabetica
        ou númerica, por exemplo)
        LinkedHashSet utilizado para fazer a ordenação por ordem de implementação, seguindo qual foi passado primeiro ao JDK
         */
    }
}
