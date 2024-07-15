package one.digitalinnovation;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Veiculo {
    private String nome;
    private LocalDate ano;

    public Veiculo(String nome, LocalDate ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return (int) ChronoUnit.YEARS.between(ano, LocalDate.now());
    }

    public void setAno(LocalDate ano) {
        this.ano = ano;
    }

    public boolean passouDeVinteAnos(){
        return getAno() >= 20;
    }
    public boolean menorDeVinteAnos(){
        return getAno() <= 20;
    }
}
