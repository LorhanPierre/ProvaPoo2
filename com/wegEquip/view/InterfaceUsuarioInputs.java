package com.wegEquip.view;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceUsuarioInputs {

    Scanner input = new Scanner(System.in);

    public int TelaInicial(){

        int escolha = 0;
        boolean error = true;

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃              WegEquip                ┃");
        System.out.println("┣---------━━━━━━━━━━━━━━━━━━━━━--------┫");
        System.out.println("┃               Opções                 ┃");
        System.out.println("┃             ----------               ┃");
        System.out.println("┃ 1 - Cadastrar Sensores               ┃");
        System.out.println("┃ 2 - Listas                           ┃");
        System.out.println("┃ 3 - Registrar Medição                ┃");
        System.out.println("┃ 4 - Exibir Histórico de Medições     ┃");
        System.out.println("┃ 5 - Verificar Alertas                ┃");
        System.out.println("┃                                      ┃");
        System.out.println("┃ 0 - Sair                             ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        do {
            try {
                int opcao = input.nextInt();
                escolha = opcao;
                error = false;

            } catch (InputMismatchException erro) {
                System.err.print("Error: Você digitou um valor errado, tente digitar um número.\n:");
                input.nextLine();
            }
        }while(error);

        return escolha;
    }

    public String TipoDeSensor(){
        String tipoSensor = null;
        int escolha = 0;
        boolean error = true;

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃          Escolha Uma Opção           ┃");
        System.out.println("┣---------━━━━━━━━━━━━━━━━━━━━━--------┫");
        System.out.println("┃ 1 - Sensor de Temperatura            ┃");
        System.out.println("┃ 2 - Sensor de Vibração               ┃");
        System.out.println("┃                                      ┃");
        System.out.println("┃ 0 - Voltar                           ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        do {
            try {
                int opcao = input.nextInt();
                escolha = opcao;
                error = false;

            } catch (InputMismatchException erro) {
                System.err.print("Error: Você digitou um valor errado, tente digitar um número.\n:");
                input.nextLine();
            }
        }while(error);

        if(escolha == 1){
            tipoSensor = "Temperatura";
        }else if(escolha == 2){
            tipoSensor = "Vibração";
        } else if (escolha == 0) {
            tipoSensor = "nenhum";
        }

        return tipoSensor;
    }

    public int CodigoSensor(){
        int escolha = 0;
        boolean error = true;

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃ - Digite o código do Sensor          ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        do {
            try {
                int opcao = input.nextInt();
                input.nextLine();
                escolha = opcao;
                error = false;

            } catch (InputMismatchException erro) {
                System.err.print("Error: Você digitou um valor errado, tente digitar um número.\n:");
                input.nextLine();
            }
        }while(error);

        return escolha;
    }

    public String NomeSensor(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃ - Digite o Nome do Sensor            ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        String nome = input.nextLine();

        return nome;
    }

    public int Listagem() {

        int escolha = 0;
        boolean error = true;

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃     Escolha Um Tipo para Listar      ┃");
        System.out.println("┣----━━━━━━━━━━━━━━━━━━━━━━━━━━━━━-----┫");
        System.out.println("┃               Opções                 ┃");
        System.out.println("┃             ----------               ┃");
        System.out.println("┃ 1 - Listar Todos os Sensores         ┃");
        System.out.println("┃ 2 - Listar Sensores De Temperatura   ┃");
        System.out.println("┃ 3 - Listar Sensores De vibração      ┃");
        System.out.println("┃ 4 - Listar Sensores Críticos         ┃");
        System.out.println("┃                                      ┃");
        System.out.println("┃ 0 - Voltar                           ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        do {
            try {
                int opcao = input.nextInt();
                escolha = opcao;
                error = false;

            } catch (InputMismatchException erro) {
                System.err.print("Error: Você digitou um valor errado, tente digitar um número.\n:");
                input.nextLine();
            }
        }while(error);
        return escolha;
    }

    public double ValorMedicao(){
        double valorMedido = 0;
        boolean error = true;

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃ - Digite o Valor Da Medição          ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        do {
            try {
                double valorMedicao = input.nextInt();
                input.nextLine();
                valorMedido = valorMedicao;
                error = false;

            } catch (InputMismatchException erro) {
                System.err.print("Error: Você digitou um valor errado, tente digitar um número.\n:");
                input.nextLine();
            }
        }while(error);

        return valorMedido;
    }

    public String DataMedicao(){

        System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
        System.out.println("┃ - Digite a Data e Hora (dd/mm/aaaa HH:mm)  ┃");
        System.out.print("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛\n:");
        String data = input.nextLine();

        return data;
    }
}
