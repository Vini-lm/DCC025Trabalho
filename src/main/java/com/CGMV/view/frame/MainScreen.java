package com.CGMV.view.frame;

import com.CGMV.Entities.profile.User;
import com.CGMV.view.panel.TelaUsuario;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class MainScreen extends JFrame {


    private JList<User> litauser;







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
