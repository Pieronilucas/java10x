package Intermediario.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Array
        // São objetos estáticos, não alteram o tamanho dinamicamente
        String[] ninjasArray = new String[4];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";


        // Listas
        // São dinamicas e alteram seus tamanhos automaticamente
        List<String> ninjasList = new ArrayList<String>();
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        ninjasList.add("Tobirama Senju");
        // Adicionar elemento
        ninjasList.add("Kakashi Hatake");
        System.out.println("Ninjas List" + ninjasList);

        // Remover elementos
        ninjasList.remove("Kakashi Hatake"); // pode ser removido utilizando o indice do elemento também
        System.out.println("Ninjas List" + ninjasList);

        // trocar elementos
        ninjasList.set(3, "Hashirama Senju");
        System.out.println("Ninjas List" + ninjasList);

        // verificar tamanho da lista
        System.out.println("Ninjas List " + ninjasList.size());

    }
}
