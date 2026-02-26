package Java.Iniciante.Scanner;

import java.util.Scanner;

public class Main {
    static void main() {
        // Abre o Scanner
        Scanner caixaDeTexto = new Scanner(System.in);

        // Recebe o nome do ninja
        System.out.print("Escreva o nome do ninja: ");
        String nomeDoNinja = caixaDeTexto.nextLine();

        System.out.printf("O nome do ninja é %s.", nomeDoNinja);

        // Recebe a idade do ninja
        System.out.print("Escreva a idade do ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();

        System.out.printf("A idade do ninja é %d.", idadeDoNinja);

        // Fecha o Scanner
        caixaDeTexto.close();
    }
}
