package com.company;

import java.util.Random;

public class JogoDados extends Jogo{
    public int[]Dados;//array
    {
        Dados = new int[]{1, 3};
    }//creation an array
    public JogoDados(String jogador, int montente) {
        super(jogador, montente);
    }//alt + enter implement JogoDados for forget method abstract

    @Override
    public void ver() {
        super.ver();
        System.out.println("Dados[0]:" + Dados[0] + " Dados[1]:" + Dados[1]);
        System.out.println("------------------------");
    }//alt + enter override ver

    IOnIguais_Listener lst;//creation interface with event
    public void setOnIguaisListener(IOnIguais_Listener l){
        this.lst=l;//qual e resposta
    }

    @Override
    public void jogar(int aposta) {
        if(this._montante >=aposta){
            this._montante -=aposta; // = this._montante =this._montante - aposta; exemple montante 500 - aposta 100 = montante 400
            Random r = new Random();
            this.Dados[0]=r.nextInt(6)+1;
            this.Dados[1]=r.nextInt(6)+1;
            if (Dados[0]==Dados[1])lst.OnIguais_handler(new OnIguaisArgs(this,aposta));//отправляем на клиент ссылку на правило
            this.ver();
        }else System.out.println("Falencia");
    }//alt + enter override jogar
}//alt + enter override ver and implement JogoDados for forget method abstract
