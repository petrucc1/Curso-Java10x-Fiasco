package A_Java.B_Intermediario.AR_FinalClass;

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

    // Não é obrigatório usar o Override para sobrescrever um método porque o Java faz isso sozinho, mas é uma boa prática utilizá-lo.
    // A anotação Override também previne erros durante a compilação do código.
    @Override
    public void metodoProvisorio() {
        System.out.println("Teste na classe Uchiha.");
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
