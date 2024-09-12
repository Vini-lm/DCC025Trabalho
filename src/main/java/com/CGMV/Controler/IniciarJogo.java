package com.CGMV.Controler;

import com.CGMV.Jogo.Game;

import javax.swing.*;
import java.awt.event.*;


public class IniciarJogo extends MouseAdapter implements ActionListener {


    private final JButton button;
    private final JFrame frame;


    public IniciarJogo(JButton button, JFrame frame) {
        this.button = button;
        this.frame = frame;
    }


    @Override
    public void mouseClicked(MouseEvent e) {

        System.out.println("Clique");

        Game game = new Game();


    }

    @Override
    public void actionPerformed(ActionEvent e) {

       Game game = new Game();
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
    }
}
