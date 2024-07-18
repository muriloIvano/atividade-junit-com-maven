package one.digitalinnovation;

import org.junit.jupiter.api.*;

public class ConsultarDadosDePessoaTeste {
    @BeforeAll
    static void configurarConexao(){
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void insereDadosParaTeste(){
        BancoDeDados.inserirDados(new Pessoa("Joaquim", 19));
    }

    @AfterEach
    void removeDadosDoTeste(){
        BancoDeDados.removeDados(new Pessoa("Joaquim", 19));
    }
    @Test
    void validarBaseDeDados(){
        Assertions.assertTrue(true);
        System.out.println("Realizando Teste");
    }

    @Test
    void validarBaseDeDados02(){
        Assertions.assertTrue(true);
        System.out.println("Realizando Segundo Teste");
    }

    @AfterAll
    static void finalizarConexao(){
        BancoDeDados.finalizarConexao();
    }
}

