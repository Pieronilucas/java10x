package Intermediario.Heranca;

public class Main {
    public static void main(String[] args) {

        // Criar o Naruto
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Konoha";
        Naruto.idade = 17;
//        System.out.println(Naruto.nome +  " " + Naruto.aldeia + " " + Naruto.idade);
//        int quantoFalta = Naruto.anosParaSeTornarHokage(50);
//        System.out.println("Você tem: " + Naruto.idade + ", então faltam ao menos " + quantoFalta +  " anos.");
        Naruto.ModoSabioAtivado();

        // Criar Sasuke
        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.idade = 18;
        Sasuke.aldeia = "Konoha";
//        System.out.println(Sasuke.nome + " "  + Sasuke.aldeia + " " + Sasuke.idade);
        Sasuke.ShariganAtivado();
        Sasuke.habilidadeEspecial();

        // Criar Sakura
        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.idade = 18;
        Sakura.aldeia = "Konoha";
        Sakura.AtivarCura();

        // Criar Hinata
        Hyuga Hinata  = new Hyuga();
        Hinata.nome = "Hinata Hyuga";
        Hinata.idade = 18;
        Hinata.aldeia = "Konoha";
        Hinata.ByakuganAtivado();

        // Criar Boruto
        Boruto boruto = new Boruto();
        boruto.nome = "Boruto Hyuga Uzumaki";
        boruto.aldeia = "Konoha";
        boruto.idade = 9;
        boruto.ModoSabioAtivado();
        boruto.AtivarJougan();
        boruto.AtivarKarma();
    }
}
