package Basico.Condicoes;

public class LacosDeRepeticao {
    public static void main(String[] args) {
        /*
        laços de repetição: vao repetir x vezes o código até atenderem as condições
        while e for
         */
        // while
        int numeroDeClones = 0;
        int numeroMaxDeClones = 40;

        /*while (numeroDeClones <= numeroMaxDeClones) {
            numeroDeClones++;
            System.out.println("O naruto fez um clone das sombras " +  numeroDeClones);
        }*/

        for (int i = 0; i <= numeroMaxDeClones; i++) {
            System.out.println("O naruto fez um clone das sombras " +  i);
        }
    }
}
