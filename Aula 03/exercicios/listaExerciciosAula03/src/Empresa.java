public class Empresa {
    private String nome;
    private String CNPJ;
    private int numeroFuncionarios;

    public Empresa(String nome, String CNPJ, int numeroFuncionarios) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public void contratar(int quantidade) {
        if (quantidade > 0) {
            numeroFuncionarios += quantidade;
            System.out.println(quantidade + " funcionários foram contratados. Total de funcionários agora: " + numeroFuncionarios);
        } else {
            System.out.println("A quantidade de funcionários a ser contratada deve ser maior que zero.");
        }
    }

    public void demitir(int quantidade) {
        if (quantidade > 0 && quantidade <= numeroFuncionarios) {
            numeroFuncionarios -= quantidade;
            System.out.println(quantidade + " funcionários foram demitidos. Total de funcionários agora: " + numeroFuncionarios);
        } else if (quantidade > numeroFuncionarios) {
            System.out.println("Não é possível demitir mais funcionários do que o número existente.");
        } else {
            System.out.println("A quantidade de funcionários a ser demitida deve ser maior que zero.");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public int getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public static void main(String[] args) {

        Empresa minhaEmpresa = new Empresa("Tech Solutions", "12.345.678/0001-99", 50);

        System.out.println("Nome da Empresa: " + minhaEmpresa.getNome());
        System.out.println("CNPJ: " + minhaEmpresa.getCNPJ());
        System.out.println("Número de Funcionários: " + minhaEmpresa.getNumeroFuncionarios());

        minhaEmpresa.contratar(10);
        minhaEmpresa.demitir(5);
        minhaEmpresa.demitir(60);
    }
}

