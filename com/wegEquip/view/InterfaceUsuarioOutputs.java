package com.wegEquip.view;

public class InterfaceUsuarioOutputs {

    public void SairSistema(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃        Tchau Volte Sempre, :)        ┃");
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

    }

    public void AreaDeCadastro(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃     Área de Cadastro de Sensores     ┃");
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

    }

    public void AreaDeListagem(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃          Área de Listagem            ┃");
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

    }

    public void CadastroTemperatura(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃ Cadastrando de Sensor de Temperatura ┃");
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

    }

    public void CadastroVibracao(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃   Cadastrando de Sensor de Vibração  ┃");
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

    }

    public void sucessoCadastroTemperatura(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃      ✅Sensor Cadastrado com Sucesso!        ┃");
        System.out.println("┣-----━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━-------┫");
        System.out.println("┃ Tipo: Temperatura | Limite de Alerta: 80.0 °C┃");
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

    }

    public void sucessoCadastroVibracao(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃       ✅Sensor Cadastrado com Sucesso!        ┃");
        System.out.println("┣-----━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━------┫");
        System.out.println("┃ Tipo: Vibração    | Limite de Alerta: ≠60.0 Hz┃");
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

    }

    public void SensorNaoEncontrado(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃       Sensor Não Encontrado!         ┃");
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
    }

    public void VerificacaoDeSensores(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃        Verificando Sensores...       ┃");
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");

    }

    public void InspecaoImediata(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃   ⚠\uFE0FInspeção imediata recomendada!   ┃");
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");


    }

    public void SensoreCriticos(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃          ÁREA DE SENSORES CRÍTICOS           ┃");
        System.out.println("┣-----━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━-------┫");
        System.out.println("┃       Sensores com mais de 3 alertas         ┃");
        System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
    }
}
