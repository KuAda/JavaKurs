package day07_ifElseStatement;

import java.util.Scanner;

public class C04_HaftaiciHaftaSonu {
    public static void main(String[] args) {

       // Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
       // Ornek:  gun=Pazar output = “Hafta sonu”
        // gun=Sali output = “Hafta ici”
       //*** String icin equals method’unu kullanin

        //pazar veya cumartesi ise ==> hafta sonu
        //

        //String case sensitive'dir
        // yani pazar ,PAZAR , Pazar bunlar hep farkli kelimelerdir

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun ismini giriniz");
        String gunIsmi=scan.next().toLowerCase(); //

        if (gunIsmi.equals("pazar"));
    }
}
