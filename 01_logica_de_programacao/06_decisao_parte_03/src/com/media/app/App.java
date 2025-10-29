package com.media.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia da classe Scanner
        Scanner leia = new Scanner(System.in);

        // declaração de variáveis
        String nome;
        double nota;

        // entrada de dados
        System.out.println("Informe o nome do aluno: ");
        nome = leia.nextLine();
        System.out.println("Informe a nota de 0 a 10: ");
        nota = leia.nextDouble();

        // verifica se a nota é válida
        if (nota >= 0 && nota <= 10) {
            if (nota >= 7) {
                System.out.println(nome + " está aprovado.");
            }

            else if (nota >= 5) {
                System.out.println(nome + " está de recuperação.");
            }
            else {
                System.out.println(nome + " está reprovadoIs.");
            }
        } else {
            System.out.println("Nota inválida");
        }

        // fechar objeto leia
        leia.close();

    }

}
