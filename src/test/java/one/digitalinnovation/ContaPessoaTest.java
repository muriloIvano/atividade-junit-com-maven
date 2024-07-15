package one.digitalinnovation;
/*
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;*/


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class ContaPessoaTest {
    @Test
    void calcularSaldo() {
        ContaPessoa contaPessoa = new ContaPessoa("Murilo", 18, 200);
        contaPessoa.depositar(100);
        Assertions.assertEquals(300, contaPessoa.getSaldo());
    }
    @Test
    void verificarAnoDoVeiculo(){
        Veiculo Golzinho = new Veiculo("Gol", LocalDate.of(2000, 1, 1));
        Assertions.assertEquals(24, Golzinho.getAno());
    }
    @Test
    void verificarOverificador(){
        Veiculo Golzinho = new Veiculo("Gol", LocalDate.of(2000, 1, 1));
        Assertions.assertFalse(Golzinho.menorDeVinteAnos());

        Assertions.assertTrue(Golzinho.passouDeVinteAnos());
    }
}
