package A_Java.C_Avançado.AC_IntroABigO;

import java.util.ArrayList;

public class Main {
    static void main() {
        ArrayList<Ninjas> ninjas = new ArrayList<Ninjas>();
        ninjas.add(new Ninjas("Naruto Uzumaki", 17));
        ninjas.add(new Ninjas("Sasuke Uchiha", 18));
        ninjas.add(new Ninjas("Sakura Haruno", 18));

        // Algoritmo com Complexidade Constante - O(1)
        System.out.println(ninjas.get(2));

        // Algoritmo com Complexidade Linear - O(n)
        for (Ninjas ninja: ninjas) {
            System.out.println(ninja);
        }

        // Nested Loop (Loop Encadeado) - Algoritmo com Complexidade Quadrática - O(n²)
        for (int i = 0; i < ninjas.size(); i++) {
            for (int j = 0; j < ninjas.size(); j++) {
                System.out.println(ninjas.get(i) + " x " + ninjas.get(j));
            }
        }
    }
}
