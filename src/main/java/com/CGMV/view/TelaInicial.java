package com.CGMV.view;

import javax.swing.*;
import java.awt.*;

public class TelaInicial  {

    private JFrame window;
    private final int LAR = 800;
    private final int ALT = 600;
    private JPanel painel;
    private JButton button;

    public TelaInicial() {
        window = new JFrame("Inicio");
        window.setSize(LAR, ALT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        button = new JButton("Iniciar jogo");
        painel = new JPanel();
        painel.setLayout(null);
        button.setBounds(325 ,275,100,50);
        button.setToolTipText("Clique para iniciar jogo");
        painel.add(button);
        window.add(painel);
        window.setVisible(true);
    }

    /*public void draw(){
    window = new JFrame("Inicio");
    window.setSize(WD, HG);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
    }
    */

}
