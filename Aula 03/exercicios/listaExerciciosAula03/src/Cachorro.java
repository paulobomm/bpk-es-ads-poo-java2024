public class Cachorro {
    private String nome;
    private String raca;
    private int idade;

    public Cachorro(String nome, String raca, int idade) {
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    public void latir() {
        System.out.println(nome + " está latindo: Au Au!");
    }

    public void correr() {
        System.out.println(nome + " está correndo!");
    }

    public String getNome() {
        return nome;
    }

    public String getRaca() {
        return raca;
    }

    public int getIdade() {
        return idade;
    }

    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Rex", "Labrador", 3);

        System.out.println("Cachorro: " + meuCachorro.getNome() + ", Raça: " + meuCachorro.getRaca() + ", Idade: " + meuCachorro.getIdade() + " anos.");
        meuCachorro.latir();
        meuCachorro.correr();
    }
}


