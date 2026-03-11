package A_Java.B_Intermediario.AY_Records;

public record NinjaRecord(String nome, String email, int telefone) {

    // Cria todos os construtores, getters e todas as outras funções comuns de uma classe, como equals, hashCode e toString.
    // Todos os atributos são 'final' por padrão.
    // Records não possuem setters.
    // Usado quando temos classes constantes com valores que não serão alterados.
    // Pesquisar a diferença entre Record e o ENUM.

    public String nomeCaixaAlta() {
        return nome.toUpperCase();
    }
}
