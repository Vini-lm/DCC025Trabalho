package com.CGMV.events;

import com.CGMV.Entities.profile.User;
import com.CGMV.view.frame.MainScreen;
import com.CGMV.view.panel.TelaEdicao;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateUser extends GameEvents implements ActionListener {

    public CreateUser(MainScreen frame, JButton button) {
        super(frame,button);

    }



    @Override
    public void actionPerformed(ActionEvent e) {
        this.panel = new TelaEdicao();
        frame.setContentPane(panel);
        panel.requestFocusInWindow();
        frame.revalidate();
        frame.repaint();
    }
}
