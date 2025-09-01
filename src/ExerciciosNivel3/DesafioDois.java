package ExerciciosNivel3;

import java.util.Scanner;

public class DesafioDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();


        int idade;
        while (true) {
            System.out.println("Digite sua idade: ");
            idade = scanner.nextInt();
            if (idade >= 0 && idade <= 120) {
                break;
            } else {
                System.out.println("Idade Inválida");
            }
        }

        String email;
        while (true) {
            System.out.print("Digite seu e-mail: ");
            email = scanner.nextLine();

            if (email.contains("@") && email.contains(".")) { // validação do e-mail
                break;
            } else {
                System.out.println("E-mail inválido! Deve conter '@' e '.'");
            }
        }

        System.out.println("\n=== Cadastro Realizado ===");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("E-mail: " + email);
    }
}
