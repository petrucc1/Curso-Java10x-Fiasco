package A_Java.B_Intermediario.AM_OverloadDeConstrutores;

public class Uchiha extends Ninja {
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é minha estratégia de batalha.");
    }

    // Sobrescreve o método da classe Ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é o meu ataque Uchiha, um ataque de Fogo. Meu número de missões concluídas é: " + numeroDeMissoesConcluidas);
    }

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, Ranking nivelNinja) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, nivelNinja);
    }
}
