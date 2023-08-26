public class CaixaEletronico {
public static void main(String[] args) {
    
    //fixando conhecimentos osbre controle de fluxo com condicionais simples
        double saldo = 25.0;
        double valorSolicitado = 17;

        if (valorSolicitado < saldo){
            saldo = saldo - valorSolicitado;

            System.out.println("seu novo saldo é "+ saldo);
        } else{
            System.out.println("Seu saldo é insuficiente");
        }
    }
}
