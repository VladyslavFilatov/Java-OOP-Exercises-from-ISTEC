package com.company;

public class Main implements IOnIguais_Listener {

    public static void main(String[] args) {
        JogoCartas vlad = new JogoCartas("Vlad", 1000);
        Main main = new Main();
        vlad.setOnIguaisListener(main);
        JogoCartas olga = new JogoCartas("Olga", 2000);
        olga.setOnIguaisListener(main);
        Ijogo.publicidade("BlackJack");
        vlad.cumprimente();
        for (int i=0; i<10; i++){
            vlad.jogar(100);
            olga.jogar(200);
        }
    }

    @Override
    public void OnIguais_handler(OnIguaisArgs args) {
        JogoCartas sender = (JogoCartas) args.getSource();
        int premio = sender.Cartas[0]*2 * args.Aposta;
        sender.setMontante(sender.getMontante() + premio);
        System.out.println("Parabens!!! BlackJack:" + JOGOCONSTANTA.GANHAR.getGanhar() + "!!! " + sender.getJogador() + " Ganou " + premio
                + " em:" + args.Quando.toString());
    }
}
