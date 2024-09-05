package CGMV.view;

import javax.swing.*;
import java.awt.*;

public class TelaInicial  {

    private JFrame window;
    private final int WD = 800;
    private final int HG = 600;



    public void draw(){
    window = new JFrame("Inicio");
    window.setSize(WD, HG);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);



    }

}
