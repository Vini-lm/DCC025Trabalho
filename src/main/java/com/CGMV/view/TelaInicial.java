package com.CGMV.view;

import javax.swing.*;
import java.awt.*;

public class TelaInicial  {

    private JFrame window;
    private final int LAR = 800;
    private final int ALT = 600;
    private final String FONTE = " "; // definir fonte
    private final int []EIXO_X = new int [10]; // ver quantidade de unidades
    private final int []EIXO_Y = new int [10]; // ver quantidade de unidades

    public TelaInicial() {
        window = new JFrame("Inicio");
        window.setSize(LAR, ALT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    /*public void draw(){
    window = new JFrame("Inicio");
    window.setSize(WD, HG);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);
    }
    */

}
