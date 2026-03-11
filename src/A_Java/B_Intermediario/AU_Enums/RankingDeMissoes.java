package A_Java.B_Intermediario.AU_Enums;

public enum RankingDeMissoes {
    D("Extremamente Baixo", 1),
    C("Baixo", 2),
    B("Moderado", 3),
    A("Alto", 4),
    S("Extremamente Alto", 5);

    private String descricao;
    private int dificuldade;

    // Construtores
    RankingDeMissoes() {
    }

    RankingDeMissoes(String descricao, int dificuldade) {
        this.descricao = descricao;
        this.dificuldade = dificuldade;
    }

    // Getters and Setters
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(int dificuldade) {
        this.dificuldade = dificuldade;
    }
}
