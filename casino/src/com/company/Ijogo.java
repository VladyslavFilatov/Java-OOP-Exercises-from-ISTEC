package com.company;

public interface Ijogo {
    static final int MINAPOSTA=10;

    void setMontante(int montante);
    int getMontante();
    void jogar(int aposta);
    String getJogador();
    static void publicidade(String nome){
        System.out.println("BemVindo ao Casino" + nome);
    }

    default void cumprimente(){
        System.out.println("Boa Noite");
    }

}
