package com.CGMV.events;

import com.CGMV.persistence.profile.User;
import com.CGMV.view.panel.TelaInformativa;
import com.CGMV.view.panel.TelaInicial;
import com.CGMV.view.panel.TelaJogo;
import com.CGMV.view.panel.TelaUsuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class VoltarTelaInicial implements ActionListener {
    private final JFrame frame;
    private JPanel panel;
    private User user;
    private JButton button;

    public VoltarTelaInicial(JButton button, JFrame frame, User user) {
        this.button = button;
        this.frame = frame;
        this.user = user;
    }
    public VoltarTelaInicial(JFrame frame, User user) {
        this.frame = frame;
        this.user = user;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        this.panel = new TelaInicial(frame,user);
        frame.setContentPane(panel);
        panel.requestFocusInWindow();
        frame.revalidate();
        frame.repaint();
    }
}

