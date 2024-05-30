public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 1000.0;
        double saque = 1500.0;

        if (saque < saldo) {
            saldo = saldo - saque;
            System.out.println("Seu saldo é de: " + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }

    }

}
