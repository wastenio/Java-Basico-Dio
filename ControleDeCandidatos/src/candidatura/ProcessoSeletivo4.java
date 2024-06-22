package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo4 {
    public static void main(String[] args) {
        String[] candidatos = {"João", "Maria", "José", "Ana", "Carlos"};
        for(String candidato : candidatos){
            entrandoEmContato(candidato);

        }
    }

    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
            atendeu = atender();
            continuarTentando = !atendeu;
            if(continuarTentando){
                tentativasRealizadas++;
            }else{
                System.out.println("Contato realizado com sucesso!");
            }

        }while(continuarTentando && tentativasRealizadas < 3);

        if(atendeu){
            System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + "ª tentativa");
        }else{
            System.out.println("Não conseguimos contato com " + candidato + " , número maximo de tentativas " + tentativasRealizadas);
        }
    }

    //método auxiliar
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

    static void imprimirSelecionados(){
        String[] candidatos = {"João", "Maria", "José", "Ana", "Carlos"};

        System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

        for(int i=0; i < candidatos.length; i++){
            System.out.println("Candidato de nº " + (i+1) + " é " + candidatos[i]);
        }

        System.out.println("Forma abreviada de imprimir a lista de candidatos com for each");

        for(String candidato : candidatos){
            System.out.println("Candidato: " + candidato);
        }
    }
    
    static void selecaoDeCandidatos(){
        String[] candidatos = {"João", "Maria", "José", "Ana", "Carlos", "Mariana", "Pedro", "Paula", "Lucas", "Juliana"};
        
        int candidatoSelecionado = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.00;
        while(candidatoSelecionado < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou este valor de salário: " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatoSelecionado++;
            }
            candidatoAtual++;
        }
    }
    
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800.00, 2200.00);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.00;
        if (salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
        System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
    
}
