package br.com.infnet;

import br.com.infnet.util.PersonagemUtil;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonagemUtilTests {
    @Test
    @DisplayName("Não pode retornar valor null")
    public void testaNull(){
        PersonagemUtil personagemUtil = new PersonagemUtil();
        Personagem personagem = personagemUtil.getPersonagem();
        assertNotNull(personagem);
        PersonagemUtil personagemUtil1 = new PersonagemUtil();

    }
}
