package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo2 {
    
    public static void main(String[] args) {
        selecaoDeCandidatos();

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
