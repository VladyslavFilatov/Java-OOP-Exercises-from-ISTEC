package com.company;

public abstract class Jogo implements Ijogo{

    private String _jogador;// creation variable
    protected int _montante;// creation variable
    public Jogo(String jogador, int montente){
        this._montante=montente;
        this._jogador=jogador;

    }// we can write class Jogo = new class and we will get -> (jogador "Vlad", montante 1000)

    public void ver(){
        System.out.println("--------------------------------------");
        System.out.println("Jogador:" + this._jogador);
        System.out.println("Montante:" + this._montante);
    }//the result of the program that we see in the intreface window
    @Override
    public void setMontante(int montante) {
       if (montante >=0) this._montante=montante;
    }//set of Montante with rule -> montante >=0

    @Override
    public int getMontante() {
        return this._montante;
    }

    @Override
    public abstract void jogar(int aposta);//metod abstart -> make all class abstract


    @Override
    public String getJogador() {
        return _jogador;
    }
}// alt + enter implement of interface for make override the rules from interface
