package A_Java.B_Intermediario.AY_Records;

public class Main {
    static void main() {
        NinjaRecord cadastroNaruto = new NinjaRecord("Naruto Uzumaki", "naruto@email.com", 999999);
        System.out.println(cadastroNaruto.nomeCaixaAlta());
        System.out.println(cadastroNaruto);
    }
}
