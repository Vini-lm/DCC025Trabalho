package com.CGMV.Entities;

public class Cobra {
    private final int SPEED = 200;
    private int tamCobra;
    private int frutasComidas;
    private char direcao;  // Direita, Esquerda, Cima, Baixo...
    private boolean estaViva;

    public Cobra() {
        tamCobra = 4;
        frutasComidas = 0;
        direcao = 'D';
        estaViva = true;
    }

    public char getDir()
    {return direcao;}

    public void setDir(char dir)
    {direcao = dir;}

    public int getTamCobra() {
        return tamCobra;
    }
    public void feed()
    {tamCobra++;}
}
