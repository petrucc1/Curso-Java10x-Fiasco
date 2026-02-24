package Iniciante.Condicoes;

public class Main {
    public static void main(String[] args) {
        String nome = "Naruto Uzumaki";
        String ranking;
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 9;

        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("Ranking: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("Ranking: Jounin");
        } else {
            System.out.println("Ranking: Gennim");
        }
    }
}
