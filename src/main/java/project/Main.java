package project;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Main {
    private static final Scanner SC = new Scanner(System.in);
    public static void main(String[] args) {
        while (true) {
            System.out.println("============> ARAZ Supermarketə Xoş Gəlmisiniz <============");
            Alıcı alıcı = new Alıcı();
            System.out.print("Adınız :" + " ");
            alıcı.setName(SC.next());
            System.out.print("Soyadınız :" + " ");
            alıcı.setSurname(SC.next() + "\n");
            System.out.println("Hal-hazırda olan mallarımız : " + "\n");

            Mehsul mehsul = new Mehsul();

            BigDecimal sumM = BigDecimal.valueOf(0);
            BigDecimal sumsay1 = BigDecimal.valueOf(0);
            BigDecimal sumI = BigDecimal.valueOf(0);
            BigDecimal sumsay2 = BigDecimal.valueOf(0);
            BigDecimal sumS = BigDecimal.valueOf(0);
            BigDecimal sumsay3 = BigDecimal.valueOf(0);
            BigDecimal totalIcki = BigDecimal.valueOf(0);
            BigDecimal totalMeyve = BigDecimal.valueOf(0);
            BigDecimal totalSirniyyat = BigDecimal.valueOf(0);

            System.out.println("İçkilər");
            for (Icki icki : Icki.values()) {
                System.out.print(icki.name() + "-" + icki.qiymet + "; ");
            }
            System.out.println();
            System.out.println("Zəhmət olmasa istədiyiniz içkilərin adını və sayını qeyd edin. " +
                    "Bütün içkilərinizin adlarını qeyd etdikdən sonra 'stop' yazın.");
            int count = 1;
            while (SC.hasNextLine()) {
                String i = SC.next();
                if ( i.equalsIgnoreCase("STOP") ) {
                    break;
                } else {
                    mehsul.setIcki(i);
                    mehsul.setIckisayi(SC.nextInt());
                }
                for (Icki icki : Icki.values()) {
                    if ( Objects.equals(mehsul.getIcki(), icki.name()) ) {
                        totalIcki = icki.getQiymet().multiply(BigDecimal.valueOf(mehsul.getIckisayi()));
                        sumI = sumI.add(totalIcki);
                        sumsay1 = sumsay1.add(BigDecimal.valueOf(mehsul.getIckisayi()));
                    }
                }
                System.out.println(count + ". " + mehsul.getIcki() + " - " + mehsul.getIckisayi() + " - " + totalIcki);
                count++;
            }
            System.out.println();
            System.out.println("Meyvələr");
            for (Meyvə meyve : Meyvə.values()) {
                System.out.print(meyve.name() + "-" + meyve.qiymet + "; ");
            }
            System.out.println();
            System.out.println("Zəhmət olmasa istədiyiniz meyvələrin adını və sayını qeyd edin"
                    + "Bütün meyvələrinizin adlarını qeyd etdikdən sonra 'stop' yazın.");
            while (SC.hasNextLine()) {
                String m = SC.next();
                if ( m.equalsIgnoreCase("STOP") ) {
                    break;
                } else {
                    mehsul.setMeyve(m);
                    mehsul.setMeyvekq((int) SC.nextDouble());
                }
                for (Meyvə meyvə : Meyvə.values()
                ) {
                    if ( Objects.equals(mehsul.getMeyve(), meyvə.name()) ) {
                        totalMeyve = meyvə.getQiymet().multiply(BigDecimal.valueOf(mehsul.getMeyvekq()));
                        sumM = sumM.add(totalMeyve);
                        sumsay2 = sumsay2.add(BigDecimal.valueOf(mehsul.getMeyvekq()));
                    }
                }
                System.out.println(count + ". " + mehsul.getMeyve() + " - " + mehsul.getMeyvekq() + " - " + totalMeyve);
                count++;
            }
            System.out.println();
            System.out.println("Şirniyyatlar");
            for (Şirniyyat şirniyyat : Şirniyyat.values()) {
                System.out.print(şirniyyat.name() + "-" + şirniyyat.qiymet + "; ");
            }
            System.out.println();
            System.out.println("Zəhmət olmasa istədiyiniz şirniyyatların adını və sayını qeyd edin. " +
                    "Bütün şirniyyatlarınızın adlarını qeyd etdikdən sonra 'stop' yazın.");
            while (SC.hasNextLine()) {
                String s = SC.next();
                if ( s.equalsIgnoreCase("STOP") ) {
                    break;
                } else {
                    mehsul.setSirniyyat(s);
                    mehsul.setSirniyyatsayi(SC.nextInt());
                }
                for (Şirniyyat şirniyyat : Şirniyyat.values()
                ) {
                    if ( Objects.equals(mehsul.getSirniyyat(), şirniyyat.name()) ) {
                        totalSirniyyat = şirniyyat.getQiymet().multiply(BigDecimal.valueOf(mehsul.getSirniyyatsayi()));
                        sumS = sumS.add(totalSirniyyat);
                        sumsay3 = sumsay3.add(BigDecimal.valueOf(mehsul.getSirniyyatsayi()));
                    }
                }
                System.out.println(count + ". " + mehsul.getSirniyyat() + " - " + mehsul.getSirniyyatsayi() +
                        " - " + totalSirniyyat);
                count++;
            }

            System.out.println("\t\t\t    ARAZ \t\t\t");
            System.out.println("\t\t\t SuperMarket \t\t\t");
            System.out.println();

            DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("EEEE, HH:mm:ss a, MMM dd, yyyy");
            LocalDateTime localDateTime = LocalDateTime.now();
            String date = dateTimeFormatter.format(localDateTime);
            System.out.println(date);

            System.out.println();

            random();

            System.out.println();

            System.out.println(alıcı);

            System.out.println("SS\t\t" + "sayi\t\t" + "deyeri" + " umumi mebleg");

            BigDecimal total = sumI.add(sumM).add(sumS);

            System.out.println("1. Ümumi içkilər " + " - " + sumsay1 + " ədəd" + " - " + sumI);
            System.out.println("2. Ümumi Meyvələr " + " - " + sumsay2 + " kiloqram" + " - " + sumM);
            System.out.println("3. Ümumi Sirniyyatlar " + " - " + sumsay3 + " ədəd" + " - " + sumS);

            System.out.println("Alınan malın ümumi dəyəri : " + total);

            System.out.print("Verəcəyiniz pulu qeyd edin : ");
            BigDecimal end = SC.nextBigDecimal();

            System.out.println("Qalıq pulunuz : " + end.subtract(total));

            System.out.println();

            System.out.println("============> Ümidvarıq alış-verişdən razı qaldınız <============");
            System.out.println();
            System.out.println();
        }
    }

    private static void random() {
        int pick = new Random().nextInt(Satıcı.values().length);
        System.out.println(Satıcı.values()[pick]);
    }
}