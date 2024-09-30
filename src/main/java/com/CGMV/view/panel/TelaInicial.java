package com.CGMV.view.panel;

import com.CGMV.events.IniciarJogo;
import com.CGMV.events.InformarJogo;
import com.CGMV.Entities.profile.User;
import com.CGMV.view.frame.MainScreen;

import javax.swing.*;
import java.awt.*;

public class TelaInicial extends JPanel {


    private final int LAR = 800;
    private final int ALT = 600;
    private JButton button;
    private JButton button2;
    private JLabel label1;




    public TelaInicial(MainScreen main, User user) {
        setPreferredSize(new Dimension(LAR,ALT));
        setFocusable(true);
        setLayout(null);
        button = new JButton("Iniciar jogo");
        button.setBounds(350 ,275,100,50);
        button.setToolTipText("Clique para iniciar jogo");
        button.addActionListener(new IniciarJogo(main,this,button, user));
        button2 = new JButton("Sobre o jogo");
        button2.setBounds(500,500,150,25);
        button2.setToolTipText("Clique para ver informações sobre o jogo.");
        button2.addActionListener(new InformarJogo(main,this,button2,user));

        label1 = new JLabel("Bem vindo ao Jogo da Cobrinha!!",JLabel.CENTER);
        label1.setBounds(100 ,50,600,100);
        label1.setFont(new Font("Arial", Font.BOLD, 30));
        add(button);
        add(button2);
        add(label1);
        label1.setVisible(true);
        setVisible(true);
    }



}
