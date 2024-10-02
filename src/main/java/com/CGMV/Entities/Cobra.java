package com.CGMV.Entities;

import com.CGMV.Entities.profile.User;
import com.CGMV.view.panel.TelaJogo;

import javax.swing.*;

public  class Cobra {
    private  int SPEED = 45;
    private int tamCobra;
    private int frutasComidas;
    private char direcao;  // Direita, Esquerda, Cima, Baixo...
    private boolean invi;
    private Timer timer;
    private int Duration;

    public Cobra(Timer timer) {
        tamCobra = 4;
        frutasComidas = 0;
        direcao = 'D';
        invi = false;
        this.timer = timer;
    }

    public int getSPEED() {return SPEED;}

    public char getDir() {return direcao;}

    public void setDir(char dir) {direcao = dir;}

    public int getTamCobra() {return tamCobra;}

    public void feed(Fruta fruta, TelaJogo panel) {tamCobra += fruta.getPoints(); this.frutasComidas+= fruta.getPoints();}

    public int getScore() {return this.frutasComidas;}

    public void setSpeed(int speed){ this.SPEED -= speed;}

    public boolean getInvi(){
        return this.invi;
    }

    public void setInvi(Boolean invi){this.invi = invi;}

    public Timer getTimer(){return timer;}

    public void setTimer(Timer timer){this.timer = timer;}

    public void teste(){this.timer.setDelay(1000);}

}
