package com.CGMV.events;

import com.CGMV.Entities.profile.User;
import com.CGMV.persistence.Config;
import com.CGMV.view.panel.TelaEscolha;

import javax.swing.*;
import java.awt.event.ActionEvent;


public class DeletarUser extends GameEvents{
    private Integer i;

    public DeletarUser(TelaEscolha panel, JButton button, User user, Config config){
        super(panel,button,user);
        this.config = config;

       //this.sec = panel;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        sec.remove2(sec.getselec());
    }
}
