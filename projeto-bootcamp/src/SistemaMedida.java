public class SistemaMedida {
    public static void main(String[] args) {
        //Entendendo conceitualmente o uso do SwitchCase no lugar do if/else e casos que seriam melhores em utiliza-lo.
        String sigla = "A";

        switch (sigla) {
            case "P":{
                System.out.println("Pequeno");
                break;
            }
            case "M":{
                System.out.println("Médio");
                break;
            }
            case "G":{
                System.out.println("Grande");
                break;
            }
            default:
            System.out.println("Essa medida não foi definida.");
                  
        }
    } 
}
