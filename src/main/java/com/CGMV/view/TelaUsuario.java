package com.CGMV.view;

import com.CGMV.Controler.CriarUsuario;
import com.CGMV.Controler.PadronizarUsuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaUsuario extends JFrame implements ActionListener {
    private final int LAR = 800;
    private final int ALT = 600;
    private JPanel painel;
    private JButton userPadrao;
    private JButton criaUser;

    public TelaUsuario() {
        setSize(LAR, ALT);
        userPadrao = new JButton("Usuário Padrão");
        criaUser = new JButton("Criar Usuário");
        painel = new JPanel();
        painel.setLayout(null);
        userPadrao.setBounds(325 ,100,200,50);
        userPadrao.setToolTipText("Clique para jogar com as configurações padrões");
        criaUser.setBounds(325,400,200,50);
        criaUser.setToolTipText("Clique para jogar com configurações personalizadas");
        painel.add(userPadrao);
        painel.add(criaUser);
        userPadrao.addActionListener(new PadronizarUsuario(userPadrao,this));
        criaUser.addActionListener(new CriarUsuario(criaUser,this));
        add(painel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
