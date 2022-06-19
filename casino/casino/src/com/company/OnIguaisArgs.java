package com.company;

import java.time.LocalDate;
import java.util.EventObject;

public class OnIguaisArgs extends EventObject {

    public LocalDate Quando;//quando aconteceio os dados iguais
    public int Aposta;//qual era valor da aposta
    public OnIguaisArgs(Object source, int aposta) {
        super(source);
        this.Aposta=aposta;
        Quando =LocalDate.now();
    }
}
