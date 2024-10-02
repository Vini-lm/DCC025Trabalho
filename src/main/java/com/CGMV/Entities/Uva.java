package com.CGMV.Entities;


import javax.swing.*;
import java.awt.*;


public class Uva extends Fruta{




    public Uva(String nome)
   {
       super(nome);
       this.cor = new Color(152, 5, 205);
   }

    @Override
    public int getPoints( ) {
        return 2;
    }

    @Override
    public void bonus(Timer timer, Cobra cobra) {

       timer.setDelay(10);
    }





}
