package com.CGMV.events;

import com.CGMV.Entities.profile.User;
import com.CGMV.view.frame.MainScreen;
import com.CGMV.view.panel.TelaEscolha;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;

public class CriarUsuario extends GameEvents {

    public CriarUsuario(MainScreen frame, JButton button, User user) {
        super(frame,button,user);
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
