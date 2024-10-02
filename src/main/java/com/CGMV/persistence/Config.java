package com.CGMV.persistence;

import java.awt.*;

public class Config {

    private  String nome;
    private  boolean dlinhas;
    private  boolean dpcorpo;
    private  boolean showfps;
    private  boolean fulltab;
    private  Color corc;
    private  Color corcorpo;
    private int Score;




    public Config(boolean dlinhas, boolean dpcorpo, boolean showfps, boolean fulltab, Color corc, Color corcorpo, String nomem) {
        this.dlinhas = dlinhas;
        this.dpcorpo = dpcorpo;
        this.showfps = showfps;
        this.fulltab = fulltab;
        this.corc = corc;
        this.corcorpo = corcorpo;
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

    public Color getCorc() {
        return corc;
    }

    public Color getCorcorpo() {
        return corcorpo;
    }

    public Config() {
        this.dlinhas = false;
        this.dpcorpo = false;
        this.showfps = false;
        this.fulltab = false;
        this.corc = new Color(0,0,0);
        this.corcorpo = new Color(0,0,0);
    }

    public void update(boolean dlinhas, boolean dpcorpo, boolean showfps, boolean fulltab, Color corc,Color corcorpo,String nome){

        this.dlinhas = dlinhas;
        this.dpcorpo = dpcorpo;
        this.showfps = showfps;
        this.fulltab = fulltab;
        this.corc = corc;
        this.corcorpo = corcorpo;
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
