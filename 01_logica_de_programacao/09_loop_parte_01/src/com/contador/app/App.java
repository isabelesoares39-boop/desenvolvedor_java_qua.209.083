package com.contador.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia a Scanner
        Scanner leia = new Scanner(System.in);

        // declaração de variaveis
        int n;

        // entrada de dados
        System.out.println("Informe um número inteiro: ");
        n = leia.nextInt();

        // loop (laço de repetição)
        while (n >= 1) {
            System.out.println(n - 1);
            n--;

        }

        // fecha o objeto leia
        leia.close();

    }

}
