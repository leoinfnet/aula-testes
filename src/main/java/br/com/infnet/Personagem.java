package br.com.infnet;

import br.com.infnet.exception.IniciativaInvalidaException;

import java.util.Random;

public class Personagem {
    public int getIniciativa() {
        return iniciativa;
    }

    public void setIniciativa(int iniciativa) {
        if(iniciativa < 0){
            throw new IniciativaInvalidaException("Iniciativa Menor que Zero");
        }
        this.iniciativa = iniciativa;
    }

    private int iniciativa;

    public int getIniciativaRandom(){
        return new Random().nextInt(50);
    }

}
