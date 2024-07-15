package one.digitalinnovation;
/*
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;*/


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ContaPessoaTest {
    @Test // -> Anotação primordial para realizar um teste
    void calcularSaldo() {
        ContaPessoa contaPessoa = new ContaPessoa("Murilo", 18, 200);
        contaPessoa.depositar(100);
        Assertions.assertEquals(300, contaPessoa.getSaldo());
    }
    @Test // -> Anotação primordial para realizar um teste
    void verificarAnoDoVeiculo(){
        Veiculo Golzinho = new Veiculo("Gol", LocalDate.of(2000, 1, 1));
        Assertions.assertEquals(24, Golzinho.getAno());
    }
    @Test // -> Anotação primordial para realizar um teste
    void verificarOverificador(){
        Veiculo Golzinho = new Veiculo("Gol", LocalDate.of(2000, 1, 1)); //Cria um cenario
        Assertions.assertFalse(Golzinho.menorDeVinteAnos()); // Executa as validacoes

        Assertions.assertTrue(Golzinho.passouDeVinteAnos()); // Executa as validacoes
    }
}
