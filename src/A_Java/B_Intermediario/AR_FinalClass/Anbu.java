package A_Java.B_Intermediario.AR_FinalClass;

// Essa classe não pode ser estendida se houver a palavra 'final'
final class Anbu {
    // É possível declarar atributos em uma classe 'final' para ela ser inicializada ou reutilizada fora da classe
    String nome;

    public void anbu() {
        System.out.println("Eu sou um Anbu.");
    }
}
