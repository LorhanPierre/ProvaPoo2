package com.wegEquip.service;
import com.wegEquip.model.Medicao;
import com.wegEquip.model.SensorTemperatura;
import com.wegEquip.model.SensorVibracao;
import com.wegEquip.view.InterfaceUsuarioInputs;
import com.wegEquip.view.InterfaceUsuarioOutputs;
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
    InterfaceUsuarioOutputs mensagens = new InterfaceUsuarioOutputs();

    public void CadastroSensor(){

        String tipo = informacoes.TipoDeSensor();
        if(tipo.equalsIgnoreCase("Vibração")){
            mensagens.CadastroVibracao();

            int codigo = informacoes.CodigoSensor();
            String nome = informacoes.NomeSensor();

            Sensor novoSensor = new SensorVibracao(codigo,nome,tipo);

            sensores.add(novoSensor);
            mensagens.sucessoCadastroVibracao();
        } else if (tipo.equalsIgnoreCase("Temperatura")) {
            mensagens.CadastroTemperatura();

            int codigo = informacoes.CodigoSensor();
            String nome = informacoes.NomeSensor();

            Sensor novoSensor = new SensorTemperatura(codigo,nome,tipo);

            sensores.add(novoSensor);
            mensagens.sucessoCadastroTemperatura();
        }else if (tipo.equalsIgnoreCase("nenhum")){
        }


    }

    public void ListarSensores(){
        for(Sensor sensores : sensores){
            System.out.println(sensores);
        }
    }

    public void ListarSensoresTemperatura(){
        for(Sensor sensores : sensores){
            if(sensores instanceof SensorTemperatura){
                System.out.println(sensores);
            }
        }
    }

    public void ListarSensoresVibracao(){
        for(Sensor sensores : sensores){
            if(sensores instanceof SensorTemperatura){
                System.out.println(sensores);
            }
        }
    }

    public void ListarSensoresCriticos(){}

    public void RegistrarMedicao(){
        String alerta = "";

        String tipo = informacoes.TipoDeSensor();
        if(tipo.equalsIgnoreCase("Vibração")){

            int codigo = informacoes.CodigoSensor();
            double medidas = informacoes.ValorMedicao();
            String data = informacoes.DataMedicao();

            if(medidas> 60){
                alerta = "("+medidas+" > 60hz) está fora dos Padrões";
            }

            Medicao medicao = new Medicao(medidas, data,alerta, codigo,null, null);

            Medicoes.add(medicao);
        }else  if (tipo.equalsIgnoreCase("Temperatura")){
            int codigo = informacoes.CodigoSensor();
            double medidas = informacoes.ValorMedicao();
            String data = informacoes.DataMedicao();

            if(medidas> 60){
                alerta = "("+medidas+" > 80°) está fora dos Padrões";
            }

            Medicao medicao = new Medicao(medidas, data,alerta, codigo,null, null);

            Medicoes.add(medicao);
        }
    }

    public void ListarMedicoes(){
        for(Medicao medidas : Medicoes){
            System.out.println(medidas);
        }
    }
}
