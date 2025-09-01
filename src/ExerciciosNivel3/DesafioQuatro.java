package ExerciciosNivel3;

import java.util.Scanner;

public class DesafioQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double dolar = 5.20;
        double euro = 5.70;
        double peso = 246.83;

        System.out.println("Quantos reais deseja converter? ");
        double reais = scanner.nextDouble();

        System.out.println("Para qual moeda deseja converter? \n1 - Dólar (USD) – cotação 5.20 \n2 - Euro (EUR) – cotação 5.70 \n3 - Peso Argentino (ARS) – cotação 0.02");
        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.printf("Dolar: $%.2f", (reais * dolar));
                break;
            case 2:
                System.out.printf("Euro: $%.2f", (reais * euro));
                break;
            case 3:
                System.out.printf("Peso Argentino: $%.2f", (reais * peso));
                break;
            default:
                System.out.println("Opção Inválida!");
        }

        scanner.close();
    }
}