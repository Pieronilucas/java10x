package Desafios.Tentativas;

import java.util.Scanner;

public class Desafio02 {
    public static void main(String[] args) {
        /*
        Você foi encarregado pelo Hokage para gerenciar o cadastro de ninjas na Vila da Folha.
        Sua missão é criar um sistema simples em Java para cadastrar novos ninjas e listar todos os ninjas cadastrados.
        Tópicos a serem utilizados:
        Arrays: Para armazenar os nomes dos ninjas.
        Switch Cases: Para implementar um menu interativo.
        Loops: Para navegar pelas opções do menu e iterar sobre os ninjas cadastrados.
        Condicionais: Para controlar a execução das opções do menu e validar o número de ninjas cadastrados.
         */

        Scanner input = new Scanner(System.in);
        int numArray = 5;
        String[] novosNinjas = new String[numArray];

        System.out.println("Insira a Alternativa que deseja:");
        System.out.println("1 - Inserir novo ninja");
        System.out.println("2 - Mostrar lista de ninjas");
        System.out.println("3 - Sair");

        int alternativa = input.nextInt();
        input.nextLine();


        switch (alternativa) {
            case 1:
                for (int i = 0; i < novosNinjas.length; i++) {
                    System.out.println("Insira o nome do ninja: ");
                    novosNinjas[i] = input.nextLine();
                    if (novosNinjas[i].toLowerCase().equals("sair")) {
                        System.out.println("Você escolheu sair.");
                        novosNinjas[i] = null;
                        break;
                    }
                }
                System.out.println("Escolha a alternativa que deseja: ");
                alternativa = input.nextInt();
                if (alternativa == 3) {
                    break;
                }

            case 2:
                System.out.println("Lista de ninjas: ");
                int count = 0;
                while (count < novosNinjas.length) {
                    System.out.println("Ninja: " + novosNinjas[count]);
                    count++;
                }
                System.out.println("Digite a alternativa que deseja: ");
                alternativa = input.nextInt();
                break;
            case 3:
                System.out.println("Você decidiu sair!");
                break;
            default:
                System.out.println("Opção invalida. Tente novamente.");
                break;

        }

        input.close();

    }
}
