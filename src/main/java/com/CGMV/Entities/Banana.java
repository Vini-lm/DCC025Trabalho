package com.CGMV.Entities;

import javax.swing.*;
import java.awt.*;

public class Banana extends Fruta{




    @Override
    public void bonus(Timer timer, boolean invi) {

    }

    public Banana(String nome)
    {
     super(nome);
     this.cor = new Color(231, 239, 12);
    }
}
