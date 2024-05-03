package Operadores;

public class logicos {
    
    public static void main(String[] args) {
        boolean verdadeiro = true;
        boolean falso = false;
        
        boolean resultado = verdadeiro && falso;
        
        System.out.println("Verdadeiro e falso é igual a: " + resultado);
        
        resultado = verdadeiro || falso;
        
        System.out.println("Verdadeiro ou falso é igual a: " + resultado);
        
        resultado = !verdadeiro;
        
        System.out.println("Não verdadeiro é igual a: " + resultado);
    }
}
