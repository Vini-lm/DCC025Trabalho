package com.CGMV.Controler;

import com.CGMV.Jogo.Game;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JogarNovamente implements ActionListener {
    private final JFrame frame;

    public JogarNovamente(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        Game novo = new Game();
        frame.setVisible(false);
    }
}

