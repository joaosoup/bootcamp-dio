public class PlanoOperadora {
    public static void main(String[] args) {
        //é interessante o uso do switch case em casos em que ajam informações complementares a serem adicionadas, como planos que se complementam.
        String plano = "T";

        switch (plano) {
             case "T":{
                System.out.println("5 GB Youtube");
            }
            case "M": {
                System.out.println("Redes sociais gratuitas.");
            }
           case "B":{
                System.out.println("100 minutos de ligação");
            }
        }
    }
}
