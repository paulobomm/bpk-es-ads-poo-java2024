public class Jogo {
    private String nome;
    private String genero;
    private double preco;

    public Jogo(String nome, String genero, double preco) {
        this.nome = nome;
        this.genero = genero;
        this.preco = preco;
    }

    public void iniciar() {
        System.out.println("O jogo '" + nome + "' está começando. Divirta-se jogando!");
    }

    public void pausar() {
        System.out.println("O jogo '" + nome + "' está pausado.");
    }

    public String getNome() {
        return nome;
    }

    public String getGenero() {
        return genero;
    }

    public double getPreco() {
        return preco;
    }

    public static void main(String[] args) {
        Jogo meuJogo = new Jogo("The Witcher 3", "RPG", 59.99);

        System.out.println("Jogo: " + meuJogo.getNome());
        System.out.println("Gênero: " + meuJogo.getGenero());
        System.out.println("Preço: R$" + meuJogo.getPreco());

        meuJogo.iniciar();
        meuJogo.pausar();
    }
}

