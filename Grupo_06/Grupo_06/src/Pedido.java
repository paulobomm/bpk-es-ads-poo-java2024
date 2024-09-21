public class Pedido {
    private int numeroPedido;
    private int quantidade;
    private double valorFinal;

    private Produto produto;
    private Cliente cliente;

    public Pedido(int numeroPedido, int quantidade, double valorFinal, Produto produto, Cliente cliente) {
        this.numeroPedido = numeroPedido;
        this.quantidade = quantidade;
        this.valorFinal = valorFinal;
        this.produto = produto;
        this.cliente = cliente;
    }

    public void alterarPedido(int novaQuantidade) {
        this.quantidade = novaQuantidade;
        this.valorFinal = novaQuantidade * produto.getValorUnit();
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorFinal() {
        return valorFinal;
    }
}
