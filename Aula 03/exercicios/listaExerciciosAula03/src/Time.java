public class Time {
    private String nome;
    private String tecnico;
    private int numeroDeJogadores;

    public Time(String nome, String tecnico, int numeroDeJogadores) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.numeroDeJogadores = numeroDeJogadores;
    }

    public void adicionarJogador(int quantidade) {
        if (quantidade > 0) {
            numeroDeJogadores += quantidade;
            System.out.println(quantidade + " jogador(es) adicionado(s) ao time " + nome + ". Total de jogadores agora é " + numeroDeJogadores + ".");
        } else {
            System.out.println("A quantidade para adicionar jogadores deve ser positiva.");
        }
    }

    public void removerJogador(int quantidade) {
        if (quantidade > 0 && quantidade <= numeroDeJogadores) {
            numeroDeJogadores -= quantidade;
            System.out.println(quantidade + " jogador(es) removido(s) do time " + nome + ". Total de jogadores agora é " + numeroDeJogadores + ".");
        } else if (quantidade > numeroDeJogadores) {
            System.out.println("Não é possível remover mais jogadores do que o total disponível.");
        } else {
            System.out.println("A quantidade para remover jogadores deve ser positiva.");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public int getNumeroDeJogadores() {
        return numeroDeJogadores;
    }

    public static void main(String[] args) {
        Time meuTime = new Time("Flamengo", "Jorge Jesus", 25);

        System.out.println("Time: " + meuTime.getNome());
        System.out.println("Técnico: " + meuTime.getTecnico());
        System.out.println("Número de Jogadores: " + meuTime.getNumeroDeJogadores());

        meuTime.adicionarJogador(3);
        meuTime.removerJogador(2);
        meuTime.removerJogador(30);
    }
}
