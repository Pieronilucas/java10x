package Desafios.Resposta;

import java.util.Scanner;

public class DesafioFiasco02 {
    public static void main(String[] args) {
        // ENTRADA
        Scanner scanner = new Scanner(System.in);

        // DADOS
        int NUMERO_MAX = 10;
        String[] ninjas = new String[NUMERO_MAX];

        // CONTADORES
        int ninjasCadastrados = 0;
        int opcao = 0;

        while (opcao != 3) {
            // MENU
            System.out.println("\n==== Menu Ninja =====");
            System.out.println("1 - Cadastrar ninja");
            System.out.println("2 - Listar de ninjas");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma das opções: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados < NUMERO_MAX) {
                        System.out.println("Digite o nome do ninja para cadastro: ");
                        String nomeNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    } else {
                        System.out.println("A lista está cheia, impossivel fazer cadastrar um ninja.");
                    }
                    break;
                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja foi encontrado.");
                    } else {
                        System.out.println("========== Lista de ninjas ==========");
                        for (int i = 0; i < ninjas.length; i++) {
                            System.out.println(ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Você escolheu sair.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
