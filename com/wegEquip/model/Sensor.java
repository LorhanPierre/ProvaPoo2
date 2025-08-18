package com.wegEquip.model;

public class Sensor {

    protected int codigo;
    protected String nomeEquipamento;
    protected String tipo;

    public Sensor(){

        this.codigo = 0;
        this.nomeEquipamento = "";
        this.tipo = "";
    }

    public Sensor(int codigo,String nomeEquipamento, String tipo){

        this.codigo = codigo;
        this.nomeEquipamento = nomeEquipamento;
        this.tipo = tipo;

    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomeEquipamento() {
        return nomeEquipamento;
    }

    public void setNomeEquipamento(String nomeEquipamento) {
        this.nomeEquipamento = nomeEquipamento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString(){
        return "";
    }
}
