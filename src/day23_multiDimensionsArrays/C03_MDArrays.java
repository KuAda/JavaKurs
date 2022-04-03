package day23_multiDimensionsArrays;

public class C03_MDArrays {
    public static void main(String[] args) {
        //boyutlari belirli bir arrayi elementleri girmeden olusturalim

        //bir okul icinde 24 ogrenci olan 8 sınıf vardır

        int arr [][]=new int[8][24];

        //bir ilcede herbirinde 24 ogrencilik ,8 sinif bulunan 5 okul vardir

        int ilce[][][]=new int[5][8][24];

        //bir okulda 3 tane 24 kişilik ,2 tane 22 kişilik sınıf vardır

        int sınıf24[][]=new int[3][24];
        int sınıf22[][]=new int[2][22];

        //olustururken elementleri atama yaparsak farkli uzunluktaki inner array'ler tanimlayabiliriz

        int arr1[][]={{3,1,7,5},{6,10}};





    }
}
