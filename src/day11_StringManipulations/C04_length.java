package day11_StringManipulations;

import java.util.Locale;
import java.util.Scanner;

public class C04_length {
    public static void main(String[] args) {

        //Kulanıcıdan ismini alıp bas harfini ve son harfini Buyuk harflerle yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim= scan.nextLine();

        System.out.println("ilk harf" + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(0));
        System.out.println("son harf" + isim.toUpperCase(Locale.forLanguageTag("tr")).charAt(isim.length()-1));

        String str1="";
        System.out.println(str1.length()); //0

        String str2=null;
        System.out.println(str2.length());//calıstırıldıgında hata verir

        String str3;
        //System.out.println(str3);
        //str3 ile str2 ye deger atanmamıstır
        //str2 null pointer ile isaretlendiginden java durumun kontrol altında oldugunu bilir
        //ve geriye kalan kodun calısmasına engel olmaz
        //ancak str3'e bir deger ataması olmayinca java altini kırmızı cizer
        //ve bu durum düzeltilinceye kadar kodun geriye kalanının calısmasına izin vermez

    }

}
