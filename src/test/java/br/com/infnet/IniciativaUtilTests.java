package br.com.infnet;

import br.com.infnet.exception.IniciativaInvalidaException;
import br.com.infnet.util.IniciativaUtil;
import org.junit.jupiter.api.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.*;

public class IniciativaUtilTests {
    private static final Logger LOGGER =
            LoggerFactory.getLogger(IniciativaUtilTests.class);
    @BeforeAll
    public static void criarArquivoTexto(){
        LOGGER.info("Rodando no inicio de Todos");
    }
    @BeforeEach
    public void inicializarTeste(){
        LOGGER.info("Criando arquivo texto");
    }
    @Test
    @DisplayName("Personagem 1 deve ganhar a inicitiva")
    public void teste1(){
        LOGGER.info("Rodando teste 1");
        Personagem personagem1 = new Personagem();
        Personagem personagem2 = new Personagem();
        personagem2.setIniciativa(30);
        personagem1.setIniciativa(40);
        IniciativaUtil iniciativaUtil = new IniciativaUtil();
        int resultado = iniciativaUtil.calularIniciativa(personagem1, personagem2);
        assertEquals(-1,resultado);
    }
    @Test
    @DisplayName("Personagem 2 deve ganhar")
    public void teste2(){
        Personagem personagem1 = new Personagem();
        Personagem personagem2 = new Personagem();
        personagem2.setIniciativa(40);
        personagem1.setIniciativa(30);
        IniciativaUtil iniciativaUtil = new IniciativaUtil();
        int resultado = iniciativaUtil.calularIniciativa(personagem1, personagem2);
        assertEquals(1 ,resultado);
    }
    @Test
    @DisplayName("Deve dar Empate - 0")
    public void teste3(){
        Personagem personagem1 = new Personagem();
        Personagem personagem2 = new Personagem();
        personagem2.setIniciativa(40);
        personagem1.setIniciativa(40);
        IniciativaUtil iniciativaUtil = new IniciativaUtil();
        int resultado = iniciativaUtil.calularIniciativa(personagem1, personagem2);
        assertEquals(0 ,resultado);
    }
    @Test
    @DisplayName("Deve retornar exception para iniciativa menor que zero")
    public void teste4(){
        Personagem personagem1 = new Personagem();
        assertThrows(IniciativaInvalidaException.class, () ->{
            personagem1.setIniciativa(-40);
        });
        IniciativaUtil iniciativaUtil = new IniciativaUtil();

        //assertEquals(0 ,resultado);
    }
    @Test
    @DisplayName("Deve testar os valores de uma lista")
    public void teste5(){
        int[] numbers = {0, 1, 2, 3, 4};
        assertAll("numbers",
                () -> assertEquals(numbers[0], 0),
                () -> assertEquals(numbers[3], 3),
                () -> assertEquals(numbers[4], 4)
        );
    }
    @Test
    @Disabled("Não sei todas as regras de aposentadoria")
    public void calcularFatorAposentadoria(){
        assertEquals(1,1);
    }
    @AfterEach
    public void deletarRecursos(){
        LOGGER.info("Deletando arquivo texto");
    }
    @AfterAll
    public static void deletarArquivoTexto(){
        LOGGER.info("Rodando no final de Todos");
    }

}
