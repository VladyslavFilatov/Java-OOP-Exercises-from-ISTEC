package com.company;

public class Main implements IOnHotListener{

    public static void main(String[] args) {
        Main m = new Main();
	    Termostato t1 = new Termostato("Alfa");
        Termostato t2 = new Termostato("Bravo");
        t1.setOnHotListener(m);
        t2.setOnHotListener(m);
        t1.ler();
        t2.ler();
    }

    @Override
    public void OnHotHandler(OnHotArgs args) {
        System.out.println("Esta Quente");
        Termostato este = (Termostato)args.getSource();
        System.out.println("Modelo: " + este.getNome() );
        System.out.println("temp: " + este.getTemp() );
    }
}
