package project;

import java.math.BigDecimal;

public enum Icki {

    cola(BigDecimal.valueOf(0.70), "manat"),
    fanta(BigDecimal.valueOf(0.80), "manat"),
    bizon(BigDecimal.valueOf(1.00), "manat"),
    redbull(BigDecimal.valueOf(3.55), "manat");

    BigDecimal qiymet;
    String valyuta;

    Icki(BigDecimal qiymet, String valyuta) {
        this.qiymet = qiymet;
        this.valyuta = valyuta;
    }

    public BigDecimal getQiymet() {
        return qiymet;
    }

    public void setQiymet(BigDecimal qiymet) {
        this.qiymet = qiymet;
    }

    public String getValyuta() {
        return valyuta;
    }

    public void setValyuta(String valyuta) {
        this.valyuta = valyuta;
    }
}