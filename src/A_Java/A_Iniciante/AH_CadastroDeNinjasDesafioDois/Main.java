package A_Java.A_Iniciante.AH_CadastroDeNinjasDesafioDois;

import java.util.Scanner;

public class Main {

    static void main() {

        Scanner scanner = new Scanner(System.in);

        String[] nomesDosNinjas = new String[10];
        int quantidadeCadastrada = 0;
        int escolhaDoUsuario = 0;

        while (escolhaDoUsuario != 3) {

            System.out.println("\n--- Menu ---");
            System.out.println("1. Cadastrar ninja");
            System.out.println("2. Listar todos os ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            escolhaDoUsuario = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer

            switch (escolhaDoUsuario) {

                case 1:
                    if (quantidadeCadastrada < nomesDosNinjas.length) {

                        System.out.print("Escreva o nome do ninja: ");
                        String nome = scanner.nextLine();

                        nomesDosNinjas[quantidadeCadastrada] = nome;
                        quantidadeCadastrada++;

                        System.out.println("Ninja cadastrado com sucesso!");

                    } else {
                        System.out.println("A lista de ninjas está cheia!");
                    }
                    break;

                case 2:
                    if (quantidadeCadastrada == 0) {
                        System.out.println("Nenhum ninja cadastrado ainda.");
                    } else {
                        System.out.println("\n--- Lista de Ninjas ---");
                        for (int i = 0; i < quantidadeCadastrada; i++) {
                            System.out.println((i + 1) + ". " + nomesDosNinjas[i]);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Operação finalizada com sucesso!");
                    break;

                default:
                    System.out.println("Escolha uma opção válida!");
            }
        }

        scanner.close();
    }
}