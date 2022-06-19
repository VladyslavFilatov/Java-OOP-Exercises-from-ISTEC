package com.company;

import java.util.Random;

public interface ICarro {
    static final int VELMIN=50;
    void trava();
    default void VerCondutor(String condutor){
        System.out.println("Sou conduzido pelo " + condutor);
    }
    static void verCombustivel(){
        Random r = new Random();
        System.out.println(r.nextInt(10));
    }
}
