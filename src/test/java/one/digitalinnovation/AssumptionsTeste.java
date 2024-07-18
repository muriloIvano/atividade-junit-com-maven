package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionsTeste {
    Pessoa pessoa1 = new Pessoa("Murilo", 18);
    @Test
    void validarNomeDeUsuarioMurilo(){
        Assumptions.assumeTrue("murilo".equalsIgnoreCase(pessoa1.getNome()));
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    void validarNomeDeUsuarioDoComputador(){
        Assumptions.assumeFalse("murilo".equals(System.getenv("USER")));
        Assertions.assertEquals(10, 5+5);
    }
}
