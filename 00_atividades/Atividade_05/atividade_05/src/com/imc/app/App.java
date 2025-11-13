package com.imc.app;

import javax.swing.JOptionPane;

import com.imc.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // instancias
        Pessoa usuario = new Pessoa();

        // entrada de dados
        usuario.setNome(JOptionPane.showInputDialog("Informe seu nome:"));
        usuario.setPeso(Double.parseDouble(JOptionPane.showInputDialog("Informe o seu peso: ")));
        usuario.setAltura(Double.parseDouble(JOptionPane.showInputDialog("informe a Altura:")));
        
        //saida de dados
        JOptionPane.showMessageDialog(
            null,
            "DADOS DO USUÁRIO: \nNOME: " + usuario.getNome() + 
            "\nPeso: " + usuario.getPeso() +
            "\nAltura: " + usuario.getAltura()
            
        );

       
      
    }
}
