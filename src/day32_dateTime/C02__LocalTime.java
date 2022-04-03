package day32_dateTime;

import java.time.LocalTime;

public class C02__LocalTime {
    public static void main(String[] args) {

        LocalTime tm=LocalTime.now();
        System.out.println(tm);//22:10:57.194338200
        //bir islemin ne kadar surede bittigini bulmak
        // istersek islemden once ve sonra birer time objesi olusturup
        // aradaki farki hesaplayabiliriz

        int sayi=0;
        for (int i = 0; i <100000 ; i++) {
            sayi+=i;
        }
        LocalTime tmLoopSonrasi=LocalTime.now();
        System.out.println(tmLoopSonrasi);//22:15:48.293352600

        double nano1=tm.getNano();
        double nano2=tmLoopSonrasi.getNano();

        System.out.println("islem " + (nano2-nano1)+ "nano saniyede bitti");

        //ileri veya geri gidebiliriz
        System.out.println(tm.plusMinutes(1000));//15:00:04.627643500

        //istersek zone Id kullanarak istedigimiz bolgenin saati icin de obje olusturabiliriz

    }
}
