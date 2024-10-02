package com.CGMV.view.panel;

import com.CGMV.events.CreateUser;
import com.CGMV.events.SalvarConfig;
import com.CGMV.persistence.ColorOp;
import com.CGMV.persistence.Config;
import com.CGMV.Entities.profile.User;
import com.CGMV.view.frame.MainScreen;
import com.google.gson.Gson;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class TelaEscolha extends JPanel {

    private final int LAR = 800;
    private final int ALT = 600;
    private JTextField nomec;
    private JComboBox corca;
    private JComboBox corcorpo;
    private JButton jogar;
    private JButton criar;
    private JButton remover;
    private JList<String> lista;
    private JScrollPane listapainel;
    public DefaultListModel<String> listaModel;
    private JCheckBox c1,c2,c3,c4;
    private Config config;
    private List<Config> configList;


    private  List<ColorOp> listacor;






    private User user;

    public TelaEscolha(MainScreen main, User user) {

        GridBagLayout lay = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

        listacor = new ArrayList<>();
        listacor.add( new ColorOp("Vermelho",Color.red));
        listacor.add( new ColorOp("Verde",Color.green));
        listacor.add( new ColorOp("Amarelo",Color.yellow));
        listacor.add( new ColorOp("Azul",Color.blue));
        listacor.add( new ColorOp("Ciano",new Color(15, 223, 207)));
        listacor.add( new ColorOp("Laranja",new Color(225, 92, 12)));
        listacor.add( new ColorOp("Verde Claro",new Color(18, 239, 107, 255)));
        listacor.add( new ColorOp("Amarelo Claro",new Color(225, 197, 12)));
        listacor.add( new ColorOp("Preto",new Color(0, 0, 0)));
        listacor.add( new ColorOp("Azul escuro",new Color(0, 50, 131)));
        listacor.add( new ColorOp("Branco", new Color(255, 255, 255, 255)));

        config = new Config();
        configList = new ArrayList<>();
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
        this.user = user;
        user.setConfig(config);
        lista.addListSelectionListener(new ListSelectionListener() {

            @Override
            public void valueChanged(ListSelectionEvent e) {


                if (!e.getValueIsAdjusting()) {
                    if(lista.getSelectedValue() != null) {
                        String nameformated = lista.getSelectedValue().trim();
                        System.out.println("Nome selecionado na lista: " + nameformated);
                        if (nameformated != null) {
                            boolean found = false;
                            for (Config configTemp : configList) {
                                String configName = configTemp.getNome().trim();
                                if (configName.equalsIgnoreCase(nameformated)) {
                                    config = configTemp;
                                    found = true;
                                    System.out.println("Config encontrada: " + config.getNome());

                                    if (found) {
                                        c1.setSelected(config.getDlinhas());
                                        c2.setSelected(config.getDpcorpo());
                                        c3.setSelected(config.getShowfps());
                                        c4.setSelected(config.getFulltab());
                                    }

                                    nomec.setText(config.getNome());
                                    break;
                                }
                            }

                            if (!found) {
                                System.out.println("Nenhuma configuração encontrada para " + nameformated);
                            }
                        }

                        revalidate();
                        repaint();
                    }
                }
            }

        });


        nomec = new JTextField(15);
        corca = new JComboBox<>();
        corcorpo = new JComboBox<>();




        for (ColorOp cor : listacor) {
            corca.addItem(cor.getNomecor());
            corcorpo.addItem(cor.getNomecor());
        }


        corca.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedColorName = (String) corca.getSelectedItem();
            }
        });

        corcorpo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedColorName = (String) corcorpo.getSelectedItem();
            }
        });





        jogar = new JButton("Jogar");
        criar = new JButton("Criar");
        remover = new JButton("Remover");

        jogar.addActionListener(new SalvarConfig(main, this, user, config));
        criar.addActionListener(new CreateUser(this, criar, user, config));
        remover.addActionListener(new ActionListener() {


            @Override
            public void actionPerformed(ActionEvent e) {
                int selectedIndex = lista.getSelectedIndex();
                if (selectedIndex != -1) {
                    remove2(selectedIndex);
                } else {
                    JOptionPane.showMessageDialog(null, "Selecione algum item!");
                }
            }
        });



        c.gridx = 0;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(c1,c);
        c.gridx = 1;
        c.gridy = 0;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(nomec,c);
        c.gridx = 0;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(c2,c);

        c.gridx = 1;
        c.gridy = 1;
        c.fill = GridBagConstraints.HORIZONTAL;

        add(corca,c);
        c.gridx = 0;
        c.gridy = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(c3,c);
        c.gridx = 1;
        c.gridy = 2;
        c.fill = GridBagConstraints.HORIZONTAL;

        add(corcorpo,c);
        c.gridx = 0;
        c.gridy = 3;
        c.fill = GridBagConstraints.HORIZONTAL;
        add(c4,c);
        c.gridx = 0;
        c.gridy = 4;

        add(jogar,c);

        c.gridx = 1;
        c.gridy = 4;
        add(criar,c);

        c.gridx = 0;
        c.gridy = 6;
        c.gridwidth = 2;
        c.fill = GridBagConstraints.HORIZONTAL;
        c.insets = new Insets(10, 5, 10, 5);
        add(remover, c);

        c.gridx = 1;
        c.gridy = 5;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 1;
        c.weighty = 1;
        c.fill = GridBagConstraints.BOTH;
        add(listapainel,c);





        c.gridx = 1;
        c.gridy = 6;
        c.fill = GridBagConstraints.BOTH;





        nomec.setText("Nome do usuário");


        nomec.setToolTipText("Nome do usuário");
        corca.setToolTipText("Cor da cabeça");
        corcorpo.setToolTipText("Cor do corpo");

        loadConfig();

        nomec.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user.setNome(nomec.getText());
            }
        });
        setPreferredSize(new Dimension(LAR,ALT));
        setFocusable(true);
        setVisible(true);

    }

    public User updateConfig(){


        if(config == null)
            config = new Config();

        this.config.update(c1.isSelected(),c2.isSelected(),c3.isSelected(),c4.isSelected(),nomec.getText());
        this.user.setNome(nomec.getText());
        user.setCor1(listacor.get(corca.getSelectedIndex()).getCor());
        user.setCor2(listacor.get(corcorpo.getSelectedIndex()).getCor());
        this.user.setConfig(config);
        return this.user;
    }


    public void loadConfig() {


        File pasta = new File("Save/");
        File[] lista = pasta.listFiles();


        configList = new ArrayList<>();
        if(lista != null){
            Gson gson = new Gson();
            for(File file : lista)
            {
                if(file.isFile() && file.getName().endsWith("_config")){
                    try(BufferedReader reader = new BufferedReader(new FileReader(file))){
                        config = gson.fromJson(reader,Config.class);
                        configList.add(config);

                        listaModel.addElement(config.getNome());

                    }
                    catch (Exception e){
                        e.getMessage();
                    }
                }

            }

        }
        this.revalidate();
        this.repaint();
        this.lista.updateUI();

    }
    public void addto(Config config)
    {

        if(!listaModel.contains(nomec.getText())) {
            configList.add(config);
            listaModel.addElement(config.getNome());
        }
    }

    private void atualizauser(){this.user.setNome(nomec.getText());}

    public void remove2(int i){
        System.out.println(i);

        if(i -1 >= 0)
            lista.setSelectedIndex(i -1);

        Config removecon = configList.get(i);
        String configsave = "Save/" + removecon.getNome() + "_config";


        File file = new File(configsave);
        if(file.exists())
            file.delete();

        configsave = "Save/" + removecon.getNome() + "_score";
        file = new File(configsave);

        if(file.exists())
            file.delete();

        configList.remove(i);
        listaModel.removeElementAt(i);
        lista.updateUI();
    }

    public int getselec(){return lista.getSelectedIndex();}


}