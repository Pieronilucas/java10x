package Intermediario.Encapsulamento;

public class Main {
    public static void main(String[] args) {
        System.out.println("--------------- Naruto Uzumaki ---------------");
        Uzumaki naruto = new Uzumaki("Naruto", "Aldeia da Folha", 17, 30, 1.7);
        System.out.println("Meu nome é: " + naruto.getNome());
        naruto.setNome("Naruto Uzumaki");
        System.out.println("Meu nome é: " + naruto.getNome());
        System.out.println("--------------- Sasuke Uchiha ---------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18, 36, 1.75);
        System.out.println("Meu nome é: " + sasuke.getNome());
    }
}
