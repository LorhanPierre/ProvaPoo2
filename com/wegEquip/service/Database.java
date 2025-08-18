package com.wegEquip.service;
import com.wegEquip.model.Medicao;
import com.wegEquip.model.SensorTemperatura;
import com.wegEquip.model.SensorVibracao;
import com.wegEquip.view.InterfaceUsuarioInputs;
import com.wegEquip.model.Sensor;
import java.util.ArrayList;

public class Database {

    protected static ArrayList<Medicao>Medicoes;
    protected static ArrayList<Sensor>sensores;

    public Database(){
        this.Medicoes = new ArrayList<>();
        this.sensores = new ArrayList<>();
    }

    InterfaceUsuarioInputs informacoes = new InterfaceUsuarioInputs();

    public void CadastroSensorTemperatura(){
        int codigo = informacoes.CodigoSensor();
        String nome = informacoes.NomeSensor();
        String tipo = informacoes.TipoSensor();

        Sensor novoSensor = new SensorTemperatura(codigo,nome,tipo);

        sensores.add(novoSensor);
    }

    public void CadastroSensorVibracao(){
        int codigo = informacoes.CodigoSensor();
        String nome = informacoes.NomeSensor();
        String tipo = informacoes.TipoSensor();

        Sensor novoSensor = new SensorVibracao(codigo,nome,tipo);

        sensores.add(novoSensor);
    }


}
