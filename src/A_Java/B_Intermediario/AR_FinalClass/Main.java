package A_Java.B_Intermediario.AR_FinalClass;

public class Main {
    static void main() {
        // Objeto Naruto
        System.out.println("-------------------------------- Naruto Uzumaki --------------------------------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 17);
        // Referência de memória
        System.out.println(naruto);
        // Valor na memória
        System.out.println(naruto.nome);
        naruto.tacarKunai();
        // Não será possível alterar valor porque o atributo é 'final'
        System.out.println(naruto.altura);
    }
}
