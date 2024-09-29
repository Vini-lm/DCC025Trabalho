package com.CGMV.persistence;

public class CorDiv {

    private int r;
    private int g;
    private int b;

   public CorDiv(int r, int g, int b) {this.r = r; this.g = g; this.b = b;}

    public CorDiv()
    {
        this.r = 0;
        this.g = 0;
        this.b = 0;

    }

    public String toString() {return Integer.toString(r) + "\n" + Integer.toString(g) + "\n" + Integer.toString(b);}

}
