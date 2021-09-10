package project;

public enum Satıcı {

    Kassir1("Arzu", "Mammadova", "Qadın"),
    Kassir2("Elvin", "Goyceyev", "Kişi"),
    Kassir3("Vugar", "Karimov", "Kişi"),
    Kassir4("Leyla", "Haciyeva", "Qadın");

    String ad, soyad, cins;

    Satıcı(String ad, String soyad, String cins) {
        this.ad = ad;
        this.soyad = soyad;
        this.cins = cins;
    }

    public String getAd() {
        return ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public String getCins() {
        return cins;
    }

    @Override
    public String toString() {
        return "Kassirin adı : " + ad +
                ", soyadı : " + soyad;
    }
}