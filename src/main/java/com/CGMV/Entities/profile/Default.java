package com.CGMV.Entities.profile;

import com.CGMV.persistence.Config;

public class Default extends User{
    @Override
    public void init() {

    }

    private Config config;

    public Default(String nome){
        super(nome);
        //this.config = new Config();
    }






}
