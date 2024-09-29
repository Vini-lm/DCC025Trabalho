package com.CGMV.view.frame;

import com.CGMV.persistence.profile.User;
import com.CGMV.view.panel.TelaEscolha;
import com.CGMV.view.panel.TelaInicial;
import com.CGMV.view.panel.TelaUsuario;

import javax.swing.*;

public class MainScreen extends JFrame {



    public MainScreen(User user) {
        add(new TelaUsuario(this,user));
        setSize(800,600);
        setTitle("Tela Inicial");
        setResizable(true);
        setFocusable(true);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }





}
