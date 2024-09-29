package com.CGMV.events.Controler;

import com.CGMV.Entities.Cobra;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameKeyListener extends KeyAdapter {

    private Cobra cobra; // referencia para cobra

public GameKeyListener(Cobra cobra){this.cobra = cobra;} // referencia para a cobra


    @Override
    public void keyPressed(KeyEvent e) { // verifica se as teclas foram pressionadas

            switch (e.getKeyCode())
            {
               case KeyEvent.VK_UP,KeyEvent.VK_W:
                   if(cobra.getDir() != 'B')
                       cobra.setDir('C');
                    break;

                case KeyEvent.VK_LEFT,KeyEvent.VK_A:
                    if(cobra.getDir() != 'D')
                        cobra.setDir('E');
                    break;

               case KeyEvent.VK_DOWN, KeyEvent.VK_S:
                   if(cobra.getDir() != 'C')
                       cobra.setDir('B');
                   break;

              case KeyEvent.VK_RIGHT,KeyEvent.VK_D:
                  if(cobra.getDir() != 'E')
                      cobra.setDir('D');
                  break;

            }
    }



}
