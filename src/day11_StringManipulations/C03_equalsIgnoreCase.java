package day11_StringManipulations;

import java.util.Scanner;

public class C03_equalsIgnoreCase {
    public static void main(String[] args) {

        // kullanıcıya derse katılıp katılmak istemedigini sorun
        //evet derse cevabını ve "derse katılmınız alınmıstır" yazdırın
        //hayır derse cevabını ve "Sonraki derslerimize bekleriz" yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("Derse katılmak ister misiniz? \nEvet veya Hayir yaziniz ");
        String cevap=scan.next();

        if (cevap.equalsIgnoreCase("evet")) {
            System.out.println("cevabınız: " + cevap +  "Derse katılımınız onaylanmıstır");
        } else if (cevap.equalsIgnoreCase("hayır")){
            System.out.println("cevabınız : " + cevap  +  "Sonraki derslerimize bekleriz");
        }else {
            System.out.println("Lutfen evet veya hayır yazdırın");
        }
    }
}
