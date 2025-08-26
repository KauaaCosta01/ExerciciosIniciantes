package ExerciciosNivel2;

import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int num1 = scanner.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("É par");
        } else  {
            System.out.println("É Impar");
        }

        scanner.close();
    }
}
