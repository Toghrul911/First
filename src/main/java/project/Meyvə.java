package project;

import java.math.BigDecimal;

public enum Meyvə {

    alma(BigDecimal.valueOf(1.15), "manat"),
    armud(BigDecimal.valueOf(1.45), "manat"),
    banan(BigDecimal.valueOf(2.35), "manat"),
    ciyelek(BigDecimal.valueOf(3.35), "manat");

    BigDecimal qiymet;
    String valyuta;

    Meyvə(BigDecimal qiymet, String valyuta) {
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