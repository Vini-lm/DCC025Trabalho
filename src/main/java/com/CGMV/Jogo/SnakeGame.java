package com.CGMV.Jogo;


import com.CGMV.persistence.Config;
import com.CGMV.Entities.profile.Adm;
import com.CGMV.view.frame.MainScreen;


public class SnakeGame {


    public static void main(String[] args)
    {
        //TelaInicial teste = new TelaInicial();
        //TelaJogo teste2 = new TelaJogo();
        //TelaUsuario teste3 = new TelaUsuario();
        //teste.draw();
        //Game game = new Game();

        Config teste = new Config(false,true,false,false,null,null);
        Adm teste1 = new Adm("teste", teste);

        teste1.init();



        MainScreen mainScreen = new MainScreen(teste1);


    }
}
