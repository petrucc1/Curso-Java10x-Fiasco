package A_Java.B_Intermediario.BC_LinkedList;

import java.util.LinkedList;

public class Main {
    static void main() {
        /* Aula Teórica
        * Explicando sobre ponteiros.
        * Explicando sobre adição e remoção de elementos das Linked Lists.
        * Explicará sobre Big O (Notation) no futuro.
        */

        // Aula Prática
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Naruto Uzumaki");
        lista.add("Sasuke Uchiha");
        lista.add("Sakura Haruno");
        System.out.println(lista);
        lista.add(1, "Kakashi Hatake");
        System.out.println(lista);
        lista.remove(2);
        System.out.println(lista);
    }
}
