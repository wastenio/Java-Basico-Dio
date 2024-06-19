package br.com.dio.debbugging;

import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] alunos = {"Eduarda", "Natalia", "Lorena", "Fatima"};

        double media = calculaMediaDaTurma(alunos, scanner);

        System.out.printf("Media da turma %.1f",  media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {
        double soma = 0;
        for (String aluno : alunos) {
            System.out.println("Nota do aluno %s: " + aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
        
    }
    
}
