package com.CGMV.view.panel;

import com.CGMV.events.IniciarJogo;
import com.CGMV.persistence.profile.User;

import javax.swing.*;
import java.awt.*;

public class TelaInicial extends JPanel {


    private final int LAR = 800;
    private final int ALT = 600;
    private JButton button;
    private JLabel label1;




    public TelaInicial(JFrame main, User user) {
        setPreferredSize(new Dimension(LAR,ALT));
        setFocusable(true);
        setLayout(null);
        button = new JButton("Iniciar jogo");
        button.setBounds(350 ,275,100,50);
        button.setToolTipText("Clique para iniciar jogo");
        button.addActionListener(new IniciarJogo(button,this, main,user));
        label1 = new JLabel("Bem vindo ao Jogo da Cobrinha!!",JLabel.CENTER);
        label1.setBounds(100 ,50,600,100);
        label1.setFont(new Font("Arial", Font.BOLD, 30));
        add(button);
        add(label1);
        label1.setVisible(true);
        setVisible(true);
    }



}
