package project;

import java.math.BigDecimal;

public enum
Şirniyyat {

    koke(BigDecimal.valueOf(0.20), "manat"),
    pecenya(BigDecimal.valueOf(0.90), "manat"),
    vafli(BigDecimal.valueOf(1.35), "manat"),
    rulet(BigDecimal.valueOf(2.05), "manat");

    BigDecimal qiymet;
    String valyuta;

    Şirniyyat(BigDecimal qiymet, String valyuta) {
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