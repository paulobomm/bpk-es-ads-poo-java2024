public class Main {
    public static void main(String[] args) {
      EnderecoCliente endereco = new EnderecoCliente("Rua das Flores", 123, "Apto 101", 12345678);
        Cliente cliente = new Cliente("João Silva", 123456789, endereco);
        Produto produto = new Produto(1, "Notebook", 3000.00);
        Pedido pedido = new Pedido(1001, 2, produto.getValorUnit() * 2, produto, cliente);

        System.out.println("Detalhes do Pedido:");
        System.out.println("Número do Pedido: " + pedido.getNumeroPedido());
        System.out.println("Cliente: " + cliente.getNomeCliente());
        System.out.println("Produto: " + produto.getDescricao());
        System.out.println("Quantidade: " + pedido.getQuantidade());
        System.out.println("Valor Final: R$ " + pedido.getValorFinal());

        pedido.alterarPedido(3);
        System.out.println("\nApós alterar a quantidade para 3:");
        System.out.println("Quantidade: " + pedido.getQuantidade());
        System.out.println("Valor Final: R$ " + pedido.getValorFinal());

        EnderecoCliente novoEndereco = new EnderecoCliente("Avenida Central", 456, "Casa 2", 87654321);
        cliente.cadastrarEndereco(novoEndereco);
        System.out.println("\nNovo Endereço Cadastrado:");
        System.out.println("Logradouro: " + cliente.getEndereco().getLogradouro());
        System.out.println("CEP: " + cliente.getEndereco().getCep());
    }
}
