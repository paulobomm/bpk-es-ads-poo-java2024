public class Livro {

    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int paginaAtual;

    public Livro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.paginaAtual = 0;
    }

    public void abrirLivro() {
        paginaAtual = 1;
        System.out.println("Você abriu o livro na página " + paginaAtual);
    }

    public void lerPagina() {
        if (paginaAtual == 0) {
            System.out.println("Você precisa abrir o livro primeiro.");
        } else if (paginaAtual < numeroDePaginas) {
            paginaAtual++;
            System.out.println("Você leu a página " + paginaAtual);
        } else {
            System.out.println("Você já terminou o livro!");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public static void main(String[] args) {

        Livro meuLivro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1200);


        System.out.println("Livro: " + meuLivro.getTitulo() + " por " + meuLivro.getAutor());
        meuLivro.abrirLivro();
        meuLivro.lerPagina();
        meuLivro.lerPagina();
    }
}
