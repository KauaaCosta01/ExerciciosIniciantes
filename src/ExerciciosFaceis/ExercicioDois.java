package ExerciciosFaceis;

public class ExercicioDois {
    public static void main(String[] args) {
        double preco = 9.99;
        int quantidade = 5;

        double totalCompra =  preco * quantidade;
        System.out.println("Valor total Compra : R$ " +  totalCompra);

        int totalCompraCasting = (int) totalCompra;
        System.out.println("Valor total CompraCasting : R$ " +  totalCompraCasting);
    }
}
