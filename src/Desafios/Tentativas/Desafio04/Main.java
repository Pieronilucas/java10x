package Desafios.Tentativas.Desafio04;

public class Main {
    public static void main(String[] args) {
        NinjaBasico konohamaru = new NinjaBasico("Konohamaru", 10, "Ser chato pra caralho");
        NinjaAvancado naruto = new NinjaAvancado("Naruto", 18, "Vento", "Rasengan");
        konohamaru.mostrarInformacoes();
        konohamaru.executarHabilidade();
        System.out.println("----------------");
        naruto.mostrarInformacoes();
        naruto.executarHabilidade();
    }
}
