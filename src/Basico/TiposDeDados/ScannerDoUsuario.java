package Basico.TiposDeDados;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {


    /*
    Scanner = uma forma de trazer o usuário para dentro da aplicação.
    Objetivo: o user criará um ninja e iremos validar
     */


        // Abrir Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        // Receber nome
        System.out.println("Digite o nome do ninja: ");
        String nomeDoNinja =  caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        // Receber idade
        System.out.println("Digite a idade do ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do seu ninja é: " + idadeDoNinja);

        // Tratamento de dados
        if (idadeDoNinja >= 18) {
            System.out.println("Esse ninja é maior de idade e pode ir para missões fora da aldeia.");
        } else {
            System.out.println("Esse ninja ainda é muito novo para missões externas.");
        }

        // sempre fechar o Scanner para evitar vazamento de memória
        caixaDeTexto.close();

    }
}
