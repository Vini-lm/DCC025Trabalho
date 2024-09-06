package com.CGMV.Controler;

import com.CGMV.Entities.Cobra;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameKeyListener extends KeyAdapter {

    private Cobra cobra;

public GameKeyListener(Cobra cobra){this.cobra = cobra;}


    @Override
    public void keyPressed(KeyEvent e) {


            switch (e.getKeyCode())
            {
               case KeyEvent.VK_UP:
                   if(cobra.getDir() != 'B')
                       cobra.setDir('C');
                    break;

               case KeyEvent.VK_DOWN:
                   if(cobra.getDir() != 'C')
                       cobra.setDir('B');
                   break;

               case KeyEvent.VK_LEFT:
                   if(cobra.getDir() != 'D')
                       cobra.setDir('E');


               case KeyEvent.VK_W:
                   if(cobra.getDir() != 'B')
                       cobra.setDir('C');
                    break;

               case KeyEvent.VK_A:
                   if(cobra.getDir() != 'D')
                       cobra.setDir('E');
                   break;

               case KeyEvent.VK_S:
                   if(cobra.getDir() != 'C')
                       cobra.setDir('B');
                    break;

               case KeyEvent.VK_D:
                   if(cobra.getDir() != 'E')
                       cobra.setDir('D');
                   break;



            }
    }



}
