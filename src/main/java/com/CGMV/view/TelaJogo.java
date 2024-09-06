package com.CGMV.view;

import com.CGMV.Controler.GameKeyListener;
import com.CGMV.Entities.Cobra;
import com.CGMV.Entities.Fruta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TelaJogo extends JPanel implements ActionListener {

    private final int LAR = 800;
    private final int ALT = 600;
    private JFrame janela;
    private Cobra cobra = new Cobra();
    private Fruta fruta = new Fruta("Banana");
    private int unidades = 0;
    private final String FONTE = " "; // definir fonte
    private final int []EIXO_X = new int [10]; // ver quantidade de unidades
    private final int []EIXO_Y = new int [10]; // ver quantidade de unidades
    private Timer timer;
    Random random;



    public TelaJogo()
    {
        janela = new JFrame();
        janela.setSize(LAR, ALT);
        random = new Random();
        setPreferredSize(new Dimension(LAR,ALT));
        setBackground(Color.BLACK);
        setVisible(true);
        addKeyListener(new GameKeyListener(cobra));
        janela.add(this);
        janela.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
