package com.CGMV.Entities.profile;

import com.CGMV.Entities.Cobra;
import com.CGMV.persistence.Config;
import com.CGMV.persistence.Data;

import java.awt.*;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public abstract class User {

    protected String name;
    public Data data;
    protected Config config;
    private Color cor1;
    private Color cor2;


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

    public void save(Config config){data.saveConfig(config,this);}


    public void setCor1(Color cor1) {
        this.cor1 = cor1;
    }

    public void setCor2(Color cor2) {
        this.cor2 = cor2;
    }

    public Color getCor1() {
        return cor1;
    }

    public Color getCor2() {
        return cor2;
    }
    public void setNome(String nome){this.name = nome;}
}