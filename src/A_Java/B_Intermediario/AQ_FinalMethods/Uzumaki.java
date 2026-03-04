package A_Java.B_Intermediario.AQ_FinalMethods;

public class Uzumaki extends Ninja {
    // Sobrescreve o método da classe Ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é o meu ataque Uzumaki, um ataque de Ar.");
    }

    // Todo ninja vai fazer obrigatoriamente
    // @Override
    // public void tacarKunai() {
    //     System.out.println("Eu sou um método da classe filha: Uzumaki.");
    // }

    public Uzumaki() {
        super();
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }
}
