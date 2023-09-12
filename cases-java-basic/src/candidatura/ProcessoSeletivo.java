package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void selecaoCandidatos() {
        String[] candidatos = { "FELIPE", "MÁRCIA", "JULIA", "PAULO", "AUGUSTO", "MÔNICA", "FABRÍCIO", "MIRELA",
                "DANIELA", "JORGE" };

        String[] candidatosSelecionados = new String[5]; 
        for (int i = 0; i < candidatos.length; i++) {
            System.out.println("O candidato de index " + (i + 1) + " é " + candidatos[i]);
        }

        int candidatosSelecionadosCount = 0;
        int candidatoAtual = 0; // indice Array
        double salarioBase = 2000.0;
        while (candidatosSelecionadosCount < 5 && candidatoAtual < candidatos.length) {
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " Solicitou esse valor de salário: " + salarioPretendido);

            if (salarioBase >= salarioPretendido) {
                candidatosSelecionados[candidatosSelecionadosCount] = candidato;
                System.out.println("O candidato " + candidato + " Foi selecionado para a vaga.");
                candidatosSelecionadosCount++;
            }
            candidatoAtual++;

        }

        System.out.println("\nCandidatos selecionados para a vaga:");
        for (int i = 0; i < candidatosSelecionadosCount; i++) {
            System.out.println(candidatosSelecionados[i]);
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra-proposta");
        } else {
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}