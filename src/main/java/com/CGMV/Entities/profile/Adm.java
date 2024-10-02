package com.CGMV.Entities.profile;

import com.CGMV.persistence.Config;

import java.awt.*;

public class Adm extends User{




    public Adm(String nome,Config config) {
        super(nome);
        if(config != null)
            this.config = config;
    }




    public Config getConfig() {
        return config;
    }

    @Override
    public void init(){
        //this.data.mkdiruser(this);
        this.data.saveConfig(this.config,this);
    }


}