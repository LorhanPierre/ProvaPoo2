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
                armazenamento.CadastroSensor();
            }
            case 2 -> {
                mensagem.AreaDeListagem();
                switch (menu.Listagem()){
                    case 1 -> {
                        armazenamento.ListarSensores();
                    }
                    case 2 -> {
                        armazenamento.ListarSensoresVibracao();
                    }
                    case 3 -> {
                        armazenamento.ListarSensoresTemperatura();
                    }
                    case 4 -> {
                        armazenamento.ListarSensoresCriticos();
                    }
                }
            }
            case 3 -> {
                armazenamento.RegistrarMedicao();
            }
            case 4 -> {
                armazenamento.ListarMedicoes();
            }
            case 5 -> {}
            case 0 -> {
                mensagem.SairSistema();
                finalizar = 0;
            }
        }
        return finalizar;
    }
}
