package A_Java.B_Intermediario.AP_RefEValorDeMemoria;

public class Main {
    static void main(String[] args) {
        // Objeto Naruto
        System.out.println("-------------------------------- Naruto Uzumaki --------------------------------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 17);
        // Referência de memória
        System.out.println(naruto);
        // Valor na memória
        System.out.println(naruto.nome);

        // Objeto Sasuke
        System.out.println("-------------------------------- Sasuke Uchiha --------------------------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18);
        System.out.println(sasuke);
    }
}
