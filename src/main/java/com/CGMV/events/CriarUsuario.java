package com.CGMV.events;

import com.CGMV.persistence.profile.User;
import com.CGMV.view.panel.TelaEdicao;
import com.CGMV.view.panel.TelaEscolha;
import com.CGMV.view.panel.TelaJogo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.WindowEvent;

public class CriarUsuario extends MouseAdapter implements ActionListener {
    private final JButton button;
    private final JFrame frame;
    private JPanel panel;
    private User user;

    public CriarUsuario(JButton button, JFrame frame,User user) {
        this.button = button;
        this.frame = frame;
        this.user = user;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        this.panel = new TelaEscolha(frame,user);
        frame.setContentPane(panel);
        panel.requestFocusInWindow();
        frame.revalidate();
        frame.repaint();
    }
}
