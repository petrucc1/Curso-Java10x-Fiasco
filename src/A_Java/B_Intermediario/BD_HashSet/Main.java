package A_Java.B_Intermediario.BD_HashSet;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    static void main() {
        /*List
        List<String> ninjasLista = new ArrayList<>();
        ninjasLista.add("Naruto Uzumaki");
        ninjasLista.add("Sasuke Uchiha");
        ninjasLista.add("Sakura Haruno");
        ninjasLista.add("Naruto Uzumaki"); // Listas permitem valores repetidos.
        System.out.println(ninjasLista);

        // É possível transformar um List em um Set de forma simples como demonstrado abaixo, trazendo o mesmo resultado.
        Set<String> ninjasSet = new HashSet<>();
        ninjasSet.addAll(ninjasLista);
        System.out.println(ninjasSet);*/

        // Set
        // Com set, ignoramos index e valores repetidos.
        Set<String> ninjasSet = new HashSet<>();
        ninjasSet.add("Naruto Uzumaki");
        ninjasSet.add("Sasuke Uchiha");
        ninjasSet.add("Sakura Haruno");
        ninjasSet.add("Naruto Uzumaki");
        System.out.println(ninjasSet); // É listado os itens sem a duplicata e em ordem alfabética.
        ninjasSet.remove("Sakura Haruno"); // Não é possível remover com index porque o Set não possui index, é preciso descrever o elemento a ser removido.
        System.out.println(ninjasSet);
    }
}
