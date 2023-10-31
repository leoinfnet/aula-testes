package br.com.infnet;

import br.com.infnet.util.DadoUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class DadoUtilTests {
    @Test
    @DisplayName("Dado D10 - Deve retornar valores menores que 10")
    public void teste1(){
        DadoUtil dadoUtil = new DadoUtil();
        for(int i = 0; i<1000;i++){
            int valorDoDado = dadoUtil.rollD10();
            assertTrue(valorDoDado <= 10);
        }

    }
    @Test
    @DisplayName("Dado D6 - Deve retornar valores menores que 6")
    public void teste2(){
        DadoUtil dadoUtil = new DadoUtil();
        for(int i = 0; i<1000;i++){
            int valorDoDado = dadoUtil.rollD6();
            assertTrue(valorDoDado <= 6);
        }
    }
}
