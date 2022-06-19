package com.company;

public class Main implements IOnIguais_Listener{

    public static void main(String[] args) {
        JogoDados zebatota = new JogoDados("Ze da Batota", 1000);
        Main main = new Main();
        zebatota.setOnIguaisListener(main);
        JogoDados maria = new JogoDados("Marioa das Dividas", 2000);
        maria.setOnIguaisListener(main);
//        zebatota.setOnIguaisListener(new IOnIguais_Listener() {
//            @Override
//            public void OnIguais_handler(OnIguaisArgs args) {
//                JogoDados sender = (JogoDados) args.getSource();
//                int premio = sender.Dados[0]*2 * args.Aposta;
//                sender.setMontante(sender.getMontante() + premio);
//                System.out.println("Parabens " + sender.getJogador() + " Ganhou " + premio
//                        + " em:" + args.Quando.toString());
//            }
//        }); = implements IOnIguais_Listener
        Ijogo.publicidade("Royal");//Static
        zebatota.cumprimente();//default
        for(int i=0; i<10; i++) {
            zebatota.jogar(100);//play - from 0 to 10 games, ставка 100
            maria.jogar(200);
        }

    }

    @Override
    public void OnIguais_handler(OnIguaisArgs args) {
        JogoDados sender = (JogoDados) args.getSource();
                int premio = sender.Dados[0]*2 * args.Aposta;//calcolar o premio
                sender.setMontante(sender.getMontante() + premio);//calcular o sender
                System.out.println("Parabens " + sender.getJogador() + " Ganhou " + premio
                        + " em:" + args.Quando.toString());
    }
}
