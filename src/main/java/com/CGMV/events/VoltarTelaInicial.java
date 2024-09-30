package com.CGMV.events;


import com.CGMV.Entities.profile.User;
import com.CGMV.view.frame.MainScreen;
import com.CGMV.view.panel.TelaInformativa;
import com.CGMV.view.panel.TelaInicial;
import com.CGMV.view.panel.TelaJogo;
import com.CGMV.view.panel.TelaUsuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class VoltarTelaInicial extends GameEvents {


    public VoltarTelaInicial(JButton button, MainScreen frame, User user) {
      super(frame,button,user);
    }
    public VoltarTelaInicial(MainScreen frame, User user) {
      super(frame,user);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        this.panel = new TelaUsuario(frame,user);
        frame.setContentPane(panel);
        panel.requestFocusInWindow();
        frame.revalidate();
        frame.repaint();
    }
}

