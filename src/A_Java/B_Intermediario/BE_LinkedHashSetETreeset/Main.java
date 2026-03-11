package A_Java.B_Intermediario.BE_LinkedHashSetETreeset;

import java.util.*;

public class Main {
    static void main() {
        // Continuando a partir do código de HashSet

        /* Resumo:
         * HashSet: sem duplicatas, mas sem ordem específica;
         * TreeSet: sem duplicatas, mas em uma ordem lógica;
         * LinkedHashSet: sem duplicatas, mas na ordem de implementação.
         * */

        // List
        List<String> ninjasLista = new ArrayList<>();
        ninjasLista.add("Naruto Uzumaki");
        ninjasLista.add("Sasuke Uchiha");
        ninjasLista.add("Sakura Haruno");
        ninjasLista.add("Naruto Uzumaki");
        ninjasLista.add("Danzo");
        ninjasLista.add("Kakashi Hatake");
        ninjasLista.add("Boruto Uzumaki");

        System.out.println(ninjasLista);

        Set<String> ninjasSet = new TreeSet<>();
        ninjasSet.addAll(ninjasLista);

        System.out.println(ninjasSet); // Os elementos são listados em ordem alfabética.

        // HashSet usamos quando não queremos valores duplicados.
        // TreeSet usamos quando queremos valores sem duplicatas também, porém, em uma ordem lógica.
        // LinkedHashSet faz o mesmo que o HashSet, porém, mantém a ordem de implementação dos valores da lista.
    }
}
