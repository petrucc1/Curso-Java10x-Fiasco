package A_Java.B_Intermediario.A_ClassesEObjetos;

public class Main {
    static void main(String[] args) {
        // Criando ninjas
        Ninja sasuke = new Ninja();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.aldeia = "Aldeia da Folha";
        // Aplicando métodos ao meu objeto Sasuke
        sasuke.SharinganAtivado();
        String chamandoMetodo  = sasuke.boasVindas();
        System.out.println(chamandoMetodo);

        int quantoTempoFalta = sasuke.anosParaSeTornarHokage(50);
        System.out.println("Você tem " + sasuke.idade + " e faltam " + quantoTempoFalta + " anos para você se tornar um Hokage.");

        Ninja naruto = new Ninja();
        naruto.nome = "Naruto Uzumaki";
        naruto.idade = 17;
        naruto.aldeia = "Aldeia da Folha";

        Ninja sakura = new Ninja();
        sakura.nome = "Sakura Haruno";
        sakura.idade = 18;
        sakura.aldeia = "Aldeia da Folha";
    }
}
