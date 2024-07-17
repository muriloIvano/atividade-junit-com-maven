package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AssertionsTest {
    @Test
    void validarLancamentos(){
        int [] primeiroLancamento = {10, 20, 30, 40, 50};
        int [] segundoLancamento = {10, 20, 30, 40, 50};
        Assertions.assertArrayEquals(segundoLancamento, primeiroLancamento);
    }
    @Test
    void validarDoisNumeros(){
        double valor01 = 5.0;
        double valor02 = 2.5;
        Assertions.assertEquals(valor01, 2*valor02);
    }
}
