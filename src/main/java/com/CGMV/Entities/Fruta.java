package com.CGMV.Entities;

import javax.swing.*;
import java.awt.*;


public abstract class Fruta {

    private int idX;
    private int idY;
    protected String texture;
    protected Color cor;
    protected boolean invi;


   // private int points;


public Fruta(String nome)
{
    this.texture = "textures/frutas" + "/" + nome + ".png";
    this.invi = false;

}


    public int getPoints()
    {return 1;}

    public void setIdX(int idX) {
        this.idX = idX;
    }

    public void setIdY(int idY) {
        this.idY = idY;
    }

    public int getIdX() {
        return idX;
    }

    public int getIdY() {
        return idY;
    }

    public String getTexture() {
        return texture;
    }

    public Color getColor(){return cor;}

    public abstract void bonus(Timer timer, Cobra cobra);




}
