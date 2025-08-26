package ExerciciosNivel2;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite uma nota de 0 a 10: ");
        int nota = scanner.nextInt();

        if (nota < 5) {
            System.out.println("Reprovado");
        } else if (nota >= 5 && nota < 7) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Aprovado");
        }

        scanner.close();
    }
}
