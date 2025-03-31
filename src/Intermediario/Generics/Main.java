package Intermediario.Generics;

public class Main {
    public static void main(String[] args) {

        MaterialEscolar<Object> materialEscolar1 = new MaterialEscolar<>();
        materialEscolar1.addObject(new Lapis("Bic", 5));
        materialEscolar1.addObject(new Regua(30));
        materialEscolar1.showMochila();


    }
}
