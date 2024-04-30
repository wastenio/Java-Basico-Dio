public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        String nome = "Wastenio";
        double salarioMinimo = 2500;
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 10;
        numero = 20;

        System.out.println(numero);

        // final nao deixa alterar o valor da variavel
        final double VALOR_PI = 3.14;
    }
}
