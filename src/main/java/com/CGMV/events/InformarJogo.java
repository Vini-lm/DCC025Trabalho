package com.CGMV.events;

import com.CGMV.Entities.profile.User;
import com.CGMV.view.frame.MainScreen;
import com.CGMV.view.panel.TelaInformativa;
import javax.swing.*;
import java.awt.event.ActionEvent;


public class InformarJogo extends GameEvents{


    public InformarJogo(MainScreen frame, JPanel panel , JButton button, User user) {
        super(frame,panel,button,user);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        this.panel = new TelaInformativa(frame, user);
        frame.setContentPane(panel);
        panel.requestFocusInWindow();
        frame.revalidate();
        frame.repaint();
    }
}
