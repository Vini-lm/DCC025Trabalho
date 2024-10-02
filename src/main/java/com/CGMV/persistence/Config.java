package com.CGMV.persistence;

import java.awt.*;

public class Config {

    private  String nome;
    private  boolean dlinhas;
    private  boolean dpcorpo;
    private  boolean showfps;
    private  boolean fulltab;
    private int Score;




    public Config(boolean dlinhas, boolean dpcorpo, boolean showfps, boolean fulltab, String nome){
        this.dlinhas = dlinhas;
        this.dpcorpo = dpcorpo;
        this.showfps = showfps;
        this.fulltab = fulltab;
        this.Score = Score;
        this.nome = nome;


    }


    public boolean getDlinhas() {
        return dlinhas;
    }

    public boolean getDpcorpo() {
        return dpcorpo;
    }

    public boolean getShowfps() {
        return showfps;
    }

    public boolean getFulltab() {
        return fulltab;
    }



    public Config() {
        this.dlinhas = false;
        this.dpcorpo = false;
        this.showfps = false;
        this.fulltab = false;

    }

    public void update(boolean dlinhas, boolean dpcorpo, boolean showfps, boolean fulltab,String nome){

        this.dlinhas = dlinhas;
        this.dpcorpo = dpcorpo;
        this.showfps = showfps;
        this.fulltab = fulltab;
        this.nome = nome;



    }

    @Override
    public String toString() {
        return Boolean.toString(dlinhas) + "\n" + Boolean.toString(dpcorpo) + "\n"
                + Boolean.toString(showfps) + "\n" + Boolean.toString(fulltab) + "\n";


    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setScore(int Score)
    {
        this.Score = this.Score;
    }
}