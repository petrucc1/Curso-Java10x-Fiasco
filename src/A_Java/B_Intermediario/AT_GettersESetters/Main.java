package A_Java.B_Intermediario.AT_GettersESetters;

public class Main {
    static void main() {
        System.out.println("============================== Naruto Uzumaki ==============================");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 17, 30, 1.67);
        System.out.println(naruto.getNome());
        naruto.setNumeroDeMissoesConcluidas(32);
        System.out.println(naruto.getNumeroDeMissoesConcluidas());

        System.out.println("============================== Sasuke Uchiha ==============================");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18, 53, 1.75);
    }
}
