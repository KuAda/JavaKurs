package day10_switch_StringManipulation;

import java.util.Scanner;

public class C02_SwitchMevsimler {

    public static void main(String[] args) {
        //Kulanıcıdan kacinci ay oldugunu alıp mevsimi yazdıran bir switch olusturun

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen kacıncı ay oldunu giriniz");
        int ayNo= scanner.nextInt();

        switch (ayNo) {
            case 12:
            case 1:
            case 2:
                System.out.println("KIS");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("İLKBAHAR");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("YAZ");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("SONBAHAR");
                break;

            default:
                System.out.println("Lutfen gecerli bir ay numarasi giriniz");
        }
    }
}
