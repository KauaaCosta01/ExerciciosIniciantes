package ExerciciosFaceis;

import java.util.Scanner;

public class ExercicioTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        System.out.println("Digite outro numero: ");
        int numero2 = scanner.nextInt();

        System.out.println("Soma: " + (numero + numero2));
        System.out.println("Subtração: " + (numero - numero2));
        System.out.println("Multiplicação: " + (numero * numero2));
        System.out.println("Divisão: " +  (numero / numero2));
    }
}
