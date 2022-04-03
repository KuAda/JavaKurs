package day23_multiDimensionsArrays;

import java.util.Scanner;

public class C07_MDArrays {
    public static void main(String[] args) {
        //Soru 5) Kullanicidan bir cumle isteyin ve cumledeki kelime sayisini yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir cumle girin");
        String cumle= scan.nextLine();

        String arr[]=cumle.split(" ");

        System.out.println("girdiginiz cumledeki kelime sayısı : " + arr.length);
    }
}
