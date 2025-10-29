package com.alfandega.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia a classe Scanner
        Scanner leia = new Scanner(System.in);

        // declaração de variáveis
        String nome;
        String resultado;
        double valor;

        //entrada de dados
        System.out.println("Informe o nome do passageiro:");
        nome = leia.nextLine();
        System.out.println("Informe valor da bagagem em dolares:");
        valor = leia.nextDouble();

        // verificar valor
        resultado = (valor <= 1000) ? " está liberado." : " está retido.";

        // mostrar resultado
        System.out.println(nome + resultado);
        
        // fecha objeto leia
        leia.close();

    }

}