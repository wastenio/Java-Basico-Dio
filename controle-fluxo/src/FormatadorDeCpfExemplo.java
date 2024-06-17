public class FormatadorDeCpfExemplo {
    public static void main(String[] args) {
        try {
            String cpfFormatado = formatarCep("60427416329");
            System.out.println(cpfFormatado);
        } catch (Exception e) {

        }
    }
    static String formatarCep(String cpf) throws Exception {
        if (cpf.length() != 11) {
            throw new Exception();
        }
        //simunlando a formatação do cpf
        return "604.274.163-29";
    }
    
}
