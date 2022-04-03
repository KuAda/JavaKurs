package day24_lists;


import java.util.ArrayList;
import java.util.List;

public class C02_Remove {
    public static void main(String[] args) {

        List<String> isimler=new ArrayList<>();
        isimler.add("Aykut");
        isimler.add("Yusuf");
        isimler.add("Ilker");
        isimler.add("Oguzhan");
        System.out.println(isimler);//[Aykut, Yusuf, Ilker, Oguzhan]

        //remove (istenenObject) methodu istenen elementi kaldirip bize true/false doner
        //eger remove islemin yapildigini kontrol rtmek istiyorsaniz
        // method u boolean bir variable atayabilirsiniz

        boolean sonuc=isimler.remove("Oguzhan");//true

        //sonucu kullanıcıya yazdirmak isterseniz
        // if/else ile istediginiz degerlendirmeyi yapabilirsiniz

        sonuc=isimler.remove("Berk");
        if (sonuc==true){
            System.out.println("istediginiz isim silindi");
        }else {
            System.out.println("istediginiz isim listede olmadigindan silinemedi");
        }
        System.out.println(isimler);//[Aykut, Yusuf, Ilker]

        //remove (index)yazdigimizda sildim/silmedim ihtimali kalmaz
        //bize remove edilen elementi dondurur

        System.out.println(isimler.remove(1));// Yusuf u siler ve
                                                    //delil olarak Yusuf un ismini bize dondurur

        //yazdırsakta yazdirmasakta liste degisti ve 1. index teki element silindi
        System.out.println(isimler);
        //[Aykut, Ilker]






    }
}
