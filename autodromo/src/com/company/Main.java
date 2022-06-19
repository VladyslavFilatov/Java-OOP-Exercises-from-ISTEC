package com.company;

import java.util.Random;

public class Main implements IOnExcesso_Listener{

    public static void main(String[] args) {

      Carro ford = new Carro("Ford","Ford Fiesta");
      Carro fiat=new Carro("Fiat","Fiat 600");
      Main main = new Main();
      ford.setOnExcesso_Listener(main);
      fiat.setOnExcesso_Listener(main);
      ford.mostrador();
      fiat.mostrador();
      Viatura.speaker();
      Random r = new Random();
      for(int v=0; v<10;v++){
          // ford.vira("Direita");
          ford.acelera(r.nextInt(200)-50);
          fiat.acelera(r.nextInt(200)-50);
      }

      ford.mostrador();
      fiat.mostrador();

       Carro vencedor = (ford.get_distancia() >= fiat.get_distancia())?ford:fiat;
       System.out.println("------------- (Vencedor)------------------");
       vencedor.mostrador();
       vencedor.trava();
       vencedor.VerCondutor("Ze Neves");
       ICarro.verCombustivel();
    }

    @Override
    public void OnExcesso_Handler(OnExcessoArgs args) {
        Carro este = (Carro)args.getSource();
        este.mostrador();
        System.out.println("Excesso de velocidade");
        este.set_distancia(0);
    }
}

/*System.out.println(ford.get_modelo());
        System.out.println(ford.get_marca());
        ford.set_velocidade(200);
        System.out.println(ford.get_velocidade());*/