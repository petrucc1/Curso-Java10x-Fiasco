package A_Java.B_Intermediario.AJ_PolimorfismoEAbstracao;

public class Uchiha extends Ninja {
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é minha estratégia de batalha.");
    }

    // Sobrescreve o método da classe Ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é o meu ataque Uchiha, um ataque de Fogo.");
    }
}
