package Java.Iniciante.TiposDeDadosDesafioUm;

public class Main {
    public static void main(String[] args) {

        // Ninja 1
        String nomeDoNinja1 = "Naruto Uzumaki";
        int idadeDoNinja1 = 14;
        String missao1 = "Conquistar influência.";
        String nomeDaMissao1 = "Herói";
        char nivelDaMissao1 = 'C';
        String statusDaMissao1;

        if (idadeDoNinja1 < 15) {
            if (nivelDaMissao1 == 'C' || nivelDaMissao1 == 'D') {
                statusDaMissao1 = "Concluída";
            } else {
                statusDaMissao1 = "Não concluída";
            }
        } else {
            statusDaMissao1 = "Concluída";
        }

        System.out.printf("Nome do Ninja: %s\n", nomeDoNinja1);
        System.out.printf("Idade do Ninja: %d\n", idadeDoNinja1);
        System.out.printf("Missão: %s\n", missao1);
        System.out.printf("Nome da Missão: %s\n", nomeDaMissao1);
        System.out.printf("Nível da Missão: %c\n", nivelDaMissao1);
        System.out.printf("Status da Missão: %s\n", statusDaMissao1);

        System.out.println("\n================================================================================================================================\n");

        // Ninja 2
        String nomeDoNinja2 = "Sasuke Uchiha";
        int idadeDoNinja2 = 17;
        String missao2 = "Se vingar.";
        String nomeDaMissao2 = "Vilão";
        char nivelDaMissao2 = 'H';
        String statusDaMissao2;

        if (idadeDoNinja2 < 15) {
            if (nivelDaMissao2 == 'C' || nivelDaMissao2 == 'D') {
                statusDaMissao2 = "Concluída";
            } else {
                statusDaMissao2 = "Não concluída";
            }
        } else {
            statusDaMissao2 = "Concluída";
        }

        System.out.printf("Nome do Ninja: %s\n", nomeDoNinja2);
        System.out.printf("Idade do Ninja: %d\n", idadeDoNinja2);
        System.out.printf("Missão: %s\n", missao2);
        System.out.printf("Nome da Missão: %s\n", nomeDaMissao2);
        System.out.printf("Nível da Missão: %c\n", nivelDaMissao2);
        System.out.printf("Status da Missão: %s\n", statusDaMissao2);

        System.out.println("\n================================================================================================================================\n");

        // Ninja 3
        String nomeDoNinja3 = "Sakura Haruno";
        int idadeDoNinja3 = 14;
        String missao3 = "Curar feridos.";
        String nomeDaMissao3 = "Médica";
        char nivelDaMissao3 = 'E';
        String statusDaMissao3;

        if (idadeDoNinja3 < 15) {
            if (nivelDaMissao3 == 'C' || nivelDaMissao3 == 'D') {
                statusDaMissao3 = "Concluída";
            } else {
                statusDaMissao3 = "Não concluída";
            }
        } else {
            statusDaMissao3 = "Concluída";
        }

        System.out.printf("Nome do Ninja: %s\n", nomeDoNinja3);
        System.out.printf("Idade do Ninja: %d\n", idadeDoNinja3);
        System.out.printf("Missão: %s\n", missao3);
        System.out.printf("Nome da Missão: %s\n", nomeDaMissao3);
        System.out.printf("Nível da Missão: %c\n", nivelDaMissao3);
        System.out.printf("Status da Missão: %s\n", statusDaMissao3);
    }
}
