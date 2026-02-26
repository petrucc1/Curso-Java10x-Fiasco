package Java.Iniciante.ArraysEGC;

public class Main {
    static void main() {
        // String inicializa como null
        String[] ninja = new String[6];

        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";

        System.out.println(ninja[5]);

        for (int i = 0; i < 6; i++) {
            System.out.println(ninja[i]);
        }

        // int inicializa como 0
        int[] idade = new int[2];
        System.out.println(idade[1]);

        // boolean inicializa como false
        boolean[] ninjaPremium = new boolean[3];

        ninjaPremium[0] = true;
        ninjaPremium[1] = false;

        System.out.println(ninjaPremium[2]); // false

        // double inicializa como 0.0
        double[] notas = new double[4];

        notas[0] = 7.5;
        notas[1] = 8.0;
        notas[2] = 9.3;

        System.out.println(notas[3]); // 0.0
    }
}
