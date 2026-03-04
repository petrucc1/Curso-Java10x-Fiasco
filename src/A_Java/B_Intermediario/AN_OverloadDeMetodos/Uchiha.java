package A_Java.B_Intermediario.AN_OverloadDeMetodos;

public class Uchiha extends Ninja {
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é minha estratégia de batalha.");
    }

    // Sobrescreve o método da classe Ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é o meu ataque Uchiha, um ataque de Fogo. Meu número de missões concluídas é: " + numeroDeMissoesConcluidas);
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println("Essa é minha inteligência de combate.");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é de: " + qi + " e você é um gênio.");
        } else if (qi >= 130) {
            System.out.println("Seu QI é de: " + qi + " e você é um ninja promissor.");
        } else {
            System.out.println("Seu QI é de: " + qi + " e você precisa obter mais conhecimento.");
        }
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
