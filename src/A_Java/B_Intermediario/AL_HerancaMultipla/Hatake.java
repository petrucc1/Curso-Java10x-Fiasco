package A_Java.B_Intermediario.AL_HerancaMultipla;

public class Hatake extends Ninja implements Sharingan, Anbu, Hokage {
    public void boasVindas() {
        System.out.println("Eu sou um Hatake. Me chamo " + nome + ".");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println(nome + " ativou o Sharingan.");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println("Eu sou um ninja de elite da Anbu.");
    }

    @Override
    public void hokageAtivo() {
        System.out.println("Eu sou um Hokage.");
    }
}
