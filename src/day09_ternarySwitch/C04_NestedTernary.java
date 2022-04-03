package day09_ternarySwitch;

public class C04_NestedTernary {
    public static void main(String[] args) {

        // verlen sayinin pozitif mi negatif mi oldugunu kontrol edip
        // 0 veya pozitif sayi ise tek veya cift
        //negatif sayi ise -100 'den buyuk veya kucuk
        //oldugunu belirleyen bir ternary yazınız

        int sayi=20;
        if (sayi>=0){
            if (sayi%2==0){
                System.out.println("sayi pozitif cifttir");
            }else {
                System.out.println("sayi negatif tektir");
            }

        }else {
            if (sayi<=-100){
                System.out.println("sayi -100'den kucuk negatif ");
            }else {
                System.out.println("sayi -100'den buyuk negatif");
            }

        }

        String sonuc= sayi>=0 ?
                (sayi%2==0 ? "pozitif cift sayi" : "pozitif tek sayi"):
                (sayi<=-100) ?"-100'den kucuk negatif" :"-100'den buyuk pozitif";
        System.out.println(sonuc);
    }
}
