public class Produto {
    private int produtoID;
    private String descricao;
    private double valorUnit;

    public Produto(int produtoID, String descricao, double valorUnit) {
        this.produtoID = produtoID;
        this.descricao = descricao;
        this.valorUnit = valorUnit;
    }

    public void alterarProduto(String novaDescricao, double novoValorUnit) {
        this.descricao = novaDescricao;
        this.valorUnit = novoValorUnit;
    }

    public int getProdutoID() {
        return produtoID;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValorUnit() {
        return valorUnit;
    }
}

