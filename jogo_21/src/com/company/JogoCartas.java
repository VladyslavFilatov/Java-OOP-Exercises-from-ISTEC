package com.company;

import java.util.Random;

public class JogoCartas extends Jogo{
    public int[]Cartas;
    {
        Cartas = new int[]{1,3};
    }

    public JogoCartas(String jogador, int montante) {
        super(jogador, montante);
    }

    @Override
    public void ver() {
        super.ver();
        System.out.println("Carta 1: " + Cartas[0] + " Carta 2: " + Cartas[1]);
        System.out.println("---------------------");
    }

    IOnIguais_Listener lst;
    public void setOnIguaisListener(IOnIguais_Listener l){
        this.lst=l;
    }

    @Override
    public void jogar(int aposta) {
        if(this._montante >=aposta){
            this._montante -=aposta;
            Random r = new Random();
            this.Cartas[0]=r.nextInt(6,11)+1;
            this.Cartas[1]= r.nextInt(6,11)+1;
            if (Cartas[0]+Cartas[1]==JOGOCONSTANTA.GANHAR.ganhar)lst.OnIguais_handler(new OnIguaisArgs(this,aposta));
            this.ver();
        }else System.out.println("Falencia");
    }
}
