package br.com.infnet.util;

import java.util.Random;

public class DadoUtil {
    private int rollDice(int bound){
        return new Random().nextInt(bound) + 1;
    }
    public int rollD10(){
        return rollDice(10);
    }

    public int rollD6() {
        return rollDice(6);
    }
}
