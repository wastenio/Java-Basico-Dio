package br.com.dio.debbugging;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Inicio do programa no metodo main.");
        a();
        System.out.println("Finalizou o programa no metodo main.");
    }

    static void a() {
        System.out.println("Inicio do metodo a.");
        b();
        System.out.println("Finalizou o metodo a.");
    }

    static void b() {
        System.out.println("Inicio do metodo b.");
        for(int i = 0; i <= 4; i++) System.out.println(i);
        c();
        System.out.println("Finalizou o metodo b.");
    }

    static void c() {
        System.out.println("Inicio do metodo c.");
        Thread.dumpStack();
        System.out.println("Finalizou o metodo c.");
    }
}
