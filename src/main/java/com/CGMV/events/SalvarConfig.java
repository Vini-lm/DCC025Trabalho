package com.CGMV.events;

import com.CGMV.persistence.Config;
import com.CGMV.Entities.profile.Adm;
import com.CGMV.Entities.profile.User;
import com.CGMV.view.frame.MainScreen;
import com.CGMV.view.panel.TelaEscolha;
import com.CGMV.view.panel.TelaJogo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SalvarConfig extends GameEvents{





    public SalvarConfig(MainScreen main, TelaEscolha panel, User user, Config config) {
       super(main,panel,config);
        this.user = user;
    }



    @Override
    public void actionPerformed(ActionEvent e) {
        this.user = sec.updateConfig();
        panel = new TelaJogo(this.user,frame);
        frame.setContentPane(panel);
        panel.requestFocusInWindow();
        frame.revalidate();
        frame.repaint();
    }




}
