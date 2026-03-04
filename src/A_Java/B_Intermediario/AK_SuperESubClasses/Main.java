package A_Java.B_Intermediario.AK_SuperESubClasses;

public class Main {
    static void main(String[] args) {
        // Objeto Naruto
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da Folha";
        naruto.idade = 17;

        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        // Objeto Sasuke
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da Folha";
        sasuke.idade = 18;

        sasuke.habilidadeEspecial();

        // Objeto Itachi - Usando construtor
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 27);

        itachi.habilidadeEspecial();
    }
}
