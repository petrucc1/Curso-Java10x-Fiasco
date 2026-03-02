package A_Java.B_Intermediario.AI_ClassesAbstratasEInterfaces;

public abstract class Ninja {
    String nome;
    String aldeia;
    int idade;

    // Métodos abstratos
    public abstract void nomeDoNinja();

    public void tacarKunai() {
        System.out.println("Eu taquei uma Kunai.");
    }
}
