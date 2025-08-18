package com.wegEquip.app;
import com.wegEquip.service.SensorService;

public class WegEquip {

    public static void main(String[]args){

        SensorService sistema = new SensorService();
        while(sistema.gerenciamentoSensores(1) != 0){}

    }
}
