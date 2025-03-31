package Intermediario.Heranca.Herancamultipla;

public class Main {
    public static void main(String[] args) {
        Uchiha sasuke  = new Uchiha("Sasuke Uchiha", "Konoha", 18);
        sasuke.shariganAtivado();

        Hatake kakashi = new Hatake("Kakashi Hatake", "Konoha", 30);
        kakashi.shariganAtivado();
        kakashi.ninjaDeElite();
    }
}
