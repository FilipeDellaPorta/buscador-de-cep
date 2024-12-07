public class Main {
    public static void main(String[] args) {

        ConsultaCep consultaCep = new ConsultaCep();
        Endereco novoEndereco = consultaCep.buscaEndereco("01001001");
        System.out.println(novoEndereco);
    }
}
