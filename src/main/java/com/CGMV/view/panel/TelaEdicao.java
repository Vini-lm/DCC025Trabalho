package com.CGMV.view.panel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaEdicao extends JPanel implements ActionListener {

    // private JFrame window;
    private final int LAR = 800;
    private final int ALT = 600;
    private JButton button;
    private JLabel label1;

    public TelaEdicao() {
        setPreferredSize(new Dimension(LAR, ALT));
        setLayout(null);;
        label1 = new JLabel("PERSONALIZACAO");
        label1.setVerticalTextPosition(JLabel.BOTTOM);
        label1.setHorizontalTextPosition(JLabel.CENTER);

        add(label1);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}
