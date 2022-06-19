package com.company;

public class Main implements IOnIguais_Listener{

    public static void main(String[] args) {
	    JogoDados zebotota = new JogoDados("Ze da Batota", 1000);
        Main main = new Main();
        zebotota.setOnIguaisListener(main);
        JogoDados maria = new JogoDados("Maria das Dividas", 2000);
        maria.setOnIguaisListener(main);
        Ijogo.publicidade("Royal");
        zebotota.cumprimente();
        for(int i=0; i<10; i++) {
            zebotota.jogar(100);
            maria.jogar(200);
        }
    }

    @Override
    public void OnIguais_handler(OnIguaisArgs args) {
        JogoDados sender = (JogoDados) args.getSource();
        int premio = sender.Dados[0]*2 * args.Aposta;
        sender.setMontante(sender.getMontante() + premio);
        System.out.println("Parabens " + sender.getJogador() + " Ganou " + premio
        + " em:" + args.Quando.toString());
    }
}
