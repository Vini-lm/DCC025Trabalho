package com.CGMV.Entities;

import java.awt.*;

public class Banana extends Fruta{


    @Override
    public int getPoints() {
        return 5;
    }

    public Banana()
    {this.texture = "";
     this.cor = new Color(231, 239, 12);
    }
}