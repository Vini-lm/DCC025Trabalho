package com.CGMV.view;

import com.CGMV.Controler.*;
import com.CGMV.Jogo.Game;

import javax.swing.*;
import java.awt.*;

public class TelaFimDeJogo extends JFrame {

    // private JFrame window;
    private final int LAR = 800;
    private final int ALT = 600;
    private JPanel painel;
    private JLabel label1;
    private JButton jgNov;
    private JButton voltar;

    public TelaFimDeJogo() {
        setSize(LAR, ALT);
        painel = new JPanel();
        painel.setLayout(null);
        // window.add(painel);
        // window.setVisible(true);
        label1 = new JLabel("Fim de jogo!", JLabel.CENTER);
        label1.setBounds(this.getX()/2 ,50,400,100);
        label1.setFont(new Font("Arial", Font.BOLD, 30));
        //label1.setVerticalTextPosition(JLabel.BOTTOM);
        //label1.setHorizontalTextPosition(JLabel.CENTER);
        //label1.setSize(500,250);
        painel.add(label1);
        label1.setVisible(true);
        jgNov = new JButton("Jogar Novamente");
        voltar = new JButton("Voltar a Tela Inicial");
        jgNov.setBounds(325 ,400,200,50);
        voltar.setBounds(525,400,200,50);
        painel.add(jgNov);
        painel.add(voltar);
        jgNov.addActionListener(new JogarNovamente(this));
        voltar.addActionListener(new VoltarTelaInicial(this));


        add(painel);
        setVisible(true);
    }
}
