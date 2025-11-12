package com.combustivel.app;

import javax.swing.JOptionPane;

import com.combustivel.models.Combustivel;

public class App {
    public static void main(String[] args) throws Exception {
        Combustivel combustivel = new Combustivel();

        // array
        String[] opcoes = { "Informar valores", "Sair do programa" };
        Object opcao;

        do {

            opcao = JOptionPane.showInputDialog(
                    null,
                    "Selecione um opção:",
                    "Combustível",
                    0,
                    null,
                    opcoes,
                    opcoes[0]);

            if (opcao != "Sair do programa") {

                // entrada de dados
                combustivel.setGasolina(
                        Double.parseDouble(
                                JOptionPane.showInputDialog("Informe o valor da gasolina:").replace(",", ".")));
                combustivel.setEtanol(
                        Double.parseDouble(
                                JOptionPane.showInputDialog("Informe o valor do etanol:").replace(",", ".")));

                // saida de dados
                JOptionPane.showMessageDialog(null, combustivel.calcularCombustivel());

            }
        } while (opcao != "Sair do programa");

    }
}
