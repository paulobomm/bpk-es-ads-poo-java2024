public class Main {
    public static void main(String[] args) {

        // Criando o motor com o construtor que recebe os parâmetros
        Motor motor = new Motor(2000, "V8", TipoCombustivel.GASOLINA, 0, 300);

        // Criando um carro e associando o motor
        Carro carro = new Carro("Mustang", motor);

        // Testando os métodos
        carro.ligarCarro();
        carro.acionarAcelerador(3000);
        carro.trocarMarcha();
        carro.turboBoost();
        carro.acionarFreio(1500);
        carro.desligarCarro();
    }
}
