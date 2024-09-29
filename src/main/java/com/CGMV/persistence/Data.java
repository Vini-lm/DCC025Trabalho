package com.CGMV.persistence;

import com.CGMV.Entities.Cobra;
import com.CGMV.persistence.profile.User;

import java.io.*;

public class Data {

    private Cobra cobra;
    private File saves;
    private String local = "Save";

    public Data(Cobra cobra){
        criaDir();
        if(cobra != null)
            this.cobra = cobra;
    }



    private void criaDir(){
        saves = new File(local);
        if(!saves.exists())
        {
            System.out.println("Diretorio criado");
            saves.mkdir();
        }
        else{
            System.out.println("Diretorio já existe");
        }

    }



    public void saveConfig(Config config, User user)
    {
        try{
            File sconfig = new File(local + "/"  + user.getName() + "_config" );

            if(!sconfig.exists())
                sconfig.createNewFile();

            FileWriter fw = new FileWriter(sconfig);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(config.toString());
            bw.close();
        }
        catch (Exception e)
        {
            System.out.println("Ocorreu um erro ao salvar o arquivo de configuração do usuario");
            System.out.println(e.getMessage());
        }

    }

    public void saveScore(Cobra cobra, User user)
    {
        try{
            File sconfig = new File(local + "/"  + user.getName() + "_score" );

            if(!sconfig.exists())
                sconfig.createNewFile();

            FileWriter fw = new FileWriter(sconfig);
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(String.valueOf(cobra.getScore()));
            bw.close();
        }
        catch (Exception e)
        {
            System.out.println("Ocorreu um erro ao salvar o arquivo de score");
            System.out.println(e.getMessage());
        }

    }

    public void mkdiruser(User user){

        File suser = new File(local + "/" + "user_" + user.getName());

        if(!suser.exists())
            suser.mkdir();
    }


    public int loadconfig(User user, int i){


        try{
            File sconfig = new File(local + "/"  + user.getName() + "_config" );

            if(!sconfig.exists()) {
                System.out.println("Erro!");
                return 0;
            }

            FileReader fr = new FileReader(sconfig);
            BufferedReader br = new BufferedReader(fr);

            String temp;

            for(int j = 0; (temp = br.readLine()) != null; j++){
                if(j == i) {
                    br.close();
                    if(temp.equals("false"))
                        return 0;
                    else
                        return 1;
                }
            }

        }
        catch (Exception e)
        {
            System.out.println("Erro ao ler as configurações do usuario");
            System.out.println(e.getMessage());
        }

        return 0;

    }

}
