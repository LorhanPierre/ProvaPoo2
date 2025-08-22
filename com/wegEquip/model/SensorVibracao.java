package com.wegEquip.model;

public class SensorVibracao extends Sensor{


    public SensorVibracao(int codigo,String nomeEquipamento, String tipo){

        super(codigo, nomeEquipamento, tipo);

    }

    @Override
    public String toString(){
        return " - Codigo: " + codigo + " | Nome do Equipamento: " + nomeEquipamento + " | Tipo de Sensor: " + tipo;
    }
}
