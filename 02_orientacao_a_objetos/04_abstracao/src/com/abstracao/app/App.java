package com.abstracao.app;

import java.util.Scanner;

import com.abstracao.models.Carro;
import com.abstracao.models.Moto;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia a entrada de dados
        Scanner leia = new Scanner(System.in);

        // instancia as classes
        Carro carro = new Carro();
        Moto moto = new Moto();

        // declaracao de variaveis
        String combustivel;

        // entrada de dados
        System.out.println("INFORME OS DADOS DO CARRO:");
        System.out.println("Informe o fabricante: ");
        carro.fabricante = leia.nextLine();
        System.out.println("Informe o modelo");
        carro.modelo = leia.nextLine();
        System.out.println("Informe a cor: ");
        carro.cor = leia.nextLine();
        System.out.println("Informe o ano: ");
        carro.ano = leia.nextLine();
        System.out.println("Informe a placa: ");
        carro.placa = leia.nextLine();

        // padrão de combustivel
        carro.motorFlex = false;
        carro.motorEletrico = false;
        carro.motorDiesel = false;
        carro.motorGasolina = false;
        carro.motorEtanol = false;

        // usuario informa o tipo de combustivel
        System.out.println("\nInforme o tipo de combustível:\n");
        System.out.println("1- Gasolina");
        System.out.println("2- Etanol");
        System.out.println("3- Tanto Gasolina ou Etanol");
        System.out.println("4- Diesel");
        System.out.println("5- Elétrico");
        combustivel = leia.nextLine();

        switch (combustivel) {
            case "1":
                carro.motorGasolina = true;
                break;
            case "2":
                carro.motorEtanol = true;
                break;
            case "3":
                carro.motorFlex = true;
                break;
            case "4":
                carro.motorDiesel = true;
                break;
            case "5":
                carro.motorEletrico = true;
                break;
            default:
                System.out.println("Motor inexistente.");

        }

        // entrada de dados da moto
        System.out.println("INFORME OS DADOS DA MOTO; ");
        System.out.println("Informe o fabricante: ");
        moto.fabricante = leia.nextLine();
        System.out.println("Informe o modelo: ");
        moto.modelo = leia.nextLine();
        System.out.println("Informe a cor: ");
        moto.cor = leia.nextLine();
        System.out.println("Informe o ano: ");
        moto.ano = leia.nextLine();
        System.out.println("Informe a placa: ");
        moto.placa = leia.nextLine();

        // saida de dados
        System.out.println("\nDADOS DO CARRO:\n");
        carro.exibirDados();
        System.out.println("\nDADOS DA MOTO:\n");
        moto.exibirDados();

        // fecha o obejeto leia
        leia.close();
    }
}
