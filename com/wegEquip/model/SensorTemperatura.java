package com.wegEquip.model;

public class SensorTemperatura extends Sensor{

    public SensorTemperatura(String codigo,String nomeEquipamento, String tipo){

        super(codigo, nomeEquipamento, tipo);

    }

    @Override
    public String toString(){
        return " - Codigo: " + codigo + " | Nome do Equipamento: " + nomeEquipamento + " | Tipo de Sensor: " + tipo;
    }
}
