package com.CGMV.events;

import com.CGMV.persistence.profile.User;
import com.CGMV.view.panel.TelaInicial;
import com.CGMV.view.panel.TelaJogo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class PadronizarUsuario extends MouseAdapter implements ActionListener {
    private final JButton button;
    private final JFrame frame;
    private final User user;
    private  JPanel panel;

    public PadronizarUsuario(JButton button, JFrame frame, User user) {
        this.button = button;
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
