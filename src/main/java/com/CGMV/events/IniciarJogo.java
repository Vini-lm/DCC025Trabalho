package com.CGMV.events;

import com.CGMV.Jogo.Game;
import com.CGMV.Entities.profile.User;
import com.CGMV.view.frame.MainScreen;
import com.CGMV.view.panel.TelaJogo;

import javax.swing.*;
import java.awt.event.*;


public class IniciarJogo extends GameEvents {



    public IniciarJogo(MainScreen frame, JPanel panel, JButton button, User user) {
        super(frame,panel,button,user);
    }



    public void actionPerformed(ActionEvent e) {
        JPanel panel = new TelaJogo(user, frame);
        frame.setContentPane(panel);
        panel.requestFocusInWindow();
        frame.revalidate();
        frame.repaint();

    }


}
