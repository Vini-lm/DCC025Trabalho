package com.CGMV.persistence;

import com.CGMV.Entities.Cobra;
import com.CGMV.Entities.profile.User;
import com.google.gson.Gson;

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

            Gson gson = new Gson();
            String json = gson.toJson(config);

            FileWriter fw = new FileWriter(sconfig);
            fw.write(json);

            fw.close();
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
/*
            if(!sconfig.exists())
                sconfig.createNewFile();

            FileWriter fw = new FileWriter(sconfig);
            BufferedWriter bw = new BufferedWriter(fw);


            bw.write(String.valueOf(cobra.getScore()));

            bw.close();

 */

            Gson gson = new Gson();

            String json = gson.toJson("{nome:" + user.getName() + "," + "score:" + cobra.getScore() + "}");




            try(FileWriter fw = new FileWriter(sconfig,true) )
            {
                fw.write(json + System.lineSeparator());
            } catch (Exception e)
            {
                e.printStackTrace();
            }


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


    public Config loadconfig(User user){


        try{
            File sconfig = new File(local + "/"  + user.getName() + "_config" );

            if(!sconfig.exists()) {
                System.out.println("Erro!");
                return null;
            }

           Gson gson = new Gson();

           BufferedReader br = new BufferedReader(new FileReader(sconfig));
           return gson.fromJson(br.readLine(), Config.class);

        }
        catch (Exception e)
        {
            System.out.println("Erro ao ler as configurações do usuario");
            System.out.println(e.getMessage());
        }

        return null;

    }

}
