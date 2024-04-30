package edu.wastenio.segundasemana;
public class MinhaClasse {
    public static void main(String[] args) {
        String primeiroNome = "Wastenio";
        String segundoNome = "Silva";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome){
        return "resultado do metodo: " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
