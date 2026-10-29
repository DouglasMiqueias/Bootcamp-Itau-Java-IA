
package org.application;

import java.util.Scanner;

public class Menu {

    public static void iniciar() {
        Scanner sc = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Alimentação");
            System.out.println("2. Cultura");
            System.out.println("3. Saúde");
            System.out.println("4. Vestuário");
            System.out.println("0. Sair");
            System.out.print("Selecione o tipo de produto: ");

            opcao = sc.nextInt();

            if (opcao == 0) {
                System.out.println("Saindo do sistema...");
                break;
            }

            if (opcao < 1 || opcao > 4) {
                System.out.println("Valor inválido, tente novamente!");
                continue;
            }

            System.out.print("Informe o valor do produto: R$ ");
            double valor = sc.nextDouble();

            calcularImposto(opcao, valor);

        } while (opcao != 0);

        sc.close();
    }

    public static void calcularImposto(int tipo, double valor) {
        Tributacao tributacao;

        System.out.println("\n=== CALCULANDO IMPOSTO ===");

        switch (tipo) {
            case 1 -> tributacao = new Alimentacao(valor);
            case 2 -> tributacao = new Cultura(valor);
            case 3 -> tributacao = new Saude(valor);
            case 4 -> tributacao = new Vestuario(valor);
            default -> {
                System.out.println("Tipo de produto inválido!");
                return;
            }
        }

        double imposto = tributacao.calcularImposto(valor);

        exibirResultado(valor, imposto);
    }

    public static void exibirResultado(double valor, double imposto) {
        System.out.println("\n=== RESULTADO ===");
        System.out.printf("Valor do produto: R$ %.2f%n", valor);
        System.out.printf("Valor do imposto sobre o produto: R$ %.2f%n", imposto);
        System.out.printf("Valor do produto com imposto: R$ %.2f%n", valor + imposto);
    }
}
