package com.CGMV.view;

import com.CGMV.Controler.IniciarJogo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class TelaInicial extends JFrame implements ActionListener {

   // private JFrame window;
    private final int LAR = 800;
    private final int ALT = 600;
    private JPanel painel;
    private JButton button;

    public TelaInicial() {
        //window = new JFrame("Inicio");
        //window.setSize(LAR, ALT);
        //window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(LAR, ALT);
        button = new JButton("Iniciar jogo");
        painel = new JPanel();
        painel.setLayout(null);
        button.setBounds(325 ,275,100,50);
        button.setToolTipText("Clique para iniciar jogo");
        painel.add(button);
        button.addActionListener(new IniciarJogo(button,this));
        add(painel);
        setVisible(true);
       // window.add(painel);
       // window.setVisible(true);
    }


    /*public void draw(){
    window = new JFrame("Inicio");
    window.setSize(WD, HG);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
    }
    */

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
