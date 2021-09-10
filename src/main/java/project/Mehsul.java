package project;

import java.util.Objects;

public class Mehsul {
    private String icki;
    private String sirniyyat;
    private String meyve;
    private int ickisayi;
    private int meyvekq;
    private int sirniyyatsayi;


    public Mehsul() {
    }



    public Mehsul(String icki, String sirniyyat, String meyve, int ickisayi, int sirniyyatsayi, int meyvekq) {
        this.icki = icki;
        this.sirniyyat = sirniyyat;
        this.meyve = meyve;
        this.ickisayi = ickisayi;
        this.sirniyyatsayi = sirniyyatsayi;
        this.meyvekq = meyvekq;
    }

    public String getIcki() {
        return icki;
    }

    public void setIcki(String icki) {
        this.icki = icki;
    }

    public String getSirniyyat() {
        return sirniyyat;
    }

    public void setSirniyyat(String sirniyyat) {
        this.sirniyyat = sirniyyat;
    }

    public String getMeyve() {
        return meyve;
    }

    public void setMeyve(String meyve) {
        this.meyve = meyve;
    }

    public int getIckisayi() {
        return ickisayi;
    }

    public void setIckisayi(int ickisayi) {
        this.ickisayi = ickisayi;
    }

    public int getSirniyyatsayi() {
        return sirniyyatsayi;
    }

    public void setSirniyyatsayi(int sirniyyatsayi) {
        this.sirniyyatsayi = sirniyyatsayi;
    }

    public int getMeyvekq() {
        return meyvekq;
    }

    public void setMeyvekq(int meyvekq) {
        this.meyvekq = meyvekq;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Mehsul mehsul = (Mehsul) o;
        return ickisayi == mehsul.ickisayi && sirniyyatsayi == mehsul.sirniyyatsayi &&
                meyvekq == mehsul.meyvekq && icki.equals(mehsul.icki) && sirniyyat.equals(mehsul.sirniyyat) &&
                meyve.equals(mehsul.meyve);
    }

    @Override
    public int hashCode() {
        return Objects.hash(icki, sirniyyat, meyve, ickisayi, sirniyyatsayi, meyvekq);
    }
}