package A_Java.A_Iniciante.AF_ObjDeMemoriaEArrays;

public class Main {
    static void main() {
        // Arrays sempre têm um tipo de dados definido e sempre têm um tamanho fixo.
        // Arrays são tipo referência.
        // new significa que estamos alocando mais um objeto em um novo espaço da memória.
        String[] ninja = new String[6];

        ninja[0] = "Naruto Uzumaki";
        ninja[1] = "Sasuke Uchiha";
        ninja[2] = "Sakura Haruno";
        ninja[3] = "Hinata Hyuga";
        ninja[4] = "Kakashi Hatake";

        System.out.println(ninja); // Printa a referência do array na memória.
    }
}
