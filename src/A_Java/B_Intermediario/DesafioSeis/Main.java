package A_Java.B_Intermediario.DesafioSeis;

import java.util.LinkedList;

public class Main {
    static void main() {
        // Iniciar uma Linked List com 7 ninjas
        LinkedList<Ninja> ninjas = new LinkedList<>();

        // Adicionar ninjas à lista
        ninjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        ninjas.add(new Ninja("Sasuke Uchiha", 18, "Konoha"));
        ninjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        ninjas.add(new Ninja("Kakashi Hatake", 30, "Konoha"));
        ninjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        ninjas.add(new Ninja("Hinata Hyuga", 17, "Konoha"));
        ninjas.add(new Ninja("Rock Lee", 17, "Konoha"));

        // Listar os ninjas - Complexidade O (n)
        for (Ninja ninja : ninjas) {
            System.out.println(ninja);
        }

        // Adicionar um ninja no início da lista
        ninjas.addFirst(new Ninja("Boruto Uzumaki", 9, "Konoha"));

        // Remover um ninja no início da lista
        Ninja removido = ninjas.removeFirst();
        System.out.println("Ninja removido: " + removido);

        // Procurar um ninja por índice
        Ninja terceiroNinja = ninjas.get(3);
        System.out.println("Terceiro Ninja: " + terceiroNinja);
    }
}
