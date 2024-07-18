package one.digitalinnovation;

import java.util.logging.Logger;

public class BancoDeDados {
    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName()); //

    public static void iniciarConexao(){
        LOGGER.info("Iniciou conexão!");
    }

    public static void finalizarConexao(){
        LOGGER.info("Finalizou conexão!");
    }

    public static void inserirDados(Pessoa pessoa){
        //Insere Pessoa no DB
        LOGGER.info("Inserindo dados");
    }

    public static void removeDados(Pessoa pessoa){
        //Remove Pessoa no DB
        LOGGER.info("Remove dados");
    }
}
