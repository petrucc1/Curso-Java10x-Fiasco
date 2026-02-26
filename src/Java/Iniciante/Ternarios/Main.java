package Java.Iniciante.Ternarios;

public class Main {
    static void main() {
        short numeroDeMissoes = 11;
        String nivel = (numeroDeMissoes >= 10) ? "Esse ninja está com mais de 10 missões." : "Esse ninja tem menos de 10 missões.";

        System.out.println(nivel);
    }
}
