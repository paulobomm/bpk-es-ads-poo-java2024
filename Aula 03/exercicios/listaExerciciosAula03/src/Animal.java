public class Animal {
    private String especie;
    private int idade;
    private double peso;

    public Animal(String especie, int idade, double peso) {
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public void alimentar(double quantidade) {
        if (quantidade > 0) {
            peso += quantidade;
            System.out.println("O animal da espécie '" + especie + "' foi alimentado com " + quantidade + " kg de comida. Novo peso: " + peso + " kg.");
        } else {
            System.out.println("A quantidade de comida deve ser positiva.");
        }
    }

    public void dormir() {
        System.out.println("O animal da espécie '" + especie + "' está dormindo.");
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public static void main(String[] args) {
        Animal meuAnimal = new Animal("Leão", 5, 190.5);

        System.out.println("Espécie: " + meuAnimal.getEspecie());
        System.out.println("Idade: " + meuAnimal.getIdade() + " anos");
        System.out.println("Peso: " + meuAnimal.getPeso() + " kg");

        meuAnimal.alimentar(5.0);
        meuAnimal.dormir();
    }
}
