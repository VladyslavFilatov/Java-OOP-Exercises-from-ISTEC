package com.company;

public interface Ijogo {

    void setMontante(int montante);
    int getMontante();
    void jogar(int aposta);
    String getJogador();
    static void publicidade(String nome){
        System.out.println("BemVindo ao Lisbon Jogos " + nome);
    }

    default void cumprimente(){
        System.out.println("Boa Noite");
    }

}
