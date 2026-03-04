package A_Java.B_Intermediario.DesafioCinco;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Menu inicial
            System.out.println("----------- Escolha o tipo de conta -----------");
            System.out.println("1 - Conta Corrente");
            System.out.println("2 - Conta Poupança");
            System.out.println("3 - Sair");
            System.out.print("Insira o número da opção desejada: ");

            int opcaoClienteConta = sc.nextInt();

            // Tratando condicionais a partir da escolha do cliente
            switch (opcaoClienteConta) {
                case 1:
                    ContaCorrente contaUm = new ContaCorrente();

                    while (true) {
                        System.out.println("----------- Escolha uma opção -----------");
                        System.out.println("1 - Consultar saldo");
                        System.out.println("2 - Depositar saldo");
                        System.out.println("3 - Sacar saldo");
                        System.out.println("4 - Voltar ao menu principal");
                        System.out.print("Insira o número da opção desejada: ");

                        int opcaoClienteAcao = sc.nextInt();

                        if (opcaoClienteAcao == 1) {
                            contaUm.consultarSaldo();

                        } else if (opcaoClienteAcao == 2) {
                            System.out.print("Digite o valor a ser depositado: ");
                            double valor = sc.nextDouble();
                            contaUm.depositar(valor);

                        } else if (opcaoClienteAcao == 3) {
                            System.out.print("Digite um valor a ser sacado: ");
                            double valor = sc.nextDouble();
                            contaUm.sacar(valor);

                        } else if (opcaoClienteAcao == 4) {
                            break; // Sai do loop

                        } else {
                            System.out.println("Insira uma opção válida.");
                        }
                    }
                    break;
                case 2:
                    ContaPoupanca contaDois = new ContaPoupanca();

                    while (true) {
                        System.out.println("----------- Escolha uma opção -----------");
                        System.out.println("1 - Consultar saldo");
                        System.out.println("2 - Depositar saldo");
                        System.out.println("3 - Sacar saldo");
                        System.out.println("4 - Voltar ao menu principal");
                        System.out.print("Insira o número da opção desejada: ");

                        int opcaoClienteAcao = sc.nextInt();

                        if (opcaoClienteAcao == 1) {
                            contaDois.consultarSaldo();

                        } else if (opcaoClienteAcao == 2) {
                            System.out.print("Digite o valor a ser depositado: ");
                            double valor = sc.nextDouble();
                            contaDois.depositar(valor);

                        } else if (opcaoClienteAcao == 3) {
                            System.out.print("Digite um valor a ser sacado: ");
                            double valor = sc.nextDouble();
                            contaDois.sacar(valor);

                        } else if (opcaoClienteAcao == 4) {
                            break; // Sai do loop

                        } else {
                            System.out.println("Insira uma opção válida.");
                        }
                    }
                    break;
                case 3:
                    System.out.println("Programa encerrado com sucesso!");
                    return;
                default:
                    System.out.println("Insira uma opção válida.");
            }
        }
    }
}
