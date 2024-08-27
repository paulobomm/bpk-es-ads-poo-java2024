public class Computador {
  private String processador;
    private int memoriaRAM; // em GB
    private int armazenamento; // em GB
    private boolean ligado;

    public Computador(String processador, int memoriaRAM, int armazenamento) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
        this.ligado = false;
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O computador está agora ligado.");
        } else {
            System.out.println("O computador já está ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O computador está agora desligado.");
        } else {
            System.out.println("O computador já está desligado.");
        }
    }

    public String getProcessador() {
        return processador;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public int getArmazenamento() {
        return armazenamento;
    }

    public boolean isLigado() {
        return ligado;
    }

    public static void main(String[] args) {
        Computador meuComputador = new Computador("Intel Core i7", 16, 512);

        System.out.println("Computador: " + meuComputador.getProcessador() + ", RAM: " + meuComputador.getMemoriaRAM() + "GB, Armazenamento: " + meuComputador.getArmazenamento() + "GB");
        meuComputador.ligar();
        meuComputador.desligar();
        meuComputador.desligar();
    }
}
