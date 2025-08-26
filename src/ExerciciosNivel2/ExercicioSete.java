package ExerciciosNivel2;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("Digite uma palavra: ");
        String palavra = scanner.next();
        System.out.println("Digite outra palavra: ");
        String palavra2 = scanner.next();

        if (palavra.equalsIgnoreCase(palavra2)) {
            System.out.println("As palavras São Iguais: " + palavra);
        } else {
            System.out.println("As palavras (" + palavra + ") e (" + palavra2 + ") são diferentes");
        }

        scanner.close();
    }
}
