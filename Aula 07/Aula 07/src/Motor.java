enum TipoCombustivel {
    GASOLINA,
    DIESEL,
    ELETRICO
}

public class Motor {
    private Integer cilindradas;
    private String modelo;
    private TipoCombustivel tipoCombustivel;
    private Integer rpm;
    private Integer potencia;

    public Motor(Integer cilindradas, String modelo, TipoCombustivel tipoCombustivel, Integer rpm, Integer potencia) {
        this.cilindradas = cilindradas;
        this.modelo = modelo;
        this.tipoCombustivel = tipoCombustivel;
        this.rpm = rpm;
        this.potencia = potencia;
    }

public void ligar(){
    System.out.println("Motor Ligado...!");
}

public void desligar(){
    System.out.println("Motor Desligado...!");
}

public void aumentarPotencia(int incremento){
        potencia+= incremento;
    System.out.println("Potência aumentada em " + incremento + " unidades...!");
}

public void reduzirPotencia(int decremento){
        potencia -= decremento;
    System.out.println("Poteência reduzida em " + decremento + " unidades...!");
}

public void acelerar(int incrementoRpm){
        rpm += incrementoRpm;
    System.out.println(("RPM aumentada em " + incrementoRpm + " unidades...!"));
}

public void reduzir(int decrementoRpm){
        rpm -= decrementoRpm;
    System.out.println("RPM reduzida em " + decrementoRpm + " unidades...!");
}



    public Integer getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public Integer getRpm() {
        return rpm;
    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "cilindradas=" + cilindradas +
                ", modelo='" + modelo + '\'' +
                ", tipoCombustivel=" + tipoCombustivel +
                ", rpm=" + rpm +
                ", potencia=" + potencia +
                '}';
    }
}




