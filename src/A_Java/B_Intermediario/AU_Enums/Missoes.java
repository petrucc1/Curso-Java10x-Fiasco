package A_Java.B_Intermediario.AU_Enums;

public class Missoes {
    private String nome;
    private RankingDeMissoes ranking;

    // Método para mostrar mais informações
    public void exibirDetalhes() {
        System.out.println("Missão: " + nome + "; Ranking: " + ranking + " (Descrição: " + ranking.getDescricao() + "; Dificuldade: " + getRanking().getDificuldade() + ")");
    }

    // Construtores
    public Missoes() {
    }

    public Missoes(String nome, RankingDeMissoes ranking) {
        this.nome = nome;
        this.ranking = ranking;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public RankingDeMissoes getRanking() {
        return ranking;
    }

    public void setRanking(RankingDeMissoes ranking) {
        this.ranking = ranking;
    }
}
