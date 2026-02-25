package Iniciante.LacosDeRepeticao;

public class Main {
    static void main() {
        // int numeroDeClones = 0;
        int numeroMaxDeClones = 40;

        /* while (numeroDeClones < numeroMaxDeClones) {
            numeroDeClones++;
            System.out.println("O Naruto fez um novo clone das sombras e atualmente são: " + numeroDeClones);
        } */

        for (int numeroDeClones = 1; numeroDeClones <= numeroMaxDeClones; numeroDeClones++) {
            System.out.println("O Naruto fez um novo clone das sombras e atualmente são: " + numeroDeClones);
        }
    }
}
