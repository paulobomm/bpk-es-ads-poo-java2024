public class Filme {
    private String titulo;
    private String diretor;
    private int duracao; // duração em minutos

    public Filme(String titulo, String diretor, int duracao) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public void iniciar() {
        System.out.println("O filme '" + titulo + "' dirigido por " + diretor + " está começando. Aproveite os próximos " + duracao + " minutos!");
    }

    public void parar() {
        System.out.println("O filme '" + titulo + "' foi pausado.");
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public static void main(String[] args) {
        Filme meuFilme = new Filme("Inception", "Christopher Nolan", 148);

        System.out.println("Filme: " + meuFilme.getTitulo());
        System.out.println("Diretor: " + meuFilme.getDiretor());
        System.out.println("Duração: " + meuFilme.getDuracao() + " minutos");

        meuFilme.iniciar();
        meuFilme.parar();
    }
}

