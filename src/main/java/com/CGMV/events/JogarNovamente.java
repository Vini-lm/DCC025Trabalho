package com.CGMV.events;

import com.CGMV.Jogo.Game;
import com.CGMV.persistence.profile.User;
import com.CGMV.view.panel.TelaJogo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class JogarNovamente implements ActionListener {



    private JPanel panel;
    private final JFrame frame;
    private User user;


    public JogarNovamente(JFrame frame, User user) {
        this.frame = frame;
        this.user = user;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.panel = new TelaJogo(user,frame);
        frame.setContentPane(panel);
        panel.requestFocusInWindow();
        frame.revalidate();
        frame.repaint();
    }
}

