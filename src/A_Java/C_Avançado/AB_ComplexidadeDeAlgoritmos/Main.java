package A_Java.C_Avançado.AB_ComplexidadeDeAlgoritmos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    static void main() {
        long inicio;
        long fim;
        long tempo;

        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 0; i < 2000500; i++) {
            arrayList.add(i);
            linkedList.add(i);
        }

    // Fazer buscas num LinkedList pode levar mais tempo porque o ArrayList é sequencial, possui indexes e o LinkedList não.

        // Verificar o número do index - ArrayList
        inicio = System.nanoTime();

        arrayList.add(250);

        fim = System.nanoTime();
        tempo = fim - inicio;

        System.out.println("Tempo (ns) do ArrayList: " + tempo);

        // Verificar o número do index - LinkedLIst
        inicio = System.nanoTime();

        linkedList.add(250);

        fim = System.nanoTime();
        tempo = fim - inicio;

        System.out.println("Tempo (ns) do LinkedList: " + tempo);
    }
}
