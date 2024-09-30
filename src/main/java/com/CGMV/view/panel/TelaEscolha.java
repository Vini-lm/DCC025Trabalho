package com.CGMV.view.panel;

import com.CGMV.events.SalvarConfig;
import com.CGMV.persistence.Config;
import com.CGMV.Entities.profile.User;
import com.CGMV.view.frame.MainScreen;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class TelaEscolha extends JPanel {

    private final int LAR = 800;
    private final int ALT = 600;
    private JTextField corcab;
    private JTextField corcorpo1;
    private JTextField corcorpo2;
    private JButton salvar;
    private JList<String> lista;
    private JScrollPane listapainel;
    private DefaultListModel<String> listaModel;

    private JCheckBox c1,c2,c3,c4;

    private Config config;




    public TelaEscolha(MainScreen main, User user) {

        GridBagLayout lay = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        config = new Config();

        c.insets = new Insets(5, 5, 5, 5);
        this.setLayout(lay);
        c1 = new JCheckBox("Linhas no tabuleiro");
        c2 = new JCheckBox("Mostrar Possivel corpo");
        c3 = new JCheckBox("Mostrar fps");
        c4 = new JCheckBox("Fulltab");
        listaModel = new DefaultListModel<>();
        lista = new JList<>(listaModel);
        listapainel = new JScrollPane(lista);
        lista.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        listapainel.setPreferredSize(new Dimension(100,200));


        corcab = new JTextField(15);
        corcorpo1 = new JTextField(15);
        corcorpo2 = new JTextField(15);

        salvar = new JButton("Salvar");

        salvar.addActionListener(new SalvarConfig(main,this,config));


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
        c.gridx = 0;
        c.gridy = 4;

        add(salvar,c);

        c.gridx = 1;
        c.gridy = 5;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        add(listapainel,c);






        corcab.setText("Cor da cabeça da cobra");
        corcorpo1.setText("Cor do corpo");
        corcorpo2.setText("Cor2 do corpo");

        corcab.setToolTipText("Cor da cabeça da cobra");
        corcorpo1.setToolTipText("Cor do corpo");
        corcorpo2.setToolTipText("Cor2 do corpo");

        loadCondfig("Save" + "/"  + "teste" + "_score");






        setPreferredSize(new Dimension(LAR,ALT));
        setFocusable(true);
        setVisible(true);

    }

    public void updateConfig(){
        this.config.update(c1.isSelected(),c2.isSelected(),c3.isSelected(),c4.isSelected(),null,null);
    }


    private void loadCondfig(String localpath) {


        try {
            FileReader fr = new FileReader("Save/teste_config");
            BufferedReader br = new BufferedReader(fr);

            String temp;

            for (int j = 0; (temp = br.readLine()) != null; j++) {
                listaModel.addElement(temp);
            }


    }
    catch(Exception e){
            e.printStackTrace();
    }



    }




}
