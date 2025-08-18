package com.wegEquip.service;
import com.wegEquip.view.InterfaceUsuarioOutputs;
import com.wegEquip.view.InterfaceUsuarioInputs;
import com.wegEquip.service.Database;

public class SensorService {

    InterfaceUsuarioOutputs mensagem = new InterfaceUsuarioOutputs();
    InterfaceUsuarioInputs menu = new InterfaceUsuarioInputs();
    Database armazenamento = new Database();

    public int gerenciamentoSensores(int finalizar){

        switch (menu.TelaInicial()){
            case 1 -> {
                mensagem.AreaDeCadastro();
                switch (menu.TipoDeSensor()){
                    case 1 -> {
                        mensagem.CadastroTemperatura();
                        armazenamento.CadastroSensorTemperatura();
                    }
                    case 2 -> {
                        mensagem.CadastroVibracao();
                        armazenamento.CadastroSensorVibracao();
                    }
                }
            }
            case 2 -> {}
            case 3 -> {}
            case 4 -> {}
            case 5 -> {}
            case 0 -> {
                mensagem.SairSistema();
                finalizar = 0;
            }
        }
        return finalizar;
    }
}
