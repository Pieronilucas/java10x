package Intermediario.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("A");
        queue.add("B");
        queue.add("C");
        queue.add("D");
        queue.add("E");
        System.out.println(queue);
        System.out.println(queue.peek());
        while (!queue.isEmpty()) {
            queue.poll();
        }
        System.out.println(queue.isEmpty());
    }
}
