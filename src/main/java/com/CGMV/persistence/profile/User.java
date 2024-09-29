package com.CGMV.persistence.profile;

import com.CGMV.Entities.Cobra;
import com.CGMV.persistence.Config;
import com.CGMV.persistence.Data;

public abstract class User {



    protected String name;
    protected Data data;


    public User(String name) {this.name = name;
    this.data = new Data(null);}


    public String getName(){ return this.name;}


    public Data getData(){ return this.data;}


    public void saveScore(Cobra cobra){
        data.saveScore(cobra,this);
    }

}
