package A_Java.B_Intermediario.AU_Enums;

public class Main {
    static void main() {
        Missoes missaoUm = new Missoes("Resgatar cachorro", RankingDeMissoes.D);
        missaoUm.exibirDetalhes();

        Missoes missaoDois = new Missoes("Derrotar Zabuza", RankingDeMissoes.A);
        missaoDois.exibirDetalhes();
    }
}
