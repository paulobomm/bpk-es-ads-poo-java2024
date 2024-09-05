import java.io.PrintStream;

public class Livro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int marcadorPagina;



    public Livro(String titulo, String autor, int numeroDePaginas, int marcadorPagina) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
        this.marcadorPagina = marcadorPagina;
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

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public void abrirLivro(){
        System.out.println("Abrindo o livro");
    }

    public void  marcadorPagina(){
        if (this.marcadorPagina == 0) {
            System.out.println("Você precisa abrir o livro primeiro.");
        } else if (this.marcadorPagina < this.numeroDePaginas) {
            ++this.marcadorPagina;
            System.out.println("Você parou a sua leitura na pagina anterior a pagina " + this.marcadorPagina);
        } else {
            System.out.println("Você já terminou o livro!");
        }

    }

    public void fecharLivro(){
        System.out.println("Fechando o livro");
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", numeroDePaginas=" + numeroDePaginas +
                ", marcadorPagina=" + marcadorPagina +
                '}';
    }
}



