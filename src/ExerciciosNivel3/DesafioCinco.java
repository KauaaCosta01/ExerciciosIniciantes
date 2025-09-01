package ExerciciosNivel3;

import java.util.Random;
import java.util.Scanner;

public class DesafioCinco {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        Random rand = new Random();

        int numeroSecreto = rand.nextInt(100) + 1;

        int palpites;
        int tentavicas = 0;

        System.out.println("Bem vindo ao jogo de advinhação");
        System.out.println("Tente advinhar o numero entre 1 e 100:");

        do {
            System.out.println("Digite um numero: ");
            palpites = scanner.nextInt();
            tentavicas++;

            if (palpites > numeroSecreto) {
                System.out.println("O número secreto é menor");
            } else if (palpites < numeroSecreto) {
                System.out.println("O número secreto é maior");
            } else {
                System.out.println("Parabéns, Você acertou! em " + tentavicas + " tentavivas!");
            }
        } while (palpites != numeroSecreto);

        scanner.close();
    }
}
