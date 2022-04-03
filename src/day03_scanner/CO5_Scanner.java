package day03_scanner;

import java.util.Scanner;

public class CO5_Scanner {
    public static void main(String[] args) {

        //Soru 3) Kullanicidan yaricap isteyip
        // cemberin cevresini ve dairenin alanini hesaplayip yazdirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen cemberin yaricapini giriniz");

        double yaricap= scan.nextDouble();

        System.out.println("Girdiginiz yaricap :" + yaricap);
        System.out.println("Dairenin alanı : " + 3.14*yaricap*yaricap);
        System.out.println("cemberin cevresi :" + 2*3.14*yaricap);

    }
}
