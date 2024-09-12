package com.CGMV.Controler;

import com.CGMV.view.TelaInicial;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class VoltarTelaInicial implements ActionListener {
    private final JFrame frame;

    public VoltarTelaInicial(JFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        TelaInicial inicio = new TelaInicial();
        frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
    }
}

