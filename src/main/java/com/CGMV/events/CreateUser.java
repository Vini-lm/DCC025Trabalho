package com.CGMV.events;

import com.CGMV.persistence.profile.User;
import com.CGMV.view.panel.TelaEdicao;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateUser implements ActionListener {

    private final JButton button;
    private final JFrame frame;
    private JPanel panel;

    public CreateUser(JButton button, JFrame frame, User user) {
        this.button = button;
        this.frame = frame;
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
