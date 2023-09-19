package candidatura;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
                "DANIELA", "JORGE" };

        String[] candidatosSelecionados = new String[5];

        int candidatosSelecionadosCount = 0;
        int candidatoAtual = 0; // Índice do Array
        double salarioBase = 2000.0;
        while (candidatosSelecionadosCount < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            Locale localeBR = new Locale("pt","BR");
            NumberFormat dinheiro = NumberFormat.getCurrencyInstance(localeBR);



            System.out.println("O candidato " + candidato + " solicitou esse valor de salário: " + dinheiro.format(salarioPretendido));

            if (salarioBase >= salarioPretendido) {
                candidatosSelecionados[candidatosSelecionadosCount] = candidato;
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
                candidatosSelecionadosCount++;
            }
            candidatoAtual++;
        }

        System.out.println("\nCandidatos selecionados para a vaga: ");
        for (int i = 0; i < candidatosSelecionadosCount; i++) {
            System.out.println("O candidato(a) " + candidatosSelecionados[i] + " foi selecionado");

            boolean atendeu = fazerLigacao(candidatosSelecionados[i]); 
            if (atendeu) {
                System.out.println("Conseguimos contato com " + candidatosSelecionados[i]);
            } else {
                System.out.println("Não conseguimos contato com " + candidatosSelecionados[i]);
            }
        }
    }

    static boolean fazerLigacao(String candidato) {
        int tentativas = 0;
        while (tentativas < 3) {
            boolean atendeu = atender(); 
            System.out.println("Ligando para o candidato " + candidato + " - Tentativa " + (tentativas + 1));
            if (atendeu) {
                return true; 
            }
            tentativas++;
        }
        return false; 
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static double valorPretendido() {
        
        
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
}
