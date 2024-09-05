import java.io.PrintStream;

public class Main {
    public static void main(String[] args) {

        Livro meuLivro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1200, 1);
        System.out.println("Livro: " + meuLivro.getTitulo() + " por " + meuLivro.getAutor() +  " com " + meuLivro.getNumeroDePaginas() +  " paginas "); ;

        meuLivro.abrirLivro();
        meuLivro.marcadorPagina();
        meuLivro.fecharLivro();

    }
}