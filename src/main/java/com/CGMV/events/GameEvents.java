package com.CGMV.events;

import com.CGMV.Entities.profile.User;
import com.CGMV.persistence.Config;
import com.CGMV.view.frame.MainScreen;
import com.CGMV.view.panel.TelaEscolha;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public  abstract class GameEvents  implements ActionListener {


    protected final MainScreen frame;
    protected  JPanel panel;
    protected  JButton button;
    protected  User user;
    protected  TelaEscolha sec;
    protected  Config config;


    public GameEvents(MainScreen frame, JPanel panel, JButton button) {
        this.frame = frame;
        this.panel = panel;
        this.button = button;
    }

    public GameEvents(MainScreen frame,JPanel panel,JButton button, User user){
        this.frame = frame;
        this.panel = panel;
        this.button = button;
        this.user = user;
    }

    public GameEvents(MainScreen frame, JButton button) {
        this.frame = frame;
        this.button = button;
    }

    public GameEvents(MainScreen frame, JButton button, User user) {
        this.frame = frame;
        this.button = button;
        this.user = user;
    }

    public GameEvents(MainScreen frame,User user) {
        this.frame = frame;
        this.user = user;
    }


    public GameEvents (MainScreen frame, TelaEscolha panel, Config config)
    {
        this.frame = frame;
        this.sec = panel;
        this.button = new JButton();
        this.config = config;
    }

    public GameEvents(TelaEscolha panel, JButton button,User user)
    {
        this.frame = null;
        this.sec = panel;
        this.button = new JButton();
        this.config = user.getConfig();

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }


}
