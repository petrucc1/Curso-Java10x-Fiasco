package A_Java.B_Intermediario.AX_Generics;

public class Kunai_FormaComplicada {
    private String nome;

    // Construtores
    public Kunai_FormaComplicada() {
    }

    public Kunai_FormaComplicada(String nome) {
        this.nome = nome;
    }

    // Getters and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos
    @Override // Porque é um método do próprio Java
    public String toString() {
        return nome + " tacou uma Kunai.";
    }
}
