package br.com.infnet;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(App.class);
    public static void main( String[] args ) {
        LOGGER.debug("Estou iniciando o metodo main");
        if(true){
            LOGGER.debug("Entrei no if qq");
        }
        try{
            throw new RuntimeException("Usuario Invalido = " + "lgloria");
        }catch (RuntimeException ex){
            LOGGER.error(ex.getMessage());
        }
        LOGGER.debug("Estou finalizando  o metodo main");
    }
}
