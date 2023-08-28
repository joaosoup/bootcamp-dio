public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"FELIPE","JONAS", "JULIA", "JOAO" };
        //Em arrays o indice de elementos inicia no número 0.
        for (int x = 0; x < alunos.length; x++){
            System.out.println("O aluno no índice x = " + x + " é " + alunos[x]);
        }
    }
}
