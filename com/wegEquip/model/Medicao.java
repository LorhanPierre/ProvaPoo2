package com.wegEquip.model;

public class Medicao{

    protected double valor;
    protected String dataHora;

    public Medicao(){

        this.valor = 0;
        this.dataHora = "";

    }

    public Medicao(double valor,String dataHora){

        this.valor = valor;
        this.dataHora = dataHora;

    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    @Override
    public String toString(){
        return "";
    }
}
