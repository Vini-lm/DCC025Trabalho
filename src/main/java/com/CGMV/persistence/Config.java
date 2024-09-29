package com.CGMV.persistence;

public class Config {

    private final boolean dlinhas;
    private final boolean dpcorpo;
    private final boolean showfps;
    private final boolean fulltab;
    private final CorDiv corc;
    private final CorDiv corcorpo;


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

    @Override
    public String toString() {
        return Boolean.toString(dlinhas) + "\n" + Boolean.toString(dpcorpo) + "\n"
             + Boolean.toString(showfps) + "\n" + Boolean.toString(fulltab) + "\n"
             + corc.toString() + "\n" + corcorpo.toString();

    }
}
