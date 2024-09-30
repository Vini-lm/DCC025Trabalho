package com.CGMV.view.panel;

import com.CGMV.Entities.profile.User;
import com.CGMV.events.InformarJogo;
import com.CGMV.events.VoltarTelaInicial;
import com.CGMV.view.frame.MainScreen;

import javax.swing.*;
import java.awt.*;

public class TelaInformativa extends JPanel {
    private final int LAR = 800;
    private final int ALT = 600;
    private JLabel label1;
    private JLabel label2;
    private JLabel label3;
    private JLabel label4;
    private JLabel label5;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JLabel label9;
    private JLabel label10;
    private JButton button;

    public TelaInformativa(MainScreen main, User user){
        setLayout(null);
        label1 = new JLabel("Regras");
        label1.setBounds(340 ,10,600,100);
        label1.setFont(new Font("Arial", Font.BOLD, 40));

        label2 = new JLabel("-> Frutas");
        label2.setBounds(30 ,80,700,100);
        label2.setFont(new Font("Arial", Font.BOLD, 30));

        label3 = new JLabel("* Maçã: Torna a cobra invencível até alcançar outra fruta.");
        label3.setBounds(50 ,120,700,100);
        label3.setFont(new Font("Arial", Font.BOLD, 20));

        label4 = new JLabel("* Banana: Aumenta o corpo da cobra em 1 unidade. ");
        label4.setBounds(50 ,160,700,100);
        label4.setFont(new Font("Arial", Font.BOLD, 20));

        label5 = new JLabel("* Uva: Aumenta a velocidade da cobra até alcançar outra fruta. ");
        label5.setBounds(50 ,200,600,100);
        label5.setFont(new Font("Arial", Font.BOLD, 20));

        label6 = new JLabel("Desenvolvedores");
        label6.setBounds(30 ,400,600,100);
        label6.setFont(new Font("Arial", Font.BOLD, 25));

        label7 = new JLabel("-> Caio de Alvarenga Ribeiro");
        label7.setBounds(30 ,440,600,100);
        label7.setFont(new Font("Arial", Font.BOLD, 15));

        label8 = new JLabel("-> Guilherme Gonçalves Perissé");
        label8.setBounds(30 ,480,600,100);
        label8.setFont(new Font("Arial", Font.BOLD, 15));

        label9 = new JLabel("-> Marcos Vinícius Ferreira");
        label9.setBounds(300 ,440,600,100);
        label9.setFont(new Font("Arial", Font.BOLD, 15));

        label10 = new JLabel("-> Vinícius Oliveira de Matos Martins");
        label10.setBounds(300 ,480,600,100);
        label10.setFont(new Font("Arial", Font.BOLD, 15));

        button = new JButton("Voltar");
        button.setBounds(590,530,150,25);
        button.setToolTipText("Clique para voltar à tela anterior.");
        button.addActionListener(new VoltarTelaInicial(button, main, user));



        add(label1);
        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(label6);
        add(label7);
        add(label8);
        add(label9);
        add(label10);
        add(button);
        button.setVisible(true);
        label2.setVisible(true);
        label1.setVisible(true);
        label3.setVisible(true);
        label4.setVisible(true);
        label5.setVisible(true);
        label6.setVisible(true);
        label7.setVisible(true);
        label8.setVisible(true);
        label9.setVisible(true);
        label10.setVisible(true);
        setVisible(true);
    }
}
