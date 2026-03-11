package A_Java.B_Intermediario.AX_Generics;

import java.util.List;

public class BolsaGenerica<T> {
    private List<T> equipamentos;

    public BolsaGenerica() {
    }

    public BolsaGenerica(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    // Colocar equipamentos genéricos
    public void adicionarEquipamentos(T equipamentoGenerico) {
        equipamentos.add(equipamentoGenerico);
    }

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    @Override
    public String toString() {
        return equipamentos.toString();
    }
}
