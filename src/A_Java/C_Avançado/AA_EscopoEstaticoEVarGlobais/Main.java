package A_Java.C_Avançado.AA_EscopoEstaticoEVarGlobais;

public class Main {
    // Explicação do PSVM - public static void main
    // public - o main pode ser acessado a partir de qualquer outro lugar
    // static - tudo o que é static pode ser acessado sem a necessidade de criar um novo objeto, ou seja, não preciso inicializar um objeto
    // void - métodos void não retornam nada

    // Variáveis globais precisam ser instanciadas para serem utilizadas:
    int idadeGlobal = 18; // Não estática
    static int idadeGlobalStatic = 18; // Estática

    static void main() {
        Main main = new Main(); // Assim é possível acessar a variável global, pois ela não é static
        System.out.println(main.idadeGlobal);

        System.out.println(main.idadeGlobalStatic); // Se a variável global for estática, é possível acessá-la tranquilamente, sem instanciar um novo objeto.
    }
}
