package A_Java.B_Intermediario.AJ_PolimorfismoEAbstracao;

public class Uzumaki extends Ninja {
    // Sobrescreve o método da classe Ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é o meu ataque Uzumaki, um ataque de Ar.");
    }
}
