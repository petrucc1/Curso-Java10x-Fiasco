package A_Java.B_Intermediario.DesafioCinco;

public class ContaCorrente extends ContaBancaria {
    // Método para consultar o saldo
    public void consultarSaldo() {
        System.out.printf("Seu saldo atual é de: %.2f\n", saldo);
    }

    // Método para depositar saldo
    public void depositar(double valor) {
        if (valor >= 0) {
            saldo += valor;
            System.out.printf("Você depositou R$%.2f na sua conta corrente. Seu saldo atual é de: %.2f\n", valor, saldo);
        } else {
            System.out.printf("Deposite um valor válido. Seu saldo atual é de: %.2f\n", saldo);
        }
    }

    // Método para sacar saldo
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.printf("Você sacou R$%.2f na sua conta corrente. Seu saldo atual é de: %.2f\n", valor, saldo);
        } else {
            System.out.printf("Saque um valor válido. Seu saldo atual é de: %.2f\n", saldo);
        }
    }
}
