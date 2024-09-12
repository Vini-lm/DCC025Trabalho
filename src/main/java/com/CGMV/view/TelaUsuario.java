package com.CGMV.view;

import com.CGMV.Controler.CriarUsuario;
import com.CGMV.Controler.PadronizarUsuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaUsuario extends JFrame implements ActionListener {
    private final int LAR = 800;
    private final int ALT = 600;
    private JPanel painel;
    private JButton userPadrao;
    private JButton criaUser;
    private JLabel label1;

    public TelaUsuario() {
        setSize(LAR, ALT);
        userPadrao = new JButton("Usuário Padrão");
        criaUser = new JButton("Criar Usuário");
        painel = new JPanel();
        painel.setLayout(null);
        userPadrao.setBounds(300 ,300,200,50);
        userPadrao.setToolTipText("Clique para jogar com as configurações padrões");
        criaUser.setBounds(300,400,200,50);
        criaUser.setToolTipText("Clique para jogar com configurações personalizadas");
        painel.add(userPadrao);
        painel.add(criaUser);
        userPadrao.addActionListener(new PadronizarUsuario(userPadrao,this));
        criaUser.addActionListener(new CriarUsuario(criaUser,this));
        label1 = new JLabel("Escolha seu usuário",JLabel.CENTER);
        label1.setBounds(100 ,50,600,100);
        label1.setFont(new Font("Arial", Font.BOLD, 30));
        painel.add(label1);
        add(painel);
        label1.setVisible(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
