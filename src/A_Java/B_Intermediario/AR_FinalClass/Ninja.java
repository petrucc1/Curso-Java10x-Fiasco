package A_Java.B_Intermediario.AR_FinalClass;

// Não consigo criar objetos a partir de classes abstratas, mas classes abstratas podem ser estendidas
public abstract class Ninja implements EstrategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    // Ranking: Genin, Chuunin, Jounin, Kage
    Ranking nivelNinja;
    final double altura = 1.70; // Argumentos 'final' também não podem ser sobrescritos e devem ser inicializados - É como uma constante em JavaScript

    // Todo ninja vai fazer obrigatoriamente
    //  Métodos 'final' não podem ser sobrescritos
    final void tacarKunai() {
        System.out.println("Eu sou um método da classe mãe: Ninja.");
    }

    // Método geral - Todos os Ninjas vão ter
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque especial.");
    }

    // Estou sobrescrevendo o que estou pegando da minha interface
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é minha estratégia de batalha.");
    }

    // Método padrão
    public void inteligenciaDeCombate() {
        System.out.println("Essa é minha inteligência de combate.");
    }

    // Sobrecarga do método
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é de: " + qi + " e você é um gênio.");
        } else if (qi >= 130) {
            System.out.println("Seu QI é de: " + qi + " e você é um ninja promissor.");
        } else {
            System.out.println("Seu QI é de: " + qi + " e você precisa obter mais conhecimento.");
        }
    }

    // Método sem anotação Override
    public void metodoProvisorio() {
        System.out.println("Teste na classe Ninja.");
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

    // Método toString
    @Override
    public String toString() {
        return "Você está acessando a referência de memória da instância " + nome + " e este é o Método toString para referência de memória.";
    }
}
