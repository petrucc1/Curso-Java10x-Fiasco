package A_Java.C_Avançado.AE_Streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {
        List<Ninja> ninjas = new ArrayList<>();
        ninjas.add(new Ninja("Naruto Uzumaki", 17, "Konoha"));
        ninjas.add(new Ninja("Sasuke Uchiha", 17, "Konoha"));
        ninjas.add(new Ninja("Sakura Haruno", 17, "Konoha"));
        ninjas.add(new Ninja("Kakashi Hatake", 31, "Konoha"));
        ninjas.add(new Ninja("Shikamaru Nara", 17, "Konoha"));
        ninjas.add(new Ninja("Ino Yamanaka", 17, "Konoha"));
        ninjas.add(new Ninja("Choji Akimichi", 17, "Konoha"));
        ninjas.add(new Ninja("Hinata Hyuga", 17, "Konoha"));
        ninjas.add(new Ninja("Kiba Inuzuka", 17, "Konoha"));
        ninjas.add(new Ninja("Shino Aburame", 17, "Konoha"));
        ninjas.add(new Ninja("Rock Lee", 17, "Konoha"));
        ninjas.add(new Ninja("Neji Hyuga", 18, "Konoha"));
        ninjas.add(new Ninja("Gaara", 17, "Suna"));
        ninjas.add(new Ninja("Temari", 19, "Suna"));
        ninjas.add(new Ninja("Kankuro", 19, "Suna"));
        ninjas.add(new Ninja("Might Guy", 32, "Konoha"));

        // Filter - Filtragem dos ninjas por vila
        ninjas.stream()
                .filter(ninja -> ninja.getAldeia().equals("Suna"))
                .forEach(System.out::println); //soutc

        System.out.println("-----------------------------");

        // Sorted - Ordenação dos ninjas por idade
//        ninjas.stream()
//                .filter((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
//                .forEach(System.out::println);

        // Sorted - Ordenação dos ninjas por nome
//        ninjas.stream()
//                .sorted((n1, n2) -> n1.getNome().compareTo(n2.getNome()))
//                .forEach(System.out::println);

        // Map - Mapeia e mostra um atributo
        ninjas.stream()
                .map(Ninja::getNome)
                .forEach(System.out::println);

        ninjas.stream()
                .map(Ninja::getIdade)
                .forEach(System.out::println);

        // Max - Filtrar por ninja mais velho
        Ninja ninjaMaisVelho = ninjas.stream()
                .max((n1, n2) -> Integer.compare(n1.getIdade(), n2.getIdade()))
                .orElse(null);
        System.out.println("Ninja filtrado pelo mais velho = " + ninjaMaisVelho);
    }
}
