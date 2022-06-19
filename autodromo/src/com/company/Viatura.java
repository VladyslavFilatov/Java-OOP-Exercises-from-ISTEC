package com.company;

public abstract class Viatura {
    //region campos_getters_e_setter

    public abstract void vira(String direcao);

    public static final int MAXVEL=120;
    public static void speaker(){
        System.out.println("Partida!!! Brummm!!");
    }
    private String _modelo;
    public String get_modelo() {
        return _modelo;
    }
    private String _marca;
    public String get_marca() {
        return _marca;
    }

    protected int _velocidade;
    public int get_velocidade() {
        return _velocidade;
    }

    public void set_velocidade(int velocidade) {
        if(velocidade >=0) this._velocidade = velocidade;
    }
    //endregion
    //region construtores
    //oerloading
    public  Viatura(){
        this._modelo="desconhecida";
        this._marca="desconhecida";
    }
    public Viatura(String marca, String modelo){
        this._marca=marca;
        this._modelo=modelo;
        this._velocidade=0;
    }

    //endregion
    public void mostrador(){
        System.out.println("-------(" + this._marca + ")-------");
        System.out.println("Velocidade Maxima: " + Viatura.MAXVEL);
        System.out.println("Modelo: " + this._modelo);
        System.out.println("Velocidade: " + this._velocidade);
    }
    public void acelera(int delta){
        //this.set_velocidade(_velocidade + delta);
        this.set_velocidade(delta);
    }
}
