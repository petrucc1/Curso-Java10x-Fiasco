package A_Java.B_Intermediario.AX_Generics;

public class Main_FormaComplicada {
    static void main(String[] args) {
        Kunai_FormaComplicada kunaiUm = new Kunai_FormaComplicada("Kunai Um");
        Kunai_FormaComplicada kunaiDois = new Kunai_FormaComplicada("Kunai Dois");
        Kunai_FormaComplicada kunaiTres = new Kunai_FormaComplicada("Kunai Tres");

        BolsaKunai_FormaComplicada bolsa = new BolsaKunai_FormaComplicada();
        bolsa.adicionarKunai(kunaiUm);

        System.out.println(bolsa);
    }
}
