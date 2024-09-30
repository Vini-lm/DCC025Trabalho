package com.CGMV.Entities;

import com.CGMV.Entities.profile.User;
import com.CGMV.view.panel.TelaJogo;

public  class Cobra {
    private  int SPEED = 45;
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

    public int getSPEED() {return SPEED;}

    public char getDir() {return direcao;}

    public void setDir(char dir) {direcao = dir;}

    public int getTamCobra() {return tamCobra;}

    public void feed(Fruta fruta, TelaJogo panel) {tamCobra += fruta.getPoints(); this.frutasComidas+= fruta.getPoints();}

    public int getScore() {return this.frutasComidas;}

    public void kill(){this.estaViva = false;}

    public boolean isAlive(){return this.estaViva;}

    public void setSpeed(int speed){ this.SPEED -= speed;}



}
