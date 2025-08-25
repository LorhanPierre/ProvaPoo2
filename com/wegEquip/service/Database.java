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

            String codigo = informacoes.CodigoSensor();
            String nome = informacoes.NomeSensor();

            Sensor novoSensor = new SensorVibracao(codigo,nome,tipo);

            sensores.add(novoSensor);
            mensagens.sucessoCadastroVibracao();
        } else if (tipo.equalsIgnoreCase("Temperatura")) {
            mensagens.CadastroTemperatura();

            String codigo = informacoes.CodigoSensor();
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
        for(Sensor sensorBuscado : sensores){
            if(sensorBuscado instanceof SensorTemperatura){
                System.out.println(sensorBuscado);
            }
        }
    }

    public void ListarSensoresVibracao(){
        for(Sensor sensorBuscado : sensores){
            if(sensorBuscado instanceof SensorVibracao){
                System.out.println(sensorBuscado);
            }
        }
    }

    public void ListarSensoresCriticos(){}

    public void RegistrarMedicao(){
        String alerta = "";

        String tipo = informacoes.TipoDeSensor();
        if(tipo.equalsIgnoreCase("Vibração")){

            String codigoBuscado = informacoes.CodigoSensor();
            for(Sensor sensorBuscado : sensores){
                if(sensorBuscado instanceof SensorVibracao && codigoBuscado.equalsIgnoreCase(sensorBuscado.getCodigo())){

                    double medidas = informacoes.ValorMedicao();
                    String data = informacoes.DataMedicao();

                    if(medidas > 60){
                        alerta = " | ⚠\uFE0F ALERTA ⚠\uFE0F";
                        System.out.println("⚠\uFE0F ALERTA ⚠\uFE0F ("+medidas+" > 60hz) Este sensor está fora dos Padrões");
                    }

                    Medicao medicao = new Medicao(medidas, data,alerta, codigoBuscado,null, null);

                    Medicoes.add(medicao);
                }
                else{
                    mensagens.SensorNaoEncontrado();
                }
            }

        }else  if (tipo.equalsIgnoreCase("Temperatura")){

            String codigoBuscado = informacoes.CodigoSensor();
            for(Sensor sensorBuscado : sensores){
                if(sensorBuscado instanceof SensorTemperatura && codigoBuscado.equalsIgnoreCase(sensorBuscado.getCodigo())){

                    double medidas = informacoes.ValorMedicao();
                    String data = informacoes.DataMedicao();

                    if(medidas > 80){
                        alerta = " | ⚠\uFE0F ALERTA ⚠\uFE0F";
                        System.out.println("⚠\uFE0F ALERTA ⚠\uFE0F ("+medidas+" > 80°) Este sensor está fora dos Padrões");
                    }

                    Medicao medicao = new Medicao(medidas, data,alerta, codigoBuscado,null, null);

                    Medicoes.add(medicao);
                }
                else {
                    mensagens.SensorNaoEncontrado();
                }
            }
        }
    }

    public void ListarMedicoes(){

        String codigoBuscado = informacoes.CodigoSensor();
        for(Medicao sensorBuscado : Medicoes){
            if(codigoBuscado.equalsIgnoreCase(sensorBuscado.getCodigo())){
                System.out.println(sensorBuscado);
            }
        }

    }

    public void VerificarAlertas(){

        int alertas = 0;

        for(Medicao sensorBuscado : Medicoes){
            if(sensorBuscado.getAlerta() != null ){

            }
        }

    }
}
