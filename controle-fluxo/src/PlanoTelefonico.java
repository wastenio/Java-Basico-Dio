public class PlanoTelefonico {
    public static void main(String[] args) {
        String plano = "Turbo";

        switch (plano){
            case "Turbo":{
                System.out.println("5Gb Youtube");
            }
            case "Midia":{
                System.out.println("Whats e insta grátis");
            }
            case "Basic":{
                System.out.println("100 min. de ligação");
            }
            
            
            default:
                System.out.println("Plano desconhecido");
        }
    }
    
}
