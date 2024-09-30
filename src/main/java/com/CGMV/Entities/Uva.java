package com.CGMV.Entities;


import javax.swing.*;
import java.awt.*;


public class Uva extends Fruta{


    // private final Image skin = new Image;



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
    public void bonus(Timer timer, boolean invi) {
       timer.setDelay(30);
    }
}
