package one.digitalinnovation;
/*
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;*/


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContaPessoaTest {
    @Test
    void calcularSaldo() {
        ContaPessoa contaPessoa = new ContaPessoa("Murilo", 18, 200);
        contaPessoa.depositar(100);
        Assertions.assertEquals(300, contaPessoa.getSaldo());
    }
}
