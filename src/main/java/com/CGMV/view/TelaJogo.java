package com.CGMV.view;

import com.CGMV.Controler.GameKeyListener;
import com.CGMV.Entities.Banana;
import com.CGMV.Entities.Cobra;
import com.CGMV.Entities.Fruta;
import com.CGMV.Entities.Uva;
import com.CGMV.Jogo.Game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TelaJogo extends JPanel implements ActionListener {

    private final int LAR = 800;
    private final int ALT = 600;
    private int delay;
    private Cobra cobra;
    private Fruta fruta;
    private int pTabuleiro = 25;
    private int unidades = (LAR*ALT)/(pTabuleiro*pTabuleiro);
    private final String FONTE = " "; // definir fonte
    private final int []EIXO_X = new int [unidades]; // ver quantidade de unidades
    private final int []EIXO_Y = new int [unidades]; // ver quantidade de unidades
    private boolean isRunning = false;
    private Timer timer;
    Random random;



    public TelaJogo()
    {
        cobra = new Cobra();
        fruta = new Uva();
        random = new Random();
        delay = cobra.getSPEED();
        setFocusable(true);
        setPreferredSize(new Dimension(LAR,ALT));
        setBackground(Color.WHITE);
        addKeyListener(new GameKeyListener(cobra));
        start();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(isRunning){
            walk();
            checkColisao();
            }
        repaint();

    }

    private void start()
    {
        isRunning = true;
        setFrutaPos();
        timer = new Timer(delay, this);
        timer.start();
    }

    private void setFrutaPos() // Gerador de posição da fruta
    {
    fruta.setIdX(random.nextInt(LAR/pTabuleiro) * pTabuleiro); // gera uma posição X para a fruta
    fruta.setIdY(random.nextInt(ALT/pTabuleiro) * pTabuleiro); // gera uma posição y para a fruta
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        desenhaJogo(g);
    }


    private void desenhaJogo(Graphics g)
    {
        if(isRunning)
        {

            desenhaFundo(g);

            //g.drawImage(new ImageIcon(fruta.getTexture()).getImage(),fruta.getIdX(), fruta.getIdY(),pTabuleiro,pTabuleiro, this);

                g.setColor(fruta.getColor());

            g.fillOval(fruta.getIdX(),fruta.getIdY(),pTabuleiro,pTabuleiro); // desenha a fruta na posição dela com o tamanho proporcional ao tabuleiro

            for(int i = 0; i < cobra.getTamCobra(); i++) {
                if (i == 0) { // desenha a cabeça da cobra
                    g.setColor(new Color(33, 5, 104));
                    g.fillRect(EIXO_X[0], EIXO_Y[0], pTabuleiro, pTabuleiro);
                } else if(i % 2 == 0) { // desenha o corpo dela
                    g.setColor(new Color(77, 120, 247));
                    g.fillRect(EIXO_X[i], EIXO_Y[i], pTabuleiro, pTabuleiro);
                } else { // desenha o corpo dela
                    g.setColor(new Color(77, 120, 247));
                    g.fillRect(EIXO_X[i], EIXO_Y[i], pTabuleiro, pTabuleiro);
                }
            }


       // for(int i = cobra.getTamCobra() + 5; i >= cobra.getTamCobra(); i--) {
         //   g.setColor(new Color(23, 142, 25));
           // g.fillRect(EIXO_X[i], EIXO_Y[i], pTabuleiro, pTabuleiro);
        //}


      /*  for(int i =0; i<ALT; i++)
        {
            g.setColor(Color.black);
            g.drawLine(0,i*pTabuleiro,LAR,i*pTabuleiro);
            g.setColor(Color.blue);

        }

        for(int i = 0; i < ALT; i++)
        {
            g.setColor(Color.black);
            g.drawLine(i*pTabuleiro,0,i*pTabuleiro,ALT);
            g.setColor(Color.blue);

        }
*/

        }
        else
        {
            new TelaFimDeJogo();
            timer.stop();
        }
    }


    private void desenhaFundo(Graphics g)
    {
        for(int i = 0; i < LAR;i+=pTabuleiro)
            for(int j = 0; j < ALT;j+=pTabuleiro)
            {
                if((i + j) %2 == 0) {
                    g.setColor(new Color(142, 204, 59));
                    g.fillRect(i, j, pTabuleiro, pTabuleiro);
                }
                else
                {
                    g.setColor(new Color(167, 218, 74));
                    g.fillRect(i, j,pTabuleiro,pTabuleiro);
                }
            }
    }


    private void walk()
    {
        for(int i = cobra.getTamCobra() + fruta.getPoints() ; i > 0; i--) // move o corpo da cobra pra frente
        {
            EIXO_X[i] = EIXO_X[i - 1];
            EIXO_Y[i] = EIXO_Y[i - 1];
        }
        switch(cobra.getDir()) // move a cabeça da cobra de maneira proporcional ao Tabuleiro
        {
            case 'C':
                EIXO_Y[0] = EIXO_Y[0] - pTabuleiro; // move a cobra para cima
                break;

            case'D':
                EIXO_X[0] = EIXO_X[0] + pTabuleiro; // move a cobra para a direita
                break;

            case'E':
                EIXO_X[0] = EIXO_X[0] - pTabuleiro; // move a cobra para a esquerda
                break;
            case'B':
                EIXO_Y[0] = EIXO_Y[0] + pTabuleiro; //move a cobra para baixo
                break;

            default:
                break;
        }
    }

    private void checkColisao()
    {

        if(EIXO_X[0] == fruta.getIdX() && EIXO_Y[0] == fruta.getIdY()) // se a cobra encostar na comida
        {
            cobra.feed(fruta); // aumenta o tamanho dela

            if(fruta instanceof Uva) // se a fruta for uva
                fruta = new Banana(); // faz a fruta ser uma banana
            else if(fruta instanceof Banana)// se a fruta for uma banana
                fruta = new Uva(); // faz fruta ser uma uva


            setFrutaPos(); // gera uma nova posição para a comida



        }


        for(int i = cobra.getTamCobra(); i > 0; i--)
        {
            if(EIXO_X[0] == EIXO_X[i] && EIXO_Y[0] == EIXO_Y[i]) // verifica se a cobra bateu no próprio corpo
                isRunning = false;


        }
        if(EIXO_X[0] < 0  || EIXO_X[0] >= LAR) // Se a cobra ultrapassar os limites da tela(bater em um dos lados)
        {
            isRunning = false;
        }

        if(EIXO_Y[0] < 0  || EIXO_Y[0] >= ALT ) // Se a cobra ultrapassar os limites de altura
            isRunning = false;
    }
}
