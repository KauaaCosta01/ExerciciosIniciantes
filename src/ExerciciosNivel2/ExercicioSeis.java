package ExerciciosNivel2;

import java.util.Scanner;

public class ExercicioSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String correctUser = "admin";
        String corretPass = "1234";
        boolean login = false;

        for (int attemp = 1; attemp <= 3; attemp++) {
            System.out.println("Digite o usuário: ");
            String usuario = scanner.next();
            System.out.println("Digite o password: ");
            String password = scanner.next();

            if (usuario.equals(correctUser) && password.equals(corretPass)) {
                System.out.println("Login efetuado com sucesso");
                login = true;
                break;
            } else {
                System.out.println("Usuário ou Password incorreto " + (3 - attemp));
            }
        }

        if (!login) {
            System.out.println("Conta Bloqueada");
        }

        scanner.close();
    }
}
