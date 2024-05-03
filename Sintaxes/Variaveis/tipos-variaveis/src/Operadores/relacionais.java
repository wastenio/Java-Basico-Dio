package Operadores;

public class relacionais {

    public static void main(String[] args) {
        int numero = 2;
        int numero2 = 3;

        boolean simNao = numero == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero != numero2;

        System.out.println("numeroUm é diferente de numeroDois? " + simNao);

        simNao = numero > numero2;

        System.out.println("numeroUm é maior que numeroDois? " + simNao);

        simNao = numero >= numero2;

        System.out.println("numeroUm é maior ou igual a numeroDois? " + simNao);
    }
}
