package day15_methodCreation;

import java.util.Scanner;

public class C03_MethodCreation {

    public static void main(String[] args) {

        // kullanicidan bir kelime isteyin
        // eger kelime 3 harften kisa ise "kelime cok kisa" yazdirin
        // eger kelime 3,4 veya 5 harfli ise harf sayisini ve
        // kelimenin tersten yazilisini yazdirin
        // eger 5 harften uzunsa "kelime cok uzun" yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String kelime=scan.next();
        int harfSayisi=kelime.length();

        if (harfSayisi<3){
            System.out.println("kelime cok kisa");
        }else if(harfSayisi==3){
            ucHarfiTersinecevir(kelime);
        }else if (harfSayisi==4){
            dortHarfiTersinecevir(kelime);
        }else if (harfSayisi==5){
            besHarfiTersinecevir(kelime);
        }else{
            System.out.println("kelime cok uzun");
        }




    }

    private static void besHarfiTersinecevir(String kelime) {
        String terskelime=
                kelime.substring(4)+
                kelime.substring(3,4)+
                        kelime.substring(2,3)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi :" + kelime.length());
        System.out.println("kelimenin tersten yazilisi :" + terskelime);

    }

    private static void dortHarfiTersinecevir(String kelime) {
        String terskelime=
                kelime.substring(3)+
                kelime.substring(2,3)+
                        kelime.substring(1,2)+
                        kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi :" + kelime.length());
        System.out.println("kelimenin tersten yazilisi :" + terskelime);

    }

    private static void ucHarfiTersinecevir(String kelime) {
        String terskelime=
                kelime.substring(2)+
                kelime.substring(1,2)+
                kelime.substring(0,1);
        System.out.println("girdiginiz kelimedeki harf sayisi :" + kelime.length());
        System.out.println("kelimenin tersten yazilisi :" + terskelime);

    }
    // 1- method olusturmak icin methodun adını yazarız
    // 2- methoda giderken goturmem gereken variable varsa, bunu mehoda eklemeliyiz


}
