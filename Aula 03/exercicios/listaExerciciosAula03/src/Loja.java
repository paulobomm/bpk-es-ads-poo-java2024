public class Loja {
    private String nome;
    private String endereco;
    private String telefone;

    public Loja(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public void abrir() {
        System.out.println("A loja '" + nome + "' está agora aberta.");
    }

    public void fechar() {
        System.out.println("A loja '" + nome + "' está agora fechada.");
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public static void main(String[] args) {
        Loja minhaLoja = new Loja("Loja Exemplo", "Rua Principal, 123", "(11) 1234-5678");

        System.out.println("Nome da Loja: " + minhaLoja.getNome());
        System.out.println("Endereço: " + minhaLoja.getEndereco());
        System.out.println("Telefone: " + minhaLoja.getTelefone());

        minhaLoja.abrir();
        minhaLoja.fechar();
    }
}
