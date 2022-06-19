package com.company;

import java.util.Random;

public class Termostato {
    public static final int Hot=50;

    String nome;
    int temp;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;

    }

    public Termostato(String pnome){
        this.nome=pnome;
    }

    public void ver(){
        System.out.println(this.nome + " Temp:" + temp);
    }

    IOnHotListener lst;
    public void setOnHotListener(IOnHotListener l){
        this.lst=l;
    }

    public void ler(){
        Random r = new Random();
        this.temp = r.nextInt(100);
        if (temp >=Hot){
            lst.OnHotHandler(new OnHotArgs(this));
        }
        ver();
    }
}
