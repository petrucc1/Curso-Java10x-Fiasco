package A_Java.B_Intermediario.AZ_Stack;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {
    static void main() {
        // Arrays - Estáticas e com referência de memória prévia
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto Uzumaki";

        // Listas - Dinâmicas e o tamanho aumenta ou diminui conforme uso
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto Uzumaki");

        // Stack - O último que entra, é obrigatoriamente o primeiro a sair
        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.push("Naruto Uzumaki");
        ninjasStack.push("Sasuke Uchiha");
        ninjasStack.push("Sasuka Haruno");
        System.out.println(ninjasStack);
        ninjasStack.pop();
        System.out.println(ninjasStack);
        System.out.println(ninjasStack.peek());
        System.out.println(ninjasStack.size()); // Não traz o comprimento, traz a quantidade de itens dentro da pilha.
    }
}
