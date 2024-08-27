public class LivroDigital {
    private String titulo;
    private String autor;
    private double tamanhoArquivo; // em MB

    public LivroDigital(String titulo, String autor, double tamanhoArquivo) {
        this.titulo = titulo;
        this.autor = autor;
        this.tamanhoArquivo = tamanhoArquivo;
    }

    public void abrir() {
        System.out.println("O livro digital '" + titulo + "' de " + autor + " está agora aberto.");
    }

    public void fechar() {
        System.out.println("O livro digital '" + titulo + "' foi fechado.");
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getTamanhoArquivo() {
        return tamanhoArquivo;
    }

    public static void main(String[] args) {
        LivroDigital meuLivro = new LivroDigital("O Senhor dos Anéis", "J.R.R. Tolkien", 5.3);

        System.out.println("Título: " + meuLivro.getTitulo());
        System.out.println("Autor: " + meuLivro.getAutor());
        System.out.println("Tamanho do arquivo: " + meuLivro.getTamanhoArquivo() + " MB");

        meuLivro.abrir();
        meuLivro.fechar();
    }
}
