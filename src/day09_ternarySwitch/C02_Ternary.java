package day09_ternarySwitch;

import java.util.Scanner;

public class C02_Ternary {
    public static void main(String[] args) {

        //Ternary ile yapılan tum islemler if else ile de yapılabilir
        //ternary tercih etme sebebi yapının basit ve anlasılabilir olmasıdır
        //Ternary içerisinde komplex kod olmaz
        //sadece sunuc yada bizi sonuca goturen basıt islemler olabilir

        // kullanıcıdan bir tam sayi alip tek mi cift mi

        Scanner scan =new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tamsayi giriniz");
        int sayi= scan.nextInt();

        if (sayi%2==0){
            System.out.println("sayi cifttir");
        }else {
            System.out.println("sayi tektir");
        }
        System.out.println(sayi%2==0 ?"Sayi cifttir" : "sayi tektir");
    }
}
