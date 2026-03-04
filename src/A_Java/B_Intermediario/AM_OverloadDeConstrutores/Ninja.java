package A_Java.B_Intermediario.AM_OverloadDeConstrutores;

public abstract class Ninja implements EstrategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    // Ranking: Genin, Chuunin, Jounin, Kage
    Ranking nivelNinja;

    // Método geral - Todos os Ninjas vão ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial.");
    }

    // Estou sobrescrevendo o que estou pegando da minha interface
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é minha estratégia de batalha.");
    }

    public Ninja() {
    }

    // Método existente - Primeiro método
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }
    
    // Sobrecarga do Construtor chamando os novos atributos
    //  Na Sobrecarga de Métodos, não é preciso redeclarar o Construtor, apenas os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, Ranking nivelNinja) {
        this(nome, aldeia, idade); // Referenciando Construtor de cima
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.nivelNinja = nivelNinja;
    }
}
