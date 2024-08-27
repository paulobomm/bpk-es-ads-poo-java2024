public class Cidade {
    private String nome;
    private int populacao;
    private String estado;

    public Cidade(String nome, int populacao, String estado) {
        this.nome = nome;
        this.populacao = populacao;
        this.estado = estado;
    }

    public void aumentarPopulacao(int quantidade) {
        if (quantidade > 0) {
            populacao += quantidade;
            System.out.println("A população de " + nome + " aumentou em " + quantidade + " pessoas. População atual: " + populacao);
        } else {
            System.out.println("A quantidade para aumentar a população deve ser positiva.");
        }
    }

    public void diminuirPopulacao(int quantidade) {
        if (quantidade > 0 && quantidade <= populacao) {
            populacao -= quantidade;
            System.out.println("A população de " + nome + " diminuiu em " + quantidade + " pessoas. População atual: " + populacao);
        } else if (quantidade > populacao) {
            System.out.println("A quantidade para diminuir a população é maior do que a população atual.");
        } else {
            System.out.println("A quantidade para diminuir a população deve ser positiva.");
        }
    }

    public String getNome() {
        return nome;
    }

    public int getPopulacao() {
        return populacao;
    }

    public String getEstado() {
        return estado;
    }

    public static void main(String[] args) {
        Cidade cidade = new Cidade("São Paulo", 12000000, "SP");

        System.out.println("Cidade: " + cidade.getNome());
        System.out.println("População: " + cidade.getPopulacao());
        System.out.println("Estado: " + cidade.getEstado());

        cidade.aumentarPopulacao(5000);
        cidade.diminuirPopulacao(3000);
        cidade.diminuirPopulacao(13000000);
    }
}
