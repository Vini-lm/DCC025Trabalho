package com.CGMV.Entities;

import javax.swing.*;
import java.awt.*;

public class Maca  extends Fruta{



    @Override
    public void bonus(Timer timer, Cobra cobra) {

        cobra.setInvi(true);
    }

    public Maca(String nome)
    {
        super(nome);
        this.cor = new Color(221, 5, 45);
    }


}
