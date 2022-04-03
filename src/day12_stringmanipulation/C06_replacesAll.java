package day12_stringmanipulation;

import java.util.Scanner;

public class C06_replacesAll {

    public static void main(String[] args) {

        //kullanıcıdan isim-soyisim bilgisini alıp
        //butun harfleri * yapalım

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isim ve soyisminizi giriniz");
        String isimsoyisim=scan.nextLine();

        System.out.println(isimsoyisim.replaceAll("\\S","*"));

    }
}
