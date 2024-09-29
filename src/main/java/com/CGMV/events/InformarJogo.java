package com.CGMV.events;

import com.CGMV.Jogo.Game;
import com.CGMV.persistence.profile.User;
import com.CGMV.view.panel.TelaInformativa;
import com.CGMV.view.panel.TelaJogo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class InformarJogo extends MouseAdapter implements ActionListener {


    private final JButton button;
    private  JPanel panel;
    private final JFrame frame;
    private User user;


    public InformarJogo(JButton button, JPanel panel, JFrame frame, User user) {
        this.button = button;
        this.panel = panel;
        this.frame = frame;
        this.user = user;
    }


    @Override
    public void mouseClicked(MouseEvent e) {

        //System.out.println("Clique");




    }

    @Override
    public void actionPerformed(ActionEvent e) {
        this.panel = new TelaInformativa(frame, user);
        frame.setContentPane(panel);
        panel.requestFocusInWindow();
        frame.revalidate();
        frame.repaint();
        //frame.resize(800,600);
        // frame.setLocationRelativeTo(null);

        //Game game = new Game();
        //frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
    }
}
