package Iniciante.ArraysDeRefEMultidimensionais;

public class Main {
    static void main() {
        String[][] ninjasEAldeias = new String[3][3];

        ninjasEAldeias[0][0] = "Konaha";
        ninjasEAldeias[0][1] = "Naruto";
        ninjasEAldeias[0][2] = "Sasuke";

        ninjasEAldeias[1][0] = "Névoa";
        ninjasEAldeias[1][1] = "Zabuza";
        ninjasEAldeias[1][2] = "Haku";

        ninjasEAldeias[2][0] = "Deserto";
        ninjasEAldeias[2][1] = "Gaara";
        ninjasEAldeias[2][2] = "Temari";

        for (int ninja = 0; ninja < ninjasEAldeias.length; ninja++) {
            System.out.println("Aldeia: " + ninjasEAldeias[ninja][0] + " | " + "Ninjas: " + ninjasEAldeias[ninja][1] + ", " + ninjasEAldeias[ninja][2]);
        }
    }
}
