package com.CGMV.events;

import com.CGMV.Entities.profile.User;
import com.CGMV.view.frame.MainScreen;
import com.CGMV.view.panel.TelaJogo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JogarNovamente extends GameEvents{


    public JogarNovamente(MainScreen frame, User user) {
        super(frame,user);
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

