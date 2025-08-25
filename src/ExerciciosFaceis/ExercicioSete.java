package ExerciciosFaceis;

import java.util.Scanner;

public class ExercicioSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salário Bruto: ");
        double salarioBruto = scanner.nextDouble();

        double descontoINSS = salarioBruto * 0.08;
        double descontoIR = salarioBruto * 0.22;

        double salarioLiquido = (salarioBruto - descontoINSS - descontoIR);

        System.out.println("Salário Líquido: R$ " +  salarioLiquido);
    }
}
