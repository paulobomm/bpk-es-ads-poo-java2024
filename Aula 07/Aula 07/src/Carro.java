public class Carro {
    private String modelo;
    private Motor motor;

    public void acionarAcelerador (int incrementoRpm){
        motor.acelerar(incrementoRpm);
        System.out.println("Acelerador acionado...!");
    }

    public void acionarFreio(int decrementoRpm){
        motor.reduzir(decrementoRpm);
        System.out.println("Freio acionado...!");
    }

    public void trocarMarcha() {
        System.out.println("Marcha trocada...!");
    }

    public void ligarCarro(){
        motor.ligar();
        System.out.println("Carro ligado...!");
    }

    public void desligarCarro(){
        motor.desligar();
        System.out.println("Carro desligado...!");
    }

    public void turboBoost() {
        motor.aumentarPotencia(50);
        System.out.println("Turbo Boost ativado...!");
    }

    public void reduzirPotenciaMotor(){
        motor.reduzirPotencia(50);
        System.out.println("Potencia do motor reduzida...!");
    }

    public Carro(String modelo, Motor motor) {
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", motor=" + motor +
                '}';
    }
}
