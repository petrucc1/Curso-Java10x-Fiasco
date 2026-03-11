package A_Java.B_Intermediario.BA_Queue;

import java.util.*;

public class Main {
    static void main() {
        // Array
        String[] ninjasArray = new String[10];

        // List
        List<String> ninjasList = new ArrayList<>();

        // Stack
        Stack<String> ninjasStack = new Stack<>();

        // Queue - Filas - HEAD: primeiro da fila; TAIL: último da fila
        // Pesquisar sobre PriorityQueue
        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto Uzumaki");
        ninjasQueue.add("Sasuke Uchiha");
        ninjasQueue.add("Sakura Haruno");
        System.out.println(ninjasQueue);
        ninjasQueue.poll(); // Remove o primeiro elemento da fila
        System.out.println(ninjasQueue);
        System.out.println(ninjasQueue.peek()); // Retorna o primeiro elemento da fila sem removê-lo

        // Verificar se a fila está vazia
        if(ninjasQueue.isEmpty()) {
            System.out.println("A fila está vazia.");
        } else {
            System.out.println("A fila não está vazia.");
        }
    }
}
