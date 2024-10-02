package com.CGMV.events;

import com.CGMV.Entities.profile.User;
import com.CGMV.persistence.Config;
import com.CGMV.view.frame.MainScreen;
import com.CGMV.view.panel.TelaEdicao;
import com.CGMV.view.panel.TelaEscolha;
import com.CGMV.view.panel.TelaJogo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateUser extends GameEvents implements ActionListener {


    private Config config;
    public CreateUser(TelaEscolha panel, JButton button, User user,Config config) {
        super(panel,button,user);
        this.user = user;
        config.setNome(user.getName());
        this.config = config;

    }



    @Override
    public void actionPerformed(ActionEvent e) {

            this.user = sec.updateConfig();
            config = user.getConfig();
            user.save(config);
            sec.addto(config);

        }

}
