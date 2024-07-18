package one.digitalinnovation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public class CondicionaisTeste {
    Pessoa pessoa1 = new Pessoa("Murilo", 18);
    @Test
    @DisabledIfEnvironmentVariable(named = "USER", matches = "murilo")
    void validarNomeDeUsuarioDoComputador01(){
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @EnabledIfEnvironmentVariable(named = "USER", matches = "murilo")
    void validarNomeDeUsuarioComputado02(){
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void validarNomeDeUsuarioComputador03(){
        Assertions.assertEquals(10, 5+5);
    }

    @Test
    void validarNomeDeUsuarioMurilo(){
        Assumptions.assumeTrue("murilo".equalsIgnoreCase(pessoa1.getNome()));
        Assertions.assertEquals(10, 5+5);
    }
}
