package com.CGMV.Controler;

import com.CGMV.Jogo.Game;
import com.CGMV.view.TelaInicial;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowEvent;

public class PadronizarUsuario extends MouseAdapter implements ActionListener {
    private final JButton button;
    private final JFrame frame;

    public PadronizarUsuario(JButton button, JFrame frame) {
        this.button = button;
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        TelaInicial nova = new TelaInicial();
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));

    }
}
