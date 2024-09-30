package com.CGMV.persistence;

public class Config {

    private  boolean dlinhas;
    private  boolean dpcorpo;
    private  boolean showfps;
    private  boolean fulltab;
    private  CorDiv corc;
    private  CorDiv corcorpo;


    public Config(boolean dlinhas, boolean dpcorpo, boolean showfps, boolean fulltab, CorDiv corc,CorDiv corcorpo) {
        this.dlinhas = dlinhas;
        this.dpcorpo = dpcorpo;
        this.showfps = showfps;
        this.fulltab = fulltab;
        //this.corc = corc;
        //this.corcorpo = corcorpo;


            this.corc = new CorDiv();

            this.corcorpo = new CorDiv();
    }


    public boolean getDlinhas() {
        return dlinhas;
    }

    public boolean getDpcorpo() {
        return dpcorpo;
    }

    public boolean getShowfps() {
        return showfps;
    }

    public boolean getFulltab() {
        return fulltab;
    }

    public CorDiv getCorc() {
        return corc;
    }

    public CorDiv getCorcorpo() {
        return corcorpo;
    }

    public Config() {
        this.dlinhas = false;
        this.dpcorpo = false;
        this.showfps = false;
        this.fulltab = false;
        this.corc = new CorDiv();
        this.corcorpo = new CorDiv();
    }

    public void update(boolean dlinhas, boolean dpcorpo, boolean showfps, boolean fulltab, CorDiv corc,CorDiv corcorpo){

        this.dlinhas = dlinhas;
        this.dpcorpo = dpcorpo;
        this.showfps = showfps;
        this.fulltab = fulltab;
        //this.corc = corc;
        //this.corcorpo = corcorpo;


        this.corc = new CorDiv();

        this.corcorpo = new CorDiv();

    }

    @Override
    public String toString() {
        return Boolean.toString(dlinhas) + "\n" + Boolean.toString(dpcorpo) + "\n"
             + Boolean.toString(showfps) + "\n" + Boolean.toString(fulltab) + "\n"
             + corc.toString() + "\n" + corcorpo.toString();

    }
}
