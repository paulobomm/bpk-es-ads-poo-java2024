public class Cozinha {
    private String tipo;
    private int quantidadePessoas;
    private String cor;

    public Cozinha(String tipo, int quantidadePessoas, String cor) {
        this.tipo = tipo;
        this.quantidadePessoas = quantidadePessoas;
        this.cor = cor;
    }

    public void cozinhar() {
        System.out.println("Cozinhando na cozinha de tipo: " + tipo + ". Pode acomodar " + quantidadePessoas + " pessoas.");
    }

    public void limpar() {
        System.out.println("Limpando a cozinha de cor: " + cor + ".");
    }

    public String getTipo() {
        return tipo;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public String getCor() {
        return cor;
    }

    public static void main(String[] args) {
        Cozinha minhaCozinha = new Cozinha("Americana", 4, "Branca");

        System.out.println("Tipo de cozinha: " + minhaCozinha.getTipo());
        System.out.println("Capacidade de pessoas: " + minhaCozinha.getQuantidadePessoas());
        System.out.println("Cor da cozinha: " + minhaCozinha.getCor());

        minhaCozinha.cozinhar();
        minhaCozinha.limpar();
    }
}
