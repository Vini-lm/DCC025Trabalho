package com.CGMV.Entities;

public class Fruta {
    private final int TAM_FRUTA = 50;
    private int idX;
    private int idY;
    private String nome;


    public Fruta(String nome)
    {
     this.nome = nome;
    }


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
}
