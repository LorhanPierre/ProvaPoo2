package com.wegEquip.view;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InterfaceUsuarioInputs {

    Scanner input = new Scanner(System.in);

    public int TelaInicial(){

        int escolha = 0;
        boolean error = true;

        System.out.println("|======================================|");
        System.out.println("|              WegEquip                |");
        System.out.println("|======================================|");
        System.out.println("|               Opções                 |");
        System.out.println("|             ----------               |");
        System.out.println("| 1 - Cadastrar Sensores               |");
        System.out.println("| 2 - Listas                           |");
        System.out.println("| 3 - Registrar Medição                |");
        System.out.println("| 4 - Exibir Histórico de Medições     |");
        System.out.println("| 5 - Verificar Alertas                |");
        System.out.println("|                                      |");
        System.out.println("| 0 - Sair                             |");
        System.out.print("========================================\n:");
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

    public int TipoDeSensor(){
        int escolha = 0;
        boolean error = true;

        System.out.println("|======================================|");
        System.out.println("|          Escolha Uma Opção           |");
        System.out.println("|======================================|");
        System.out.println("|               Opções                 |");
        System.out.println("|             ----------               |");
        System.out.println("| 1 - Sensor de Temperatura            |");
        System.out.println("| 2 - Sensor de Vibração               |");
        System.out.println("|                                      |");
        System.out.println("| 0 - Voltar                           |");
        System.out.print("========================================\n:");
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

    public int CodigoSensor(){
        int escolha = 0;
        boolean error = true;

        System.out.println("|======================================|");
        System.out.println("| - Digite o código do Sensor          |");
        System.out.print("========================================\n:");
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

        System.out.println("|======================================|");
        System.out.println("| - Digite o Nome do Sensor            |");
        System.out.print("========================================\n:");
        String nome = input.nextLine();

        return nome;
    }

    public String TipoSensor(){

        System.out.println("|======================================|");
        System.out.println("| - Digite o Tipo do Sensor            |");
        System.out.print("========================================\n:");
        String tipo = input.nextLine();

        return tipo;
    }

}
