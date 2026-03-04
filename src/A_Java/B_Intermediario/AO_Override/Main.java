package A_Java.B_Intermediario.AO_Override;

public class Main {
    static void main(String[] args) {
        // Objeto Naruto
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 17);
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalhaNinja();

        // Objeto Sasuke
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18, 23, Ranking.GENIN);
        sasuke.habilidadeEspecial();

        // Objeto Itachi - Usando construtor
        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 27, 847, Ranking.JOUNIN);
        itachi.habilidadeEspecial();
        itachi.metodoProvisorio();

        // Objeto Madara
        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeia da Folha", 47, 951, Ranking.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();
        // Método padrão
        madara.inteligenciaDeCombate();
        // Sobrecarga do Método
        madara.inteligenciaDeCombate(180);
    }
}
