public class Professor {
    private String nome;
    private String disciplina;
    private double salario;

    public Professor(String nome, String disciplina, double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public void darAula() {
        System.out.println(nome + " está dando aula de " + disciplina + ".");
    }

    public void corrigirProvas() {
        System.out.println(nome + " está corrigindo provas de " + disciplina + ".");
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public double getSalario() {
        return salario;
    }

    public static void main(String[] args) {
        Professor professor = new Professor("Maria Oliveira", "Matemática", 5000.00);

        System.out.println("Professor: " + professor.getNome());
        System.out.println("Disciplina: " + professor.getDisciplina());
        System.out.println("Salário: R$" + professor.getSalario());
        professor.darAula();
        professor.corrigirProvas();
    }
}
