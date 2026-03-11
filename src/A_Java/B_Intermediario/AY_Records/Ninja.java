package A_Java.B_Intermediario.AY_Records;

import java.util.Objects;

public class Ninja {
    private final String nome = "Naruto Uzumaki";
    private final String email = "naruto@email.com";
    private final int telefone = 999999;

    public Ninja() {
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }

    // Core Class nas próximas aulas
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Ninja ninja = (Ninja) o;
        return telefone == ninja.telefone && Objects.equals(nome, ninja.nome) && Objects.equals(email, ninja.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, email, telefone);
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}
