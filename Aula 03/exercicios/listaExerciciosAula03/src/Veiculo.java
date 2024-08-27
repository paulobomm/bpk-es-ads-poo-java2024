public class Veiculo {
    private String tipo;
    private String placa;
    private String cor;

    public Veiculo(String tipo, String placa, String cor) {
        this.tipo = tipo;
        this.placa = placa;
        this.cor = cor;
    }

    public void abastecer() {
        System.out.println("O veículo de placa " + placa + " está sendo abastecido.");
    }

    public void lavar() {
        System.out.println("O veículo de placa " + placa + " está sendo lavado.");
    }

    public String getTipo() {
        return tipo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public static void main(String[] args) {
        Veiculo meuVeiculo = new Veiculo("Carro", "ABC-1234", "Azul");

        System.out.println("Veículo: Tipo: " + meuVeiculo.getTipo() + ", Placa: " + meuVeiculo.getPlaca() + ", Cor: " + meuVeiculo.getCor());
        meuVeiculo.abastecer();
        meuVeiculo.lavar();
    }
}

