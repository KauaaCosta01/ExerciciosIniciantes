package ExerciciosNivel2;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);

        System.out.println("=== Cadastre-se ===");
        System.out.println("Digite o Usuário: ");
        String usuario = scanner.nextLine();
        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();

        System.out.println("Cadastro Realizado com sucesso!");

        System.out.println("\n=== Login ===");
        System.out.println("Digite o Usuário: ");
        String login = scanner.nextLine();
        System.out.println("Digite a senha: ");
        String loginSenha =  scanner.nextLine();

        if (usuario.equalsIgnoreCase(login) && senha.equalsIgnoreCase(loginSenha)) {
            System.out.println("\nLogin realizado com sucesso!");
        } else {
            System.out.println("\nSenha incorreta ou Usuário Incorreto!");
        }

        scanner.close();
    }
}
