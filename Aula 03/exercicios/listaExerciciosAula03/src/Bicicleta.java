public class Bicicleta {
    private String marca;
    private String modelo;
    private double tamanhoRoda; // em polegadas

    public Bicicleta(String marca, String modelo, double tamanhoRoda) {
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoRoda = tamanhoRoda;
    }

    public void pedalar() {
        System.out.println("Você está pedalando a bicicleta " + modelo + " da marca " + marca + ".");
    }

    public void frear() {
        System.out.println("Você freou a bicicleta " + modelo + " da marca " + marca + ".");
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getTamanhoRoda() {
        return tamanhoRoda;
    }

    public static void main(String[] args) {
        Bicicleta minhaBicicleta = new Bicicleta("Caloi", "Elite", 29);

        System.out.println("Marca: " + minhaBicicleta.getMarca());
        System.out.println("Modelo: " + minhaBicicleta.getModelo());
        System.out.println("Tamanho da roda: " + minhaBicicleta.getTamanhoRoda() + " polegadas");

        minhaBicicleta.pedalar();
        minhaBicicleta.frear();
    }
}

