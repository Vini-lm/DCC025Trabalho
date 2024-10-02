package com.CGMV.persistence;

import java.awt.*;

public class ColorOp {

    private String nomecor;
    private Color cor;

    public Color getCor() {
        return cor;
    }

    public String getNomecor() {
        return nomecor;
    }

    public void setNomecor(String nomecor) {
        this.nomecor = nomecor;
    }

    public void setCor(Color cor) {
        this.cor = cor;
    }

    public ColorOp(String nomecor, Color cor) {
        this.nomecor = nomecor;
        this.cor = cor;
    }
}
