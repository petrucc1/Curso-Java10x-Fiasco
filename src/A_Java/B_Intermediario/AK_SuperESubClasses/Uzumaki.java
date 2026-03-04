package A_Java.B_Intermediario.AK_SuperESubClasses;

public class Uzumaki extends Ninja {
    // Sobrescreve o método da classe Ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é o meu ataque Uzumaki, um ataque de Ar.");
    }

    public Uzumaki() {
        super();
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }
}
