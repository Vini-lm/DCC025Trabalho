package com.CGMV.Entities;


import java.awt.*;

public class Uva extends Fruta{


    // private final Image skin = new Image;



   public Uva()
   {
       this.texture = "";
       this.cor = new Color(152, 5, 205);
   }

    @Override
    public int getPoints() {
        return 2;
    }

    @Override
    public void bonus() {

    }
}
