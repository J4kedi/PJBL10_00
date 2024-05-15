import javax.swing.*;

import java.awt.Button;
import java.awt.Color;
import java.awt.Label;

public class Main {
    public static void main(String[] args) {
        Color corFundo = Color.decode("#06ADBF");

        // Criando a janela
        JFrame frame = new JFrame("Pizzaria Java");
        frame.setSize(700, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(corFundo);

        // Criando campo de email 
        JTextField inputEmail = new JTextField();
        JLabel labelEmail = new JLabel("Email ou Username:");
        inputEmail.setBounds(100, 100, 170, 30);

        labelEmail.setLabelFor(inputEmail);
        labelEmail.setBounds(100, 70, 170, 30);
        
        frame.add(inputEmail);
        frame.add(labelEmail);
        
        JPasswordField inputSenha = new JPasswordField();
        JLabel labelSenha = new JLabel("Senha:");
        inputSenha.setBounds(100, 160, 170, 30);

        labelSenha.setLabelFor(inputSenha);
        labelSenha.setBounds(100, 130, 170, 30);

        frame.add(inputSenha);
        frame.add(labelSenha);

        Button submitButton = new Button("Enviar");
        submitButton.setBounds(100, 210, 50, 20);

        frame.add(submitButton);

        Label        
        
        // Adicionando os componentes à janela
        frame.setSize(700, 500);
        frame.setLayout(null);
        // Mostra a janela
        frame.setVisible(true);
    }
}