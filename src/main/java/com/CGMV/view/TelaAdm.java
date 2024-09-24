package com.CGMV.view;

import javax.swing.*;
import java.awt.*;

public class TelaAdm extends JPanel {

    private JButton Start;
    //private JColorChooser cor;
    private JCheckBox cb1, cb2, cb3, cb4, cb5, cb6;
    private JTextField tf1;

    public TelaAdm() {
    this.Start = new JButton();
    cb1 = cb2 = cb3 = cb4 = cb5 = cb6 = new JCheckBox();
    tf1 = new JTextField();
    this.setPreferredSize(new Dimension(800,600));
    //this.cor = new JColorChooser();
    this.Start.setBounds(700,500,100,50);
    this.add(Start);
    //this.add(cor);
    this.setVisible(true);
    this.setLayout(null);

    }




}
