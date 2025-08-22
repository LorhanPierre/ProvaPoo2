package com.wegEquip.model;

public class Medicao extends Sensor{

    protected double valor;
    protected String dataHora;
    String Alerta;

    public Medicao(){

        super();
        this.valor = 0;
        this.dataHora = "";
        this.Alerta = "";

    }

    public Medicao(double valor,String dataHora,String alerta,int codigo, String nomeEquipamento,String tipo){

        super(codigo, nomeEquipamento,tipo);
        this.valor = valor;
        this.dataHora = dataHora;
        this.Alerta = alerta;

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

    public String getAlerta() {
        return Alerta;
    }

    public void setAlerta(String alerta) {
        Alerta = alerta;
    }

    public void setDataHora(String dataHora) {

        this.dataHora = dataHora;
    }

    @Override
    public String toString(){

        return " - codigo" + codigo + " | valor Medição:"+valor+" | dataHora: " + dataHora + " | !Alerta! " + Alerta;
    }
}
