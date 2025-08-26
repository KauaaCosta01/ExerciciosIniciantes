package ExerciciosNivel2;

import java.util.Scanner;

public class ExercicioQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int num2 = scanner.nextInt();


        System.out.println("Escolha a operação pelo Número: \n1 = + Soma\n2 = - Subtração\n3 = * Multiplicação\n4 = / Divisão");
        int operacao = scanner.nextInt();

        switch (operacao) {
            case 1:
                int soma = num1 + num2;
                System.out.println("Soma: " + soma);
                break;
            case 2:
                int subtracao = num1 - num2;
                System.out.println("Subtracao: " + subtracao);
                break;
            case 3:
                int multiplicacao = num1 * num2;
                System.out.println("Multiplicacao: " + multiplicacao);
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Impossível realizar divisão com zero!");
                } else {
                    int divisao = num1 / num2;
                    System.out.println("Divisão: " +  divisao);
                    break;
            }

        }

        scanner.close();
    }
}
