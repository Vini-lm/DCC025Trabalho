package com.CGMV.view.panel;

import com.CGMV.events.CriarUsuario;
import com.CGMV.events.PadronizarUsuario;
import com.CGMV.persistence.profile.Default;
import com.CGMV.persistence.profile.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaUsuario extends JPanel implements ActionListener {
    private final int LAR = 800;
    private final int ALT = 600;
    private JButton userPadrao;
    private JButton criaUser;
    private JLabel label1;

    public TelaUsuario(JFrame main, User user) {
        setPreferredSize(new Dimension(LAR, ALT));
        userPadrao = new JButton("Usuário Padrão");
        criaUser = new JButton("Criar Usuário");
        setLayout(null);
        userPadrao.setBounds(300 ,300,200,50);
        userPadrao.setToolTipText("Clique para jogar com as configurações padrões");
        criaUser.setBounds(300,400,200,50);
        criaUser.setToolTipText("Clique para jogar com configurações personalizadas");
        add(userPadrao);
        add(criaUser);
        userPadrao.addActionListener(new PadronizarUsuario(userPadrao,main,user));
        criaUser.addActionListener(new CriarUsuario(criaUser,main,user));
        label1 = new JLabel("Escolha seu usuário",JLabel.CENTER);
        label1.setBounds(100 ,50,600,100);
        label1.setFont(new Font("Arial", Font.BOLD, 30));
        add(label1);
        label1.setVisible(true);
        setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }


}
