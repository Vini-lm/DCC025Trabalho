package com.CGMV.view.panel;

import com.CGMV.events.JogarNovamente;
import com.CGMV.events.VoltarTelaInicial;
import com.CGMV.persistence.profile.User;

import javax.swing.*;
import java.awt.*;

public class TelaFimDeJogo extends JPanel {




    // private JFrame window;
    private final int LAR = 800;
    private final int ALT = 600;
    private JLabel label1;
    private JButton jgNov;
    private JButton voltar;

    public TelaFimDeJogo(JFrame main, User user) {

        setPreferredSize(new Dimension(LAR, ALT));
        setLayout(null);
        label1 = new JLabel("Fim de jogo!", JLabel.CENTER);
        label1.setBounds(this.getX()/2 ,50,400,100);
        label1.setFont(new Font("Arial", Font.BOLD, 30));
        add(label1);
        label1.setVisible(true);
        jgNov = new JButton("Jogar Novamente");
        voltar = new JButton("Voltar a Tela Inicial");
        jgNov.setBounds(325 ,400,200,50);
        voltar.setBounds(525,400,200,50);
        add(jgNov);
        add(voltar);
        jgNov.addActionListener(new JogarNovamente(main,user));
        voltar.addActionListener(new VoltarTelaInicial(main,user));


        setVisible(true);
    }


}
