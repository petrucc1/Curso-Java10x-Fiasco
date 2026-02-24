package Iniciante.SwitchCases;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("--- Lista de Personagens ---");
        System.out.println("1. Naruto Uzumaki");
        System.out.println("2. Sasuke Uchiha");
        System.out.println("3. Sakura Haruno\n");
        System.out.print("Escolha um personagem: ");

        int escolhaDoUsuario = caixaDeTexto.nextInt();

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("Especialidade: Jinchūriki da Kurama e usuário do Rasengan.");
                break;
            case 2:
                System.out.println("Especialidade: Sharingan, técnicas de fogo e Chidori.");
                break;
            case 3:
                System.out.println("Especialidade: Controle de chakra e força sobre-humana.");
                break;
            default:
                System.out.println("Escolha uma opção válida.");
                break;
        }

        // Switch Case Expression
        int nivelDeChakra = switch (escolhaDoUsuario) {
            case 1 -> 1000; // Naruto: reserva absurda de chakra
            case 2 -> 900;  // Sasuke: chakra alto + técnica
            case 3 -> 800;  // Sakura: controle perfeito
            default -> 0;   // opção inválida
        };

        if (nivelDeChakra == 0) {
            System.out.println("Escolha uma opção válida.");
        } else {
            System.out.println("Nível de chakra do personagem: " + nivelDeChakra);
        }

        caixaDeTexto.close();
    }
}
