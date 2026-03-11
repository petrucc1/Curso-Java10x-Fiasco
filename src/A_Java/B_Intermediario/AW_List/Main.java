package A_Java.B_Intermediario.AW_List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        // Arrays - São estáticos, ou seja, não alteram de tamanho.
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";
        ninjasArray[1] = "Sasuke Uchiha";
        ninjasArray[2] = "Sakura Haruno";
        System.out.println("Ninjas Array: " + ninjasArray[0]);

        // Listas - Não são estáticas, ou seja, podem aumentar ou diminuir de tamanho.
        List<String> ninjasList = new ArrayList<String>();

        // Adicionando na lista
        ninjasList.add("Naruto Uzumaki");
        ninjasList.add("Sasuke Uchiha");
        ninjasList.add("Sakura Haruno");
        System.out.println("Ninjas List: " + ninjasList);

        // Removendo da lista
        ninjasList.remove("Sakura Haruno");
        System.out.println("Ninjas List: " + ninjasList);

        // Alterando a lista
        ninjasList.set(1, "Hashirama Senju");
        System.out.println("Ninjas List: " + ninjasList);

        // Vendo o tamanho da lista: número de elementos
        System.out.println(ninjasList.size());
    }
}
