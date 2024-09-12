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
    private JLabel label1;

    public TelaInicial() {
        //window = new JFrame("Inicio");
        //window.setSize(LAR, ALT);
        //window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(LAR, ALT);
        button = new JButton("Iniciar jogo");
        painel = new JPanel();
        painel.setLayout(null);
        button.setBounds(350 ,275,100,50);
        button.setToolTipText("Clique para iniciar jogo");
        painel.add(button);
        button.addActionListener(new IniciarJogo(button,this));
       // window.add(painel);
       // window.setVisible(true);
        label1 = new JLabel("Bem vindo ao Jogo da Cobrinha!!",JLabel.CENTER);
        label1.setBounds(100 ,50,600,100);
        label1.setFont(new Font("Arial", Font.BOLD, 30));
        painel.add(label1);
        add(painel);
        label1.setVisible(true);
        setVisible(true);
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
