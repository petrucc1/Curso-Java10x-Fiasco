package A_Java.B_Intermediario.AG_Construtores;

public class Main {
    static void main(String[] args) {
        Hokages Hashirama = new Hokages();
        Hashirama.idade = 45;

        Hokages Tobirama = new Hokages("Tobirama Senju", 45, false);
        System.out.println(Tobirama.nome);

        Hokages Hiruzen = new Hokages("Hiruzen Sarutobi", 40, true);
        System.out.println(Hiruzen.idade);

        Hokages Minato = new Hokages("Minato Namikaze", 32, false);
        System.out.println(Minato.vivoOuNao);
    }
}
