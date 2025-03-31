package Basico.Condicoes;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        /*
        SwitchCases: servem para controlar casos especificos
        Objetivo: pedir para usuario escolher entre os ninjas
         */

        // Pedir usuário
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha");
        System.out.println("3 - Sakura Haruno");

        int escolharUser = scan.nextInt();

        System.out.println("Você digitou:  " + escolharUser);

        switch (escolharUser) {
            case 1:
                System.out.println("O usuário escolheu o Naruto Uzumaki");
                break;
            case 2:
                System.out.println("O usuário escolheu o Sasuke Uchiha");
                break;
            case 3:
                System.out.println("O usuário escolheu a Sakura Haruno");
                break;
            default:
                System.out.println("Usuário escolheu um número inválido");
                break;
        }

        // fechar scan
        scan.close();
    }
}
