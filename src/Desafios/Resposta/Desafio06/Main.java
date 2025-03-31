package Desafios.Resposta.Desafio06;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Ninja> listaDeNinjas = new LinkedList<Ninja>();

        listaDeNinjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Sasuke Uchiha", 18, "Konoha"));
        listaDeNinjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        listaDeNinjas.add(new Ninja("Gaara", 17, "Areia"));
        listaDeNinjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        listaDeNinjas.add(new Ninja("Temari", 18, "Areia"));

        System.out.println("Lista de ninjas: ");

        for (Ninja ninja : listaDeNinjas) {
            System.out.println(ninja);
        }

        listaDeNinjas.addFirst(new Ninja("Boruto Uzumaki", 9, "Konoha"));

        System.out.println("---------------------------------------------------------------------------");

        Ninja removido = listaDeNinjas.removeFirst();
        System.out.println("Ninja removido: " + removido);

        System.out.println("---------------------------------------------------------------------------");

        for (Ninja listaDeNinjaAtualizada : listaDeNinjas) {
            System.out.println(listaDeNinjaAtualizada);
        }

        System.out.println("---------------------------------------------------------------------------");

        Ninja terceiroNinja = listaDeNinjas.get(3);
        System.out.println(terceiroNinja);

    }
}
