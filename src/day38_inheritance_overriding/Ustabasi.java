package day38_inheritance_overriding;

public class Ustabasi extends Isci {
    public String statu="Ustabasi";
    public String haklar="Ustabasi haftada birgün extra tatil hakkina sahiptir";

    public void mesai(){

        System.out.println("Ariza varsa Ustabasi extra ucret almadan calisir");
    }
    public void maasHesapla(){

        System.out.println("Ustabasi 30 gun * 8 saat * 12 euro=" +(30*8*12)+"Euro maas alir");

    }

    public static void main(String[] args) {
        /*
        Icinde oldugumuz Class dan klasik haliyle bir obje olusturursak
        o obje ile cagirdigimiz variable ve methodlara
        Java once icinde bulundugumuz class a bakar
        aradigimiz class uyesi ,icinde oldugumuz class da varsa bize onu getirir

        YOKSA;
        parent classlara bakar , ilk buldugunu getirir
         */

        Ustabasi yasin=new Ustabasi();
        System.out.println(yasin.statu);//Ustabasi
        System.out.println(yasin.haklar);//Ustabasi haftada birgün extra tatil hakkina sahiptir
        System.out.println(yasin.ikramiye);//Isciler yilda bir ikramiye alirlar
        System.out.println(yasin.izin);//Tum personel yilda 4 hafta izne sahiptir
        yasin.maasHesapla();
        yasin.mesai();

        /*
        Eger isci olarak ozelliklerini gormek istersek
         */

        Isci ahmet=new Ustabasi();
        System.out.println(ahmet.statu);//Isci
        System.out.println(ahmet.haklar);//Isciler Kidem tazminati alirlar
        System.out.println(ahmet.ikramiye);//Isciler yilda bir ikramiye alirlar
        System.out.println(ahmet.izin);//Tum personel yilda 4 hafta izne sahiptir
        ahmet.maasHesapla();
        ahmet.mesai();

        /*
        siz bir objeyi hangi class dan tanimlarsaniz o class a ait ozelliklere sahip olur
         */
        Personel adem=new Ustabasi();
        System.out.println(adem.statu);//Isci
        System.out.println(adem.haklar);//Isciler Kidem tazminati alirlar
        //System.out.println(adem.ikramiye);//Isciler yilda bir ikramiye alirlar
        System.out.println(adem.izin);//Tum personel yilda 4 hafta izne sahiptir
        adem.maasHesapla();
        adem.mesai();

        /*
         Personel adem=new Ustabasi();//Bu bir usta objesidir
         Personel adem=new Personel();//Bu Personel objesidir
         */

        /*
        Personel adem=new Ustabasi();

        adem in data turu Personel'dir.
        boylece biz adem i ne olarak isimlendirdigimizi bilebiliriz
        Ancak ben adem in ustabasi oldugunu bilmiyorum cunku constructor i ustabasi
        Ama bu yazim formati ile birlikte sahip oldugu ortak ozellikleri vurgulamak istiyorum

        Bu kullanim seklinde olusturulan obje data turu secilen class
        ve onun parent class'larindaki variable lari kullanabilir
         */

    }
}
