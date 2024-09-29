package com.CGMV.Jogo;

import com.CGMV.view.panel.TelaJogo;

import javax.swing.*;

public class Game extends JFrame {






    public Game()
    {
        //add(new TelaJogo()); // adiciona o painel da tela do jogo na tela
        setTitle("Jogo");
        setResizable(false);
        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

    }




}
