public class FormatadorDeCepExemplo {
    public static void main(String[] args) {
        try {
            String meuCepFormatado = formatarCep("60010120");
            System.out.println(meuCepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP informado é inválido");
        }
        
    }
    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8) {
            throw new CepInvalidoException();
        }
        //simunlando a formatação do cep
        return "60.010-120";
    }
}
