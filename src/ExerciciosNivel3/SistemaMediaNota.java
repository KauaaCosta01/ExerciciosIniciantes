package ExerciciosNivel3;

import java.util.Scanner;

public class SistemaMediaNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite três notas de (0 a 10) para realizarmos a média.");

        System.out.println("Digite a nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite a nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite a nota 3: ");
        double nota3 = scanner.nextDouble();

        // Validação das notas
        if (nota1 < 0 || nota1 > 10 || nota2 < 0 || nota2 > 10 || nota3 < 0 || nota3 > 10) {
            System.out.println("Erro: As notas devem estar entre 0 e 10.");
        } else {
            double media = (nota1 + nota2 + nota3) / 3.0;

            if (media >= 7) {
                System.out.println("Parabéns, aprovado com média: " + media);
            } else if (media >= 5) {
                System.out.println("Atenção, recuperação. Média: " + media);
            } else {
                System.out.println("Reprovado. Média: " + media);
            }
        }

        scanner.close();
    }
}
