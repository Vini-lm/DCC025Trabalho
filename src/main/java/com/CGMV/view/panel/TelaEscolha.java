package com.CGMV.view.panel;

import com.CGMV.persistence.profile.User;

import javax.swing.*;
import java.awt.*;

public class TelaEscolha extends JPanel {

    private final int LAR = 800;
    private final int ALT = 600;
    private JTextField corcab;
    private JTextField corcorpo1;
    private JTextField corcorpo2;
    private JButton salvar;


    private JCheckBox c1,c2,c3,c4;




    public TelaEscolha(JFrame main, User user) {

        GridBagLayout lay = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        c.insets = new Insets(5, 5, 5, 5);
        this.setLayout(lay);
        c1 = new JCheckBox("Linhas no tabuleiro");
        c2 = new JCheckBox("Mostrar Possivel corpo");
        c3 = new JCheckBox("Mostrar fps");
        c4 = new JCheckBox("Fulltab");

        corcab = new JTextField(15);
        corcorpo1 = new JTextField(15);
        corcorpo2 = new JTextField(15);

        salvar = new JButton("Salvar");




        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(c1,c);
        c.gridx = 1;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(corcab,c);
        c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(c2,c);

        c.gridx = 1;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;

        add(corcorpo1,c);
        c.gridx = 0;
        c.gridy = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(c3,c);
        c.gridx = 1;
        c.gridy = 2;
        c.fill = GridBagConstraints.HORIZONTAL;

        add(corcorpo2,c);
        c.gridx = 0;
        c.gridy = 3;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(c4,c);
        c.gridx = 1;
        c.gridy = 4;

        add(salvar,c);





        corcab.setText("Cor da cabeça da cobra");
        corcorpo1.setText("Cor do corpo");
        corcorpo2.setText("Cor2 do corpo");

        corcab.setToolTipText("Cor da cabeça da cobra");
        corcorpo1.setToolTipText("Cor do corpo");
        corcorpo2.setToolTipText("Cor2 do corpo");







        setPreferredSize(new Dimension(LAR,ALT));
        setFocusable(true);
        setVisible(true);

    }


}
