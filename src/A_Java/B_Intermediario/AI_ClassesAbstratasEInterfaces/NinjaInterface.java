package A_Java.B_Intermediario.AI_ClassesAbstratasEInterfaces;

public interface NinjaInterface {
    // Não é possível declarar atributos sem definir valores porque tudo é definido automaticamente como FINAL.
    // FINAL significa que você não pode declarar os valores depois.
    String nome = "Naruto Uzumaki";
    String aldeia =  "Aldeia da Folha";
    int idade =  17;

    // É obrigatoriamente abstrato
    void tacarShuriken();
}
