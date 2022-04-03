package day15_methodCreation;

public class C09_MethodCreation {

    public static void main(String[] args) {

        String isim="oguzhan";
        String soyisim="BALKAYA";
        String kkNo="1234567890123456";

        isimSoyisimGizle(isim,soyisim);
        krediKartiGizle(kkNo);
    }
    public static void krediKartiGizle(String kkNo) {

        String yenikkno="**** **** ****" + kkNo.substring(12);


    }

    public static void isimSoyisimGizle(String isim, String soyisim) {

        String yeniisim=isim.substring(0,1).toUpperCase()+
                isim.substring(1).replaceAll("\\S","*");

        String yenisoyisim=soyisim.substring(0,1).toUpperCase()+
                soyisim.substring(1).replaceAll("\\S","*");



    }
}
