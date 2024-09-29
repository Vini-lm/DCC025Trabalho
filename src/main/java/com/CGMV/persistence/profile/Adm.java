package com.CGMV.persistence.profile;

import com.CGMV.persistence.Config;

public class Adm extends User{

    private Config config;

    public Adm(String nome,Config config) {
        super(nome);
        if(config != null)
            this.config = config;
    }


    public Config getConfig() {
        return config;
    }


    public void init(){
        //this.data.mkdiruser(this);
        this.data.saveConfig(this.config,this);
    }

}
