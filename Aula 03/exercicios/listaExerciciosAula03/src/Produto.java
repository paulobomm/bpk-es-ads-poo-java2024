public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void aumentarEstoque(int quantidade) {
        if (quantidade > 0) {
            quantidadeEstoque += quantidade;
            System.out.println("Estoque de " + nome + " aumentado em " + quantidade + " unidades. Estoque atual: " + quantidadeEstoque);
        } else {
            System.out.println("Quantidade para aumentar o estoque deve ser positiva.");
        }
    }

    public void diminuirEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            System.out.println("Estoque de " + nome + " diminuído em " + quantidade + " unidades. Estoque atual: " + quantidadeEstoque);
        } else if (quantidade > quantidadeEstoque) {
            System.out.println("Quantidade para diminuir o estoque é maior do que o estoque disponível.");
        } else {
            System.out.println("Quantidade para diminuir o estoque deve ser positiva.");
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Camiseta", 29.99, 50);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: R$" + produto.getPreco());
        System.out.println("Estoque inicial: " + produto.getQuantidadeEstoque());

        produto.aumentarEstoque(10);
        produto.diminuirEstoque(5);
        produto.diminuirEstoque(100); // Tentativa de diminuir mais do que o estoque disponível
    }
}
