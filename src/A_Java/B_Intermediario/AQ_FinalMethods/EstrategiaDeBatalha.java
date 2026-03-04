package A_Java.B_Intermediario.AQ_FinalMethods;

public interface EstrategiaDeBatalha {
    // Todos os atributos declarados em uma interface, por padrão, são 'final', portanto, precisam ser inicializadas
    String nomeGenerico = "Ninja";

    void estrategiaDeBatalhaNinja();

    void inteligenciaDeCombate();

    void inteligenciaDeCombate(int qi);
}
