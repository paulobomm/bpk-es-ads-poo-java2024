public class ContaBancaria {
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        } else {
            System.out.println("O valor de depósito deve ser positivo.");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            System.out.println("O valor de saque deve ser positivo.");
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria("12345-6", 1000.00);

        System.out.println("Número da Conta: " + minhaConta.getNumeroConta());
        System.out.println("Saldo Inicial: R$" + minhaConta.getSaldo());

        minhaConta.depositar(500.00);
        System.out.println("Saldo após depósito: R$" + minhaConta.getSaldo());

        minhaConta.sacar(200.00);
        System.out.println("Saldo após saque: R$" + minhaConta.getSaldo());

        minhaConta.sacar(1500.00);
        System.out.println("Saldo após tentativa de saque: R$" + minhaConta.getSaldo());
    }
}
