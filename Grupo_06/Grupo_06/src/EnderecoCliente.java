public class EnderecoCliente {
    private String logradouro;
    private int numero;
    private String complemento;
    private int cep;

    public EnderecoCliente(String logradouro, int numero, String complemento, int cep) {
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
    }

    public void alterarEndereco(String novoLogradouro, int novoNumero, String novoComplemento, int novoCep) {
        this.logradouro = novoLogradouro;
        this.numero = novoNumero;
        this.complemento = novoComplemento;
        this.cep = novoCep;
    }

    // Getters e Setters
    public String getLogradouro() {
        return logradouro;
    }

    public int getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public int getCep() {
        return cep;
    }
}
