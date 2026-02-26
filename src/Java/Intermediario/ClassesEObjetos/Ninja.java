package Java.Intermediario.ClassesEObjetos;

public class Ninja {
    String nome;
    int idade;
    String aldeia;

    // Criando um método público personalizado - void não retorna nenhum valor
    public void SharinganAtivado() {
        System.out.println("Sharingan ativado");
    }

    // Todo método String precisa retornar um String
    public String boasVindas() {
        return "Boas vindas! Meu nome é " + nome + "." ;
    }

    // Todo método int precisa retornar um int
    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }
}
