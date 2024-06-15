public class FormatadorCep {

    public static void main(String[] args) {

        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println(cepFormatado);
        } catch (CepInvalido e) {
            System.out.println("O CEP não corresponde com as regras de negócio");
        }
       
    }

    static String formatarCep(String cep) throws CepInvalido{
    if(cep.length() != 8)
    throw new CepInvalido();
  
    //simulando um cep formatado
    return "23.765-064";
}
}
