import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número inteiro");
        int numero1 = scanner.nextInt();
        System.out.println("Digite o segundo número inteiro");
        int numero2 = scanner.nextInt();
        scanner.close();

        try {
            if (numero2 <= numero1){
                throw new ParametrosInvalidosException ("O segundo parâmetro deve ser maior que o primeiro");
            }

        int quantFor = numero2 - numero1;

        for (int i = 0; i < quantFor; i++  ){
            System.out.println("Imprimindo o número " + (i + 1));
            
        }
        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
