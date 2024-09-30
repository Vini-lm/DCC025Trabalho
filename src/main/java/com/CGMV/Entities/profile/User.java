package com.CGMV.Entities.profile;

import com.CGMV.Entities.Cobra;
import com.CGMV.persistence.Config;
import com.CGMV.persistence.Data;

public abstract class User {

    protected String name;
    protected Data data;
    protected Config config;


    public User(String name) {this.name = name;
    this.data = new Data(null);}


    public String getName(){ return this.name;}


    public Data getData(){ return this.data;}


    public void saveScore(Cobra cobra){
        data.saveScore(cobra,this);
    }

    public abstract void init();


    public void setConfig(Config config){this.config = config;}


    public Config getConfig() {
        return config;
    }
}
