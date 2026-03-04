package A_Java.B_Intermediario.AL_HerancaMultipla;

public class Uchiha extends Ninja implements Sharingan {
    // Esse método vêm direto da Interface Sharingan
    @Override
    public void sharinganAtivado() {
        System.out.println(nome + " ativou o Sharingan.");
    }
}
