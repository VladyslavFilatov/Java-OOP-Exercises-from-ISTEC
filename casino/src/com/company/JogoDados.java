package com.company;

import java.util.Random;

public class JogoDados extends Jogo{
    public int[]Dados;
    {
        Dados = new int[]{1, 3};
    }
    public JogoDados(String jogador, int montante) {
        super(jogador, montante);
    }

    @Override
    public void ver() {
        super.ver();
        System.out.println("Dados[0]:" + Dados[0] + " Dados[1]:" + Dados[1]);
        System.out.println("------------------------");
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
            this.Dados[0]=r.nextInt(6)+1;
            this.Dados[1]= r.nextInt(6)+1;
            if (Dados[0]==Dados[1])lst.OnIguais_handler(new OnIguaisArgs(this,aposta));
            this.ver();
        }else System.out.println("Falencia");
    }
}
