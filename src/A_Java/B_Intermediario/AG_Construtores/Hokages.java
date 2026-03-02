package A_Java.B_Intermediario.AG_Construtores;

public class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;
    // String aldeia;
    // int missoes;
    // double saldoBancario;
    // double altura;

    // Construtor com argumentos - AllArgs Constructor
    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        // this.aldeia = aldeia;
        // this.missoes = missoes;
        // this.saldoBancario = saldoBancario;
        // this.altura = altura;
    }

    public Hokages() {
        // Construtor vazio, sem argumentos - NoArgs Constructor
    }
}
