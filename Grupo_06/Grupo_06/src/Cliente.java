public class Cliente {
    private String nomeCliente;
    private int cpfCliente;
    private EnderecoCliente endereco;

    public Cliente(String nomeCliente, int cpfCliente, EnderecoCliente endereco) {
        this.nomeCliente = nomeCliente;
        this.cpfCliente = cpfCliente;
        this.endereco = endereco;
    }

    public void cadastrarEndereco(EnderecoCliente novoEndereco) {
        this.endereco = novoEndereco;
    }

    // Getters e Setters
    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getCpfCliente() {
        return cpfCliente;
    }

    public EnderecoCliente getEndereco() {
        return endereco;
    }
}

