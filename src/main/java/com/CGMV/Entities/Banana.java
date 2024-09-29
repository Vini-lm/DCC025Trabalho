package com.CGMV.Entities;

import java.awt.*;

public class Banana extends Fruta{


    @Override
    public int getPoints( ) {
        return 1;
    }

    @Override
    public void bonus() {

    }

    public Banana()
    {this.texture = "";
     this.cor = new Color(231, 239, 12);
    }
}
