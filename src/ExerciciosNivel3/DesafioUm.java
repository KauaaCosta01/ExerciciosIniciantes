package ExerciciosNivel3;

import java.util.Scanner;

public class DesafioUm {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num1 =  scanner.nextDouble();
        System.out.println("Digite outro número: ");
        double num2 =  scanner.nextDouble();

        System.out.println("\nEscolha a operação que deseja realizar: \n1 - (+) \n2 - (-) \n3 - (*) \n4 - (/)");
        int operacao = scanner.nextInt();

        switch(operacao){
            case 1:
                System.out.printf("Soma: %.2f", (num1 + num2));
                break;
            case 2:
                System.out.printf("Subtração: %.2f", (num1 - num2));
                break;
            case 3:
                System.out.printf("Multiplicação: %.2f", (num1 * num2));
                break;
            case 4:
                if (num1 == 0 || num2 == 0) {
                    System.out.println("Erro! Impossível dividir por zero!");
                } else {
                    System.out.printf("Divisão: %.2f", (num1 / num2));
                }
                break;
            default:
                System.out.println("Opção Inválida!");
        }

        scanner.close();
    }
}
