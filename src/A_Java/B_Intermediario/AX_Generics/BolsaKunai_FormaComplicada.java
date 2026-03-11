package A_Java.B_Intermediario.AX_Generics;

import java.util.ArrayList;
import java.util.List;

public class BolsaKunai_FormaComplicada {
    private List<Kunai_FormaComplicada> kunais;

    // Construtores
    public BolsaKunai_FormaComplicada() {
        this.kunais = new ArrayList<>();
    }

    // Método
    public void adicionarKunai(Kunai_FormaComplicada kunai) {
        kunais.add(kunai);
    }

    // Getters and Setters
    public List<Kunai_FormaComplicada> getKunais() {
        return kunais;
    }

    public void setKunais(List<Kunai_FormaComplicada> kunais) {
        this.kunais = kunais;
    }

    @Override
    public String toString() {
        return "Bolsa de Kunais: " + kunais;
    }
}
