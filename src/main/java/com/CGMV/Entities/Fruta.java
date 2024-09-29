package com.CGMV.Entities;

import java.awt.*;

public abstract class Fruta {
    private final int TAM_FRUTA = 50;
    private int idX;
    private int idY;
    protected String texture;
    protected Color cor;
   // private int points;



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

    public abstract void bonus();
}
