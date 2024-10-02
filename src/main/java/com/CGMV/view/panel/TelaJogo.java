package com.CGMV.view.panel;

import com.CGMV.Entities.*;
import com.CGMV.Entities.profile.Adm;
import com.CGMV.events.Controler.GameKeyListener;
import com.CGMV.Entities.profile.Default;
import com.CGMV.Entities.profile.User;
import com.CGMV.persistence.Config;
import com.CGMV.view.frame.MainScreen;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class TelaJogo extends JPanel  {

    //1
    private final int LAR = 800;
    private final int ALT = 600;
    private int pTabuleiro = 25;
    private int unidades = (LAR*ALT)/(pTabuleiro*pTabuleiro);
    private MainScreen main;
    private User user;
    private int delay;


    //2
    private  Font FONTE; // definir fonte
    private boolean isRunning = false;
    private final int []EIXO_X = new int [unidades]; // ver quantidade de unidades
    private final int []EIXO_Y = new int [unidades]; // ver quantidade de unidades
    Random random;
    private Timer timer;
    private Timer timer2;
    private  int fpscont;
    private long lastcheck;
    private int fps;


    //3
    private Cobra cobra;
    private Fruta fruta;
    private Color cCorpo;
    private Color cCorpo2;
    private Color cCabeca;






    //4
    private Config config;
    private int bonusDuration;











    public TelaJogo(MainScreen main)
    {

        this.delay = 45;
        this.cobra = new Cobra(null);
        this.fruta = new Uva("uva");
        this.random = new Random();
        this.FONTE = new Font("Times New Roman", Font.PLAIN, 20);
        this.config = new Config();
        this.user = new Default("guest");
        this.main = main;

        this.cCabeca = new Color(33, 5, 104);
        this.cCorpo = new Color(77, 120, 247);
        this.cCorpo2 = cCorpo;
        this.bonusDuration = 0;

        start();
        setFocusable(true);
        setPreferredSize(new Dimension(LAR,ALT));
        setBackground(Color.WHITE);
        addKeyListener(new GameKeyListener(cobra));


    }


    public TelaJogo(User user, MainScreen main)
    {
        this(main);

        this.user = user;

        if(!(user instanceof Default)) {
            if(user != null) {
               this.config = user.getConfig();
            }
            else System.out.println("Usuário nulo");


            System.out.println("Valor de " + config.getDlinhas() + " Valor de " + config.getDpcorpo() + " Valor de " + config.getShowfps());

            if (cCorpo != null)
                this.cCorpo = cCorpo;
            if (cCabeca != null)
                this.cCabeca = cCabeca;

            if (cCorpo2 != null)
                this.cCorpo2 = cCorpo2;
        }

    }



    private void start()
    {
        isRunning = true;
        setFrutaPos();
        timer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(isRunning){
                    walk();
                    checkColisao();

                }
                repaint();
            }
        });
        timer2 = new Timer(0,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            if(config.getShowfps())
                checkFps();
            }
        });
        cobra.setTimer(timer);
        timer.start();
        timer2.start();
    }

    private void setFrutaPos() // Gerador de posição da fruta
    {

            fruta.setIdX(random.nextInt(LAR / pTabuleiro) * pTabuleiro); // gera uma posição X para a fruta
            fruta.setIdY(random.nextInt(ALT / pTabuleiro) * pTabuleiro); // gera uma posição y para a fruta

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
            if(config.getDlinhas())
                desenhaLinhas(g);

            desenhaFruta(g);

            desenhaCobra(g);
            if(config.getDpcorpo())
                desenhaPCorpo(g);


            desenhaScore(g);


        }
        else
        {
           JPanel nova = new TelaFimDeJogo(main,user);
            main.setContentPane(nova);
            this.requestFocusInWindow();
            main.revalidate();
            main.repaint();
            timer.stop();
            timer2.stop();
           if(user instanceof Adm) {
               user.saveScore(cobra);
               user.data.saveConfig(user.getConfig(), user);

           }
        }
    }



    private void desenhaPCorpo(Graphics g) // desenha o possivel corpo da cobra (copo que ela vai ter se comer a fruta)
    {
        for(int i = cobra.getTamCobra() + fruta.getPoints() ; i >= cobra.getTamCobra(); i--) {
            g.setColor(new Color(23, 142, 25));
            g.fillRect(EIXO_X[i], EIXO_Y[i], pTabuleiro, pTabuleiro);
        }
    }



    private void desenhaFruta(Graphics g)
    {
         g.drawImage(new ImageIcon(fruta.getTexture()).getImage(),fruta.getIdX(), fruta.getIdY(),pTabuleiro,pTabuleiro + 5, this);

        //g.setColor(fruta.getColor());

       // g.fillOval(fruta.getIdX(),fruta.getIdY(),pTabuleiro,pTabuleiro); // desenha a fruta na posição dela com o tamanho proporcional ao tabuleiro
    }



    private void desenhaLinhas(Graphics g) // desenha linhas no tabuleiro
    {
        for(int i =0; i<ALT; i++)
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
    }


    private void desenhaScore(Graphics g) // desenha a pontuação atual do jogador
    {
        g.setFont(FONTE);
        g.setColor(Color.WHITE);
        g.drawString("Score: " + cobra.getScore(), 715,25);
    }

    private void desenhaCobra(Graphics g) // desenha o corpo da cobra
    {
        for(int i = 0; i < cobra.getTamCobra(); i++) {
            if (i == 0) { // desenha a cabeça da cobra
                g.setColor(cCabeca);
                g.fillRect(EIXO_X[0], EIXO_Y[0], pTabuleiro, pTabuleiro);
            } else if(i % 2 == 0) { // desenha o corpo dela
                g.setColor(cCorpo);
                g.fillRect(EIXO_X[i], EIXO_Y[i], pTabuleiro, pTabuleiro);
            } else { // desenha o corpo dela
                g.setColor(cCorpo2);
                g.fillRect(EIXO_X[i], EIXO_Y[i], pTabuleiro, pTabuleiro);
            }
        }
    }


    private void desenhaFundo(Graphics g) // desenha o fundo do tabuleiro
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


    private void checkFps() // calcula e mostra os quadros por segundo do jogo
    {
        fpscont++;
        long Time = System.currentTimeMillis();
        if(Time - lastcheck >= 1000) {
            fps = fpscont;

            fpscont = 0;

            lastcheck = Time;
        }
        System.out.println("FPS: " + fps);

    }

    private void walk() // faz a cobra andar
    {
        for(int i = cobra.getTamCobra() + fruta.getPoints() ; i > 0; i--) // move o corpo da cobra pra frente (e o possível corpo dela também)
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

    private void checkColisao() // verifica se a cobra ultrapassou os limites do tabuleiro e se comeu a fruta
    {

        if(EIXO_X[0] == fruta.getIdX() && EIXO_Y[0] == fruta.getIdY()) // se a cobra encostar na comida
        {
            cobra.feed(fruta, this); // aumenta o tamanho dela

            int chance = random.nextInt(1,100);

            timer.setDelay(delay);
            cobra.setInvi(false);

            fruta.bonus(timer,cobra);

          if(chance <= 10) {

              fruta = new Uva("uva");
          }
          else if (chance >= 11 && chance <= 31) {

              fruta = new Maca("maca");
          }
          else if (chance >= 32 && chance <= 100) {

              fruta = new Banana("banana");
          }


            setFrutaPos(); // gera uma nova posição para a comida

        }


        for(int i = cobra.getTamCobra(); i > 0; i--)
        {
            if(!cobra.getInvi()) {
                if (EIXO_X[0] == EIXO_X[i] && EIXO_Y[0] == EIXO_Y[i]) // verifica se a cobra bateu no próprio corpo
                    isRunning = false;
            }
            while(EIXO_X[i] == fruta.getIdX() && EIXO_Y[i] == fruta.getIdY()) // garante que a comida esteja em uma posição livre
                setFrutaPos();

        }
        if(config.getFulltab())
            checkLimite();
        else
            checkBatida();

    }


    private void checkBatida(){

          if (EIXO_X[0] < 0 || EIXO_X[0] >= LAR) // Se a cobra ultrapassar os limites da tela(bater em um dos lados)
          {
              isRunning = false;
          }

          if (EIXO_Y[0] < 0 || EIXO_Y[0] >= ALT) // Se a cobra ultrapassar os limites de altura
              isRunning = false;
      }




    private void checkLimite()
    {
        if(EIXO_X[0] < 0) // Se a cobra ultrapassar os limites da tela(bater em um dos lados)
            EIXO_X[0] = LAR - pTabuleiro;

        else if( EIXO_X[0] >= LAR)
            EIXO_X[0] = 0;

        if(EIXO_Y[0] < 0) // Se a cobra ultrapassar os limites de altura
            EIXO_Y[0] = ALT - pTabuleiro;
        else if(EIXO_Y[0] >= ALT)
            EIXO_Y[0] = 0;
    }



}
