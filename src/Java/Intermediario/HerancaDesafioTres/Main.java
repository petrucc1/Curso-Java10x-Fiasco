package Java.Intermediario.HerancaDesafioTres;

public class Main {
    static void main(String[] args) {

        // Inicializar o objeto
        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.idade = 18;
        sasuke.missao = "Treinar o controle do Sharingan";
        sasuke.nivelDificuldade = "Alta";
        sasuke.statusMissao = "Concluído";
        sasuke.habilidadeEspecial = "Mangekyō Sharingan";
        sasuke.mostrarInformacoes();
        sasuke.mostrarHabilidadeEspecial();
    }
}
