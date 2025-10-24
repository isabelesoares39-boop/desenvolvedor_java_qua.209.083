package com.entrada.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Instância do objeto leia
        Scanner leia = new Scanner(System.in);

        // declaração de variáveis
        String nome;
        String email;
        int idade;
        double altura;

        // entrada de dados
        System.out.println("Informe seu nome: ");
        nome = leia.nextLine();
        // line para string
        System.out.println("Informe sua idade: ");
        idade = leia.nextInt();
        // int para números inteiros
        System.out.println("Informe sua altura em metros: ");
        altura = leia.nextDouble();
        // Double para números inteiros

        // limpeza de buffer
        leia.nextLine();

        System.out.println("Informe seu e-mail: ");
        email = leia.nextLine();

        // saida de dados
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + "m");
        System.out.println("Email: " + email);

        // fecha objeto close
        leia.close();

    }
}
