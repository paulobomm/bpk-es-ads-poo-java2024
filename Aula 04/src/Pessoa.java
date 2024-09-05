import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Locale;

public class Pessoa {
    /**
     * Atributos
     */


    private String nome;
    private  Integer idade;
    private LocalDateTime dataNascimento;
    /**
     * construtores
     */
    public Pessoa(String nome, Integer idade, LocalDateTime dataNascimento) {
        this.nome = nome;
        this.idade = idade;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public LocalDateTime getDataNascimento() {
        return dataNascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}


