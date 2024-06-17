import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;
public class AboutMe {
    public static void main(String[] args) {
        try{
            //criando o objeto scanner
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome: ");
            String sobrenome = scanner.next();

            System.out.println("Digite sua idade: ");
            int idade = scanner.nextInt();

            System.out.println("Digite sua altura: ");
            double altura = scanner.nextDouble();

            //imprimindo os dados obtidos pelo usuario
            System.out.println("Ola, me chamado " + nome.toUpperCase() + " " + sobrenome.toUpperCase() + ", tenho " + idade + " anos e " + altura + " de altura.");
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + "cm " );
            scanner.close();
        } 
        catch (InputMismatchException e) {
            System.out.println("Os campos idade deve ser numero, e altura devem ser utilizado (ponto).");
        }
        
    }
}
