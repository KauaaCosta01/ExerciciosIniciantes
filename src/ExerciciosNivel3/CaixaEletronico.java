package ExerciciosNivel3;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o Saldo Inicial da Conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("=== Menu Bancário ===");
        System.out.println("1 - Ver Saldo \n2 - Depositar \n3 - Sacar \n4 - Sair");

        int opcao;
        do {
            System.out.println("Escolha uma opcao: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo atual: " + saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor que deseja depositar: ");
                double valorDeposito = scanner.nextDouble();
                saldo += valorDeposito;
                System.out.println("Saldo Atual: " + (saldo));
            } else if (opcao == 3) {
                System.out.println("Digite o valor que deseja sacar: ");
                double valorSacar = scanner.nextDouble();
                if (valorSacar > saldo) {
                    System.out.println("Saldo Insuficiente!");
                } else{
                    saldo -= valorSacar;
                    System.out.println("Saque de" + valorSacar + " efetuado com sucesso!");
                    System.out.println("Saldo Atual: " + (saldo));
                }
            } else if (opcao == 4) {
                System.out.println("Saindo do Sistema!");
            } else System.out.println("opção inválida, tente novamente!");

        } while (opcao != 4);

        scanner.close();
    }
}
