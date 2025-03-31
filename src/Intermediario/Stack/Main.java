package Intermediario.Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        // Array
        // São estáticos e tem referência de memória prévia
        String[] ninjaArray = new String[2];
        ninjaArray[0] = "Naruto Uzumaki";

        // List
        // São dinâmicas e tem seu tamanho váriavel, não precisando da referência prévia de memória
        List<String> ninjaList = new ArrayList<>();
        ninjaList.add("Naruto Uzumaki");

        // Stack
        // Seguem a premissa da List, mas obrigatoriamente o último elemento se torna o primeiro
        Stack<String> ninjaStack = new Stack<>();
        ninjaStack.push("Naruto Uzumaki");
        System.out.println("ninjaStack = " + ninjaStack);
        ninjaStack.push("Sasuke Uchiha");
        ninjaStack.push("Sakura Haruno");
        System.out.println("ninjaStack atualizada = " + ninjaStack);
        ninjaStack.pop();
        System.out.println("ninjaStack atualizada com pop = " + ninjaStack);
        System.out.println("ninjaStack próximo elemento = " + ninjaStack.peek());
        System.out.println("ninjaStack tamanho = " + ninjaStack.size());

    }
}
