package ExerciciosNivel2;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade < 12) {
            System.out.println("Você é uma Criança");
        } else if (idade > 12 && idade <= 17) {
            System.out.println("Você é um adolescente");
        } else if (idade >= 18 && idade <= 59) {
            System.out.println("Você é um adulto");
        } else {
            System.out.println("Você é um idoso");
        }

        scanner.close();
    }
}
