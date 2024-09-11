package com.CGMV.view;

import com.CGMV.Controler.IniciarJogo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaEdicao extends JFrame implements ActionListener {

    // private JFrame window;
    private final int LAR = 800;
    private final int ALT = 600;
    private JPanel painel;
    private JButton button;
    private JLabel label1;

    public TelaEdicao() {
        setSize(LAR, ALT);
        painel = new JPanel();
        painel.setLayout(null);;
        label1 = new JLabel("PERSONALIZACAO");
        //label1.setVerticalTextPosition(JLabel.BOTTOM);
        //label1.setHorizontalTextPosition(JLabel.CENTER);

        painel.add(label1);
        add(painel);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
